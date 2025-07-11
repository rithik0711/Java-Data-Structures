package DLL;

public class Main {
    public static void main(String[] args)
    {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Displaying empty list (back to front):");
        list.displayBack();   // Should show "Null"

        System.out.println("Inserting 30 at the end...");
        list.insertEnd(30);

        System.out.println("Displaying list (front to back):");
        list.displayFront();  // Should show "30->Null"

        System.out.println("Attempting to delete value 2...");
        list.delete(2);       // Should print "Value not found."

        System.out.println("Displaying list (back to front):");
        list.displayBack();   // Should show "30->Null"
    }
}
