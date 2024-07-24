
public class CopyLinkedList {
    Node first = null;
    Node sec = first;
    

    void insertFirst(int data)
    {
        Node newNode = new Node(data);
        // if (first == null) {
        //     System.out.println("Linked List Empty :");
        // }
        newNode.link = first;
        first = newNode;
        System.out.println(newNode.info);
    

    }
    int size()
    {   int a = 0 ;
        Node temp = first;
        while(temp.link!=null)
        {
            a++;
            temp = temp.link;
        }
        return a;
    }

    int getElement(int data)
    {
        sec = sec.link;
        a = data  + 1
        return a;
    }


    public static void main(String[] args) {
        CopyLinkedList cp1 = new CopyLinkedList();
        cp1.insertFirst(40);
        cp1.insertFirst(30);
        cp1.insertFirst(20);
        cp1.insertFirst(10);

        CopyLinkedList cp2 = new CopyLinkedList();
        
        for(int i=0;i<cp1.size();i++){
            cp2.insertFirst(cp1.getElement(i));
        }



    }
}

class Node 
{
    int info;
    Node link;
    Node(int info)
    {
        this.info = info;
        this.link = null;
    }
     Node first = null;
    
}