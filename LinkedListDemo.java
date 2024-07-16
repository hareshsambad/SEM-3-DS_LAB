public class LinkedListDemo {
    class Node 
    {
        int info;
        Node link;
        public Node(int info)
        {
            this.info = info;
            this.link = null;
        }
    }
    Node first;
    void InsertFirst(int n)
    {
        int a = n;
        Node newnode = new Node(a);
        if(first==null)
        {
            first = newnode;
            
            return;
        }
        newnode.link = first;
        first = newnode;
       
        
    }

    void display()
    {
        Node temp = first;


        while(temp != null) 
        {
            System.out.print(temp.info  + ",");
            temp = temp.link;
           
            
        }
    }


    public static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();
        l1.InsertFirst(40);
        l1.InsertFirst(30);
        l1.InsertFirst(20);
        l1.InsertFirst(10);
        l1.display();
    
    }
}
