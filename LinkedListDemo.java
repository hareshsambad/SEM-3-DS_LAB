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

    void InsertLast(int data)
    {
        Node temp = first;
        Node newnode = new Node(data);
        if (first==null) 
        {
            first = newnode;
            return;
        }

           while(temp.link != null) 
        {
            temp = temp.link;
        }
        temp.link = newnode;
    }

    void InsertOrder(int data)
    {
        Node newnode = new Node(data);
        Node temp = first;
        if (first == null || newnode.info <= first.info) {
            newnode.link = first;
            first = newnode;
            return;
        }
        while (temp.link != null && temp.link.info <= newnode.info )
        {
            temp = temp.link;
        }
        newnode.link = temp.link;
        temp.link = newnode;
    }

    void delete(int data)
    {
        Node temp = first;
        if (first == null)
        {
            System.out.println("List Is Empty : ");
            return;
        }
        if (first.info == data) {
            first = first.link;
            return;
        }
        while (temp.link != null && temp.link.info != data)
        {
            temp = temp.link;
            
            
        }
        temp.link = temp.link.link;
    }

    


    public static void main(String[] args) {
        LinkedListDemo l1 = new LinkedListDemo();
        l1.InsertFirst(40);
        l1.InsertFirst(30);
        l1.InsertFirst(20);
        l1.InsertFirst(10);
        l1.InsertLast(80);
        l1.InsertLast(90);
        l1.InsertLast(100);
        l1.InsertLast(110);
        l1.InsertOrder(15);
        l1.delete(10);
        l1.display();
        
    }
}
