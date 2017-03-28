/*
A Node is defined as:
    class Node {
        int data;
        Node next;
    }

Input format
head(int)     //head element of the list is passed

The implementation below requires a class and main function if you'd like to run on your own machine.
*/

boolean hasCycle(Node head) {
    if(head == null || head.next==null){
        return false;
    }

    else{
        Node sptr = new Node();
        Node fptr = new Node();
        sptr = head;
        fptr = head.next;

        while(sptr!=fptr){
            if (fptr == null || fptr.next == null) return false;
            sptr = sptr.next;
            fptr = fptr.next.next;
        }
        return true;
    }
}
