package LinkedListPKG;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		list.insertAtHead(5);
		list.insertAtHead(10);
		list.insertAtHead(15);
		list.insertAtHead(20);
		list.insertAtHead(7);
		list.insertAtHead(14);
		list.insertAtHead(13);
		list.insertAtHead(2);
		
		//System.out.println(list);
		//System.out.println(list.length());
		//list.deleteFromHead();
		//System.out.println(list);
		System.out.println(list.find(200));
	}

}
