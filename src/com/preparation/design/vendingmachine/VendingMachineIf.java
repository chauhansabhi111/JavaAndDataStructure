package com.preparation.design.vendingmachine;

import java.util.List;

public interface VendingMachineIf 
{
	public long selectItemAndGetPrice(Product item) throws Exception;
	public void insertCoin(Coin coin); 
	public List<Coin> refund(); 
	public Bucket<Product, List<Coin>> collectItemAndChange(); 
	public void reset();
}
