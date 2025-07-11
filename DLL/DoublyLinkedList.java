package DLL;
public class DoublyLinkedList {
    class  Node {
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    Node head;
	Node tail;
	public void insertBegin(int data)
	{
	    Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
		}
		else {
			head.prev=newNode;
			newNode.next=head;
			head=newNode;
		}
	}
	public void insertPosition(int position, int data)
    {
        Node newNode = new Node(data);
    
        if (position == 0) {
            insertBegin(data);
            return;
        }
    
        Node current = head;
        int i = 0;
    
        while (current != null) {
            if (i == position) {
                if (current.prev != null) {
                    current.prev.next = newNode;
                }
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev = newNode;
                return;
            }
            current = current.next;
            i++;
        }
    
        // If position is greater than the list length, add at end
        insertEnd(data);
    }

	public void insertEnd(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
		}
		else
		{
    		tail.next=newNode;
    		newNode.prev=tail;
    		tail=newNode;
		}
	}
	public void deleteStart()
	{
		if(head==null)
		{
			System.out.print("List is Empty");
			return;
		}
		head=head.next;
		if(head!=null)
		{
			head.prev=null;
		}
		else {
			tail=null;
		}
	}
	public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
    
        if (head.data == data) {
            deleteStart();
            return;
        }
    
        Node current = head;
    
        while (current != null && current.data != data) {
            current = current.next;
        }
    
        if (current == null) {
            System.out.println("Value not found.");
            return;
        }
    
        if (current == tail) {
            deleteEnd();
            return;
        }
    
        // Middle node
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }


	public void deleteEnd() {
		if (tail == null) {
			System.out.println("List is empty.");
			return;
		}


		tail = tail.prev;

		if (tail != null)
			tail.next = null;
		else
			head = null;
	}
	public void displayFront()
	{
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.println("Null");
	}
	public void displayBack()
	{
		Node current=tail;
		while(current!=null)
		{
			System.out.print(current.data+"->");
			current=current.prev;
		}
		System.out.println("Null");

	}
}
