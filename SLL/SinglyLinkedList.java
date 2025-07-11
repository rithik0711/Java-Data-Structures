package SLL;

public class SinglyLinkedList {
    Node start;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insertBeginning(int v){
        Node newNode = new Node(v);
        newNode.next=start;
        start=newNode;
    }
    public void insertEnd(int v){
        Node newNode = new Node(v);
        if(start==null){
            start=newNode;
            return ;
        }
        Node end=start;
        while(end.next!=null){
            end=end.next;
        }
        end.next=newNode;
    }
    public int sizeOfNode(){
        int count=0;
        Node temp=start;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void insertPosition(int v, int pos){
        Node newNode = new Node(v);
        Node temp = start;
        int size=sizeOfNode();
        if(pos==1){
            insertBeginning(v);
            return ;
        }
        if(pos<=0 || pos>size){
            System.out.println("Error you cannot insert at "+pos);
            return ;
        }
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteBeginning(){
        if(start==null){
            System.out.println("Can't delete the information");
            return ;
        }
        if(start.next==null){
            start=start.next;
            System.out.println("List Empty Node Deleted");
            return ;
        }
        start=start.next;
    }
    public void deleteEnd(){
        if(start==null){
            System.out.print("There is no node to delete");
            return ;
        }
        Node temp = start;
        while(temp.next.next!=null) temp=temp.next;
        temp.next=null;
    }
    public void deletePosition(int pos){
        int size=sizeOfNode();
        if(pos==1){
            deleteBeginning();
            return ;
        }
        if(pos<=0 || pos>size){
            System.out.println("Error you cannot delete at "+pos);
            return ;
        }
        Node temp = start;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public int search(int val){
        Node temp = start;
        int pos=0;
        while(temp!=null){
            pos++;
            if(temp.data==val){
                deletePosition(pos);
                insertBeginning(val);
                return pos; 
            }
            temp=temp.next;
        }
        return -1;
    }
    public void display(){
        Node dis = start;
        while(dis!=null){
            if(dis.next==null){
                System.out.println(dis.data);
                return;
            }
            System.out.print(dis.data+"->");
            dis=dis.next;
        }
    }
}
