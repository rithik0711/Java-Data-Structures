package SLL;

public class Main {
    public static void main(String[] args) {
		SinglyLinkedList list1 = new SinglyLinkedList();
		System.out.print("Inserting 10 at the beginning: ");
		list1.insertBeginning(10);
		list1.display();
		System.out.print("Inserting 20 at the beginning: ");
		list1.insertBeginning(20);
		list1.display();
		System.out.print("Inserting 30 at the beginning: ");
		list1.insertBeginning(30);
		list1.display();
		System.out.print("Inserting 40 at the End: ");
		list1.insertEnd(40);
		list1.display();
		System.out.print("Inserting 50 at the End: ");
		list1.insertEnd(50);
		list1.display();
		System.out.print("Inserting 60 at the End: ");
		list1.insertEnd(60);
		list1.display();
		System.out.print("Inserting 100 at the position 5: ");
		list1.insertPosition(100,5);
		list1.display();
		System.out.print("Delete Beginning node: ");
		list1.deleteBeginning();
		list1.display();
		System.out.print("Delete End node: ");
		list1.deleteEnd();
		list1.display();
		System.out.print("Delete the node at the position 3: ");
		list1.deletePosition(3);
		list1.display();
		System.out.print("Search 10 in the list position: ");
		System.out.println(list1.search(10));
		list1.display();
	}
}
