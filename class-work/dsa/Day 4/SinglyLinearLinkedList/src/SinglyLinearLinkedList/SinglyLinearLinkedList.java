package SinglyLinearLinkedList;

public class SinglyLinearLinkedList {
	
	static class node{
		int data;
		node next;
		public node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	node head;
	
	public SinglyLinearLinkedList() {
		this.head = null ;
	}
	
	public void addFirst(int data) {
		node nn = new node(data);
		
		if(head == null)
		{
			head = nn ; 
		}
		else
		{
			nn.next = head ;
			head = nn;
		}
		
	}
	
	public void displayList() {
		if(head == null ) {
			System.out.println("List is Empty ... ");
		}
		else 
		{
			System.out.println("List : ");
			node trav = head ;
			while (trav != null) {
				System.out.print(" ----> "+trav.data);
				trav = trav.next;
			}
			System.out.println();
		}
	}
	
	public void addLast(int data) {
		node nn = new node(data);
		if(head == null) {
			head = nn ;
		}
		else 
		{
			node trav = head ;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = nn ;  
		}
	}
	
	public void addAtPosition(int data, int pos) {
		node nn = new node(data);
		if(head == null) {
			head = nn;
		}
		else if (pos <= 1) {
			nn.next = head ;
			head = nn ;
		}
		else 
		{
			node trav = head;
			for (int i = 1 ; i < pos-1 && trav.next != null ; i++) {
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;
		}
	}
	
	public void delFirst() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else 
		{
			head = head.next;
		}
	}
	
	public void delLast() {
		if(head == null) {
			System.out.println("List is empty");
		}else if(head.next == null)
		{
			head = null ;
		}
		else 
		{
			node trav = head ;
			while (trav.next.next != null)
			{
				trav = trav.next;
			}
			trav.next = null;
		}
	}
	
	public void delAtPosition(int pos)
	{
		if (head == null) //If the List is Empty
			return;
		else if(head.next == null)//If list contains only 1 node 
			head = null;
		else if(pos <= 1) //pos -3 / -1/ 0 / 1
			delFirst();
		else  //If list contains multiple nodes position is < number of node count ex: pos=3
		{
			node trav = head;
			for (int i = 1; i < pos-1 && trav.next.next !=null; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	
}
