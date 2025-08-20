
public class HashTable {
	int [] arr;
	int size;
	
	public HashTable(int size) {
		this.size=size;
		arr=new int [this.size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	public void add(int value) {
		arr[value % size]=value;
	}
	
	public boolean Search(int value) {
		return arr[value % size]==value;
	}
	
	public static void main(String[] args) {
		HashTable ht= new HashTable(5);
		ht.add(10);
		ht.add(20);
		ht.add(30);
		ht.add(40);
		ht.add(50);
	}
	

}
