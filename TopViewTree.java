/*
   class Node
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
  Deque<Node> dq = new LinkedList<Node>();

    if(root==null){
        System.out.println("Empty tree!");
    }

    else{

        Node temp = root;
        Node l = temp.left;
        Node r = temp.right;

        dq.addFirst(root);

       while(l!=null && r!=null){
            dq.addFirst(l);
            dq.addLast(r);
            l = l.left;
            r = r.right;
        }

        if(l!=null){
            dq.addFirst(l);
        }

        else{
            dq.addLast(r);
        }

        int size = dq.size();
        int i=0;

        while(i < size){
            System.out.print((dq.pop()).data + " ");
            i++;
        }  
    }
}
