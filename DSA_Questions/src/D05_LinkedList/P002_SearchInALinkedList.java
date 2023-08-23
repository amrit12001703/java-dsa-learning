package D05_LinkedList;

public class P002_SearchInALinkedList {

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
        Node temp1=new Node(5);
        Node temp2=new Node(20);
        Node temp3=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        //Iterative Approach
        System.out.println(searchPosition(20,head));

        //Recursive Approach
        System.out.println(searchPositionRecursively(90,head));
    }
    static int searchPosition(int key,Node head){
        int i=0;
        Node curr=head;
        while(curr!=null){
            i++;
            if(curr.data==key)
                return i;
            curr=curr.next;
        }
        return -1;
    }

    static int searchPositionRecursively(int key,Node head){
        if(head==null)
            return -1;
        if(head.data==key)
            return 1;
        else{
            int res=searchPositionRecursively(key,head.next);
            if(res==-1) return -1;
            return res+1;
        }
    }
}
