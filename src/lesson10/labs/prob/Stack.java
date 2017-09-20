package lesson10.labs.prob;

public class Stack<T> {
	
	private int size = 0;
	private int top = -1;
	
	private T[] myArr = (T[]) new Object[10];
	
	public T pop(){
		if(top == -1){
			System.out.println("Stack is Empty");
		}
		T t = myArr[top];
		top--;
		size--;
		return t;
	}
	
	public void push(T t){
		top++;
		myArr[top] = t;
		size++;
	}
	
	public T peek(){
		return myArr[top];
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1 = new Stack<Integer>();
		System.out.println(stack1.isEmpty());
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		System.out.println(stack1.peek());
		System.out.println(stack1.getSize());
		System.out.println(stack1.pop());
		System.out.println(stack1.peek());
		System.out.println(stack1.getSize());
		System.out.println(stack1.isEmpty());
	}

}
