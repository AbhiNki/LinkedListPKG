package LinkedListPKG;

public class DoublyLinkedList {
	private DoublyLinkedNode head;
	
	public void insertAtHead(int data)
	{
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNextNode(this.head);
		if(this.head!=null)
		{
			this.head.setPrevNode(newNode);
		}
		this.head=newNode;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		DoublyLinkedNode current = this.head;
		while(current != null)
		{
			sb.append(current.getData()+" ");
			current= current.getNextNode();
		}
		return sb.toString();
	}
	
}
