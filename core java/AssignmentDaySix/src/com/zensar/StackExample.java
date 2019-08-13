//stack example
package com.zensar;
class OverFlowException extends Exception {
	public OverFlowException()
	{
		super();
	}

}
class UnderFlowException extends Exception{
	public UnderFlowException()
	{
		super();
	}

}

class Stack<T>
{
   private T arr[];
   private int top, size;
   
   public Stack() 
   {
	   super();
	   size=5;
	   arr=(T[]) new Object[size];
	   top=-1;
   }
   public void push(T data) throws OverFlowException 
   {
	   if(isFull())
	   {
		   throw new OverFlowException();
		  
	   }
	   else 
	   {
		   arr[++top]=data;  
	   }
	   
   }
   public T pop() throws UnderFlowException 
   {
	   if(isEmpty())
	   {
		   throw new UnderFlowException();
		   //return null;
	   }
	   else {
		   return arr[top--];
	}
	   
   }
   public boolean isFull() 
   {
	   return top==size-1;
   }
   public boolean isEmpty() 
   {
	   return top==-1;
   }
   
}

public class StackExample 
{
	public static void main(String[] args) 
	{
	   Stack<Integer> stack=new Stack<>();
	   Stack<String> stack2=new Stack<>();
	   try {
		stack.push(34);
		stack2.push("tom");
		   stack.push(364);
		   stack.push(123);
		   stack2.push("nishita");
	} catch (OverFlowException e) {
		// TODO Auto-generated catch block
		System.out.println("Stack Full");
		e.printStackTrace();
	}
	   try {
		System.out.println(stack.pop());
		 System.out.println(stack2.pop());
		   System.out.println(stack.pop());
	} catch (UnderFlowException e) {
		// TODO Auto-generated catch block
		System.out.println("Stack Empty");
		e.printStackTrace();
	}
	  
	   
	}
}
