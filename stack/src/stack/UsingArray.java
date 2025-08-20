package stack;

public class UsingArray {
	static final int Max=1000;
	int top;
	int a []=new int[Max];
	
	boolean IsEmpty() {
		return (top<0);
	}
	//initialize the top
	UsingArray(){
		top=-1;
	}
	
	boolean push(int x) {
		if(top>=Max-1) {
			System.out.println("Stack is overflow");
			return false;
		}else {
			a[++top]=x;
			System.out.println(x +" pushed into stack");
			return true;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("stack is underflow");
			return 0;
	}else {
		int x=a[--top];
		return x;
	}
	}
	
	int peek() {
		if(top<0) {
			System.out.println("stack is empty");
			return -1;
		}else {
			int x=a[top];
			System.out.println("element poped "+x);
			return x;
		}
	}
	
	void print() {
		for(int i=top;i>-1;i--) {
			System.out.println("element are " +a[i]);
		}
	}
	
	public static void main(String[] args) {
		UsingArray ua=new UsingArray();
		ua.push(10);
		//ua.push(20);
		//ua.push(30);
		//ua.push(40);
		//ua.push(50);
		System.out.println();
		
		System.out.println("POP THE ELEMENT");
		System.out.println(ua.pop() + " Popped from stack");
		System.out.println(ua.pop() + " Popped from stack");
		System.out.println();
		
		System.out.println("PEEK THE TOP ELEMENT");
		System.out.println(" top element from stack "+ ua.peek());
		System.out.println();
		
		System.out.println("Element present in stack ");
		ua.print();
	}
	
}


	


