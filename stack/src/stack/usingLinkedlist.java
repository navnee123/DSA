package stack;

public class usingLinkedlist {
	StackNode root;
	
	static class StackNode {
		int data;
		StackNode next;
		
		StackNode(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	 public boolean isEmpty() {
		if(root==null) {
			return true;
		}else
			return false;
	}
	 
	 public void push(int data) {
		 StackNode node =new StackNode(data);
		 
		 if(root==null) {
			 root=node;
		 }else {
			 StackNode temp=root;
			 root=node;
			 node.next=temp;
		 }
		 System.out.println(data+" is pushed");
	 }
	 
	 
	  public int pop() {
		 int data=Integer.MIN_VALUE;
		 if(root==null) {
			 System.out.println("Stack is empty");
		 }else {
			 data=root.data;
			 root=root.next;
			 
		 }
		 return data;
	 }
	  
	  public int peek() {
		  if(root==null) {
			  System.out.println("stack is empty");
			  return Integer.MIN_VALUE;
		  }else {
			  return root.data;
		  }
	  }
	  
	  void print() {
		StackNode current=root;
		while(current!=null) {
			System.out.println("Element is present "+current.data);
			current=current.next;
		}
	  }
	  
	  public static void main(String[] args) {
		
		  usingLinkedlist ul=new usingLinkedlist();
		  ul.push(10);
		  ul.push(20);
		  ul.push(30);
		  ul.push(40);
		  ul.print();
		 System.out.println(ul.peek());
		 ul.pop();
		 ul.print();
		 System.out.println(ul.peek());
	}

}
