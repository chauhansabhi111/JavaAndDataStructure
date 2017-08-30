package com.preparation.datastructure.tree;
import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 * @author hug46010
 *
 */
class Number {
    int num;
    int den;
    Number(){}
    Number(int num, int den) {
        this.num = num;
        this.den = den;
    }
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return num+"/"+den+"";
    }
}
public class PrintPByQBinaryTreeProblem {public static void main(String[] args) {
    int num = 1;
    int den = 1;
    int index =11;
   System.out.println(findNumber(num, den, index));
}

private static Number findNumber(int num, int den, int index) {
    if (index == 0) {
        return new Number(1, 1);
    }
    Queue<Number> q = new LinkedList<>();
    Number n = new Number(num, den);
    q.add(n);
    int i = 0;
    while (!q.isEmpty()) {
        Number temp = q.poll();
        if (i == index) {
            return temp;
        }
        q.add(new Number(temp.num, temp.num + temp.den));
        q.add(new Number(temp.num + temp.den, temp.den));
        i++;
    }
    return new Number();
}}
