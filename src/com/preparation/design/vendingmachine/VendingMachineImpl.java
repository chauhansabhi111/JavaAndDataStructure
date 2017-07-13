package com.preparation.design.vendingmachine;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class VendingMachineImpl implements VendingMachineIf
{
	private Inventory<Coin> cashInventory = new Inventory<Coin>();
	private Inventory<Product> itemInventory = new Inventory<Product>();  
	private long totalSales;
	private Product currentItem;
	private long currentBalance; 

	public VendingMachineImpl(){
		initialize();
	}

	private void initialize(){       
		//initialize machine with 5 coins of each denomination
		//and 5 cans of each Product       
		for(Coin c : Coin.values())
		{
			cashInventory.put(c, 5);
		}

		for(Product i : Product.values())
		{
			itemInventory.put(i, 5);
		}

	}

	@Override
	public long selectItemAndGetPrice(Product item) throws SoldOutException {
		if(itemInventory.hasItem(item)){
			currentItem = item;
			return currentItem.getPrice();
		}
		throw new SoldOutException("Sold Out, Please buy another item");
	}

	@Override
	public void insertCoin(Coin coin) {
		currentBalance = currentBalance + coin.getDenomination();
		cashInventory.add(coin);
	}

	@Override
	public Bucket<Product, List<Coin>> collectItemAndChange() {
		Product item = collectItem();
		totalSales = totalSales + currentItem.getPrice();

		List<Coin> change = collectChange();

		return new Bucket<Product, List<Coin>>(item, change);
	}

	private Product collectItem(){
		if(isFullPaid()){
			if(hasSufficientChange()){
				itemInventory.deduct(currentItem);
				return currentItem;
			}           
		}
		return null;
	}

	private List<Coin> collectChange() {
		long changeAmount = currentBalance - currentItem.getPrice();
		List<Coin> change = getChange(changeAmount);
		updateCashInventory(change);
		currentBalance = 0;
		currentItem = null;
		return change;
	}

	@Override
	public List<Coin> refund(){
		List<Coin> refund = getChange(currentBalance);
		updateCashInventory(refund);
		currentBalance = 0;
		currentItem = null;
		return refund;
	}


	private boolean isFullPaid() {
		if(currentBalance >= currentItem.getPrice()){
			return true;
		}
		return false;
	}


	private List<Coin> getChange(long amount) {
		List<Coin> changes = Collections.EMPTY_LIST;

		if(amount > 0){
			changes = new ArrayList<Coin>();
			long balance = amount;
			while(balance > 0){
				if(balance >= Coin.QUARTER.getDenomination() 
						&& cashInventory.hasItem(Coin.QUARTER)){
					changes.add(Coin.QUARTER);
					balance = balance - Coin.QUARTER.getDenomination();
					continue;

				}else if(balance >= Coin.DIME.getDenomination() 
						&& cashInventory.hasItem(Coin.DIME)) {
					changes.add(Coin.DIME);
					balance = balance - Coin.DIME.getDenomination();
					continue;

				}else if(balance >= Coin.NICKLE.getDenomination() 
						&& cashInventory.hasItem(Coin.NICKLE)) {
					changes.add(Coin.NICKLE);
					balance = balance - Coin.NICKLE.getDenomination();
					continue;

				}else if(balance >= Coin.PENNY.getDenomination() 
						&& cashInventory.hasItem(Coin.PENNY)) {
					changes.add(Coin.PENNY);
					balance = balance - Coin.PENNY.getDenomination();
					continue;

				}
			}
		}

		return changes;
	}

	@Override
	public void reset(){
		cashInventory.clear();
		itemInventory.clear();
		totalSales = 0;
		currentItem = null;
		currentBalance = 0;
	} 

	public void printStats(){
		System.out.println("Total Sales : " + totalSales);
		System.out.println("Current Product Inventory : " + itemInventory);
		System.out.println("Current Cash Inventory : " + cashInventory);
	}   


	private boolean hasSufficientChange(){
		return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
	}

	private boolean hasSufficientChangeForAmount(long amount){
		boolean hasChange = true;
		try{
			getChange(amount);
		}catch(Exception nsce){
			return hasChange = false;
		}

		return hasChange;
	}

	private void updateCashInventory(List<Coin> change) {
		for(Coin c : change){
			cashInventory.deduct(c);
		}
	}

	public long getTotalSales(){
		return totalSales;
	}


}
