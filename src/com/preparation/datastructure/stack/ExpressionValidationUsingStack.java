package com.preparation.datastructure.stack;

import java.util.HashMap;
import java.util.Map;
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
		expression="{}[]";
		System.out.println(isExpressionValid(expression));
	}
	private static boolean isExpressionValid(String expression)
	{
		String[] tokens=null;
		Map<String,String> map = new HashMap<String,String>();
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
					break;
				case "[":
					stack.push(string);
					break;
				case "(":
					stack.push(string);
					break;
				case ")":
					if(stack.peek().equals("("))
					{
						stack.pop();
					}
					break;
				case "]":
					if(stack.peek().equals("["))
					{
						stack.pop();
					}
					break;
				case "}":
					if(stack.peek().equals("{"))
					{
						stack.pop();
					}
					break;
				}
			}
			if(stack.size()==0)
			{
				return true;
			}
		}
		return false;
	}
}
