public class Cir_Queue_Implement_Stack {
    int queue[] = new int[5];
    int front = 0;
    int rear = 0;
    Cir_Queue_Implement_Stack()
    {
        queue[0] = front;
        queue[0] = rear;
    }
    void display()
    {
        for(int i = front ; i < rear ; i++)
        {
            System.out.print(queue[i] + ",");
        }
    }

    void dequeue()
    {
        front++;
    }

    void insert(int data)
    {
            if(rear<5)
            {
                queue[rear] = data;
                rear++;
            }
        else if(front > 0)
        {
            if(front != rear)
            {
                rear = 0;
                queue[rear] = data;
            }
            else
            {
                System.out.println("Your Cir_Stack Is Full : ");
            }
            
        }
        else
        {
            System.out.println("Your Stack Is Full : ");
        }
       

    }
    public static void main(String[] args) {
        Cir_Queue_Implement_Stack c1 = new Cir_Queue_Implement_Stack();
        c1.insert(5);
        c1.insert(10);
        c1.insert(15);
        c1.insert(20);
        c1.insert(25);
        c1.dequeue();
        c1.insert(30);
        c1.display();
        
    }
}
