package D05_LinkedList;

public class P001_LinkedListImplementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        //Iterative Traversal
        printNode(head);
        //Recursively traversal
        printNodeRecursively(head);

    }

    static void printNode(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

    static void printNodeRecursively(Node head){
        if(head==null)
            return;
        System.out.println(head.data);
        printNodeRecursively(head.next);
    }
}
