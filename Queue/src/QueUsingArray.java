
public class QueUsingArray {
	static final int max=1000;
	int [] arr= new int[max];
	
	static int front=-1;
	static int rear=-1;
	
	void EnQueue(int data) {
		if(rear==arr.length-1) {
			System.out.println("Stack is full");
			return;
		}else {
			if(front==-1 && rear==-1) {
				front=rear=0;
			}else {
				rear++;
			}
			arr[rear]=data;
			System.out.println("element "+ data +" added to the queue");
		}
	}
	
	void DeQueue() {
		if(front==-1 || front> rear) {
			System.out.println("Queue is Empty");
			return;
		}
		if(front==rear) {
			front=rear=-1;
		}else {
			front++;
		}
	}
	
	void display() {
		if(front==-1 && rear==-1) {
			System.out.println("Queue is Empty");
			return;
		}
		
		int i;
		for(i=front;i<=rear;i++) {
			System.out.println("Element "+arr[i]);
		}
		return;
	}
	
	void front() {
		if(front==-1 && rear==-1) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Element at front "+arr[front]);
	   return;	
	}
	
	void rear() {
		if(front==-1 && rear==-1) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Element at rear "+arr[rear]);
		return;
	}
	
	
	
	public static void main(String[] args) {
		QueUsingArray Qua =new QueUsingArray();
		Qua.EnQueue(10);
		Qua.EnQueue(20);
		Qua.EnQueue(30);
		Qua.EnQueue(40);
		Qua.display();
		Qua.front();
		Qua.rear();
		
	}

}
