package com.preparation.datastructure.stack;

import java.util.Stack;

/**
 * 	1) Declare a Stack of type String/character.
	2) Now traverse the expression string expression.
	a) If the current character is a opening bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
	b) If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching opening bracket then fine else parenthesis are not balanced.
	3) After complete traversal, if there is some starting bracket left in stack then "not balanced".
 * @author hug46010
 *
 */
public class ExpressionValidationUsingStack {
	
	private static String expression="";
	
	public static void main(String[] args) 
	{
		expression="[[[{{{(((aaaaaaaaaa)))cvcxxcxvfbfdghgfbfdbfdgbfdgfd}xcvxc}xcvxcv}xcvxcv]xcvxc]xcvxcv]";
		System.out.println(expression.length());
		System.out.println(isExpressionValid(expression,4));
	}
	private static int isExpressionValid(String expression,int position)
	{
		String[] tokens=null;
		int openParanthesisCount=0;
		int closeParanthesisCount=0;
		int paranthesisIndex=0;
		Stack<String> stack= new Stack<String>();
		if(expression!=null && !expression.isEmpty() )
		{
			tokens=expression.split("");
			for (int i = 0; i < tokens.length; i++)
			{
				String string = tokens[i];
				switch(string)
				{
				case "{":
					stack.push(string);
					if(position!=openParanthesisCount)
					{
						openParanthesisCount++;
						break;
					}
					break;
				case "[":
					stack.push(string);
					if(position!=openParanthesisCount)
					{
						openParanthesisCount++;
						break;
					}
					break;
				case "(":
					stack.push(string);
					if(position!=openParanthesisCount)
					{
						openParanthesisCount++;
						break;
					}
					break;
				case ")":
					if(stack.peek().equals("("))
					{
						stack.pop();
					}
					if(position!=closeParanthesisCount)
					{
						closeParanthesisCount++;
						break;
					}
					if(closeParanthesisCount==openParanthesisCount && closeParanthesisCount==position)
					{
						paranthesisIndex=i;
						position=-1;
					}
					break;
				case "]":
					if(stack.peek().equals("["))
					{
						stack.pop();
					}
					if(position!=closeParanthesisCount)
					{
						closeParanthesisCount++;
						break;
					}
					if(closeParanthesisCount==openParanthesisCount && closeParanthesisCount==position)
					{
						paranthesisIndex=i;
						position=-1;
					}
					break;
				case "}":
					if(stack.peek().equals("{"))
					{
						stack.pop();
					}
					if(position!=closeParanthesisCount)
					{
						closeParanthesisCount++;
						break;
					}
					if(closeParanthesisCount==openParanthesisCount && closeParanthesisCount==position)
					{
						paranthesisIndex=i;
						position=-1;
					}
					break;
				}
			}
			if(stack.size()==0)
			{
				return paranthesisIndex;
			}
		}
		return -1;
	}
}
