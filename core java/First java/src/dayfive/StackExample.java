//stack example
package dayfive;
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
   public void push(T data) 
   {
	   if(isFull())
	   {
		   System.out.println("Stack full");
	   }
	   else 
	   {
		   arr[++top]=data;  
	   }
	   
   }
   public T pop() 
   {
	   if(isEmpty())
	   {
		   System.out.println("Stack Empty");
		   return null;
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
	   stack.push(34);
	   stack2.push("Sam");
	   stack.push(364);
	   stack.push(123);
	   stack2.push("Akshay");
	   
	   System.out.println(stack.pop());
	   System.out.println(stack2.pop());
	   System.out.println(stack.pop());
	   
	}
}
