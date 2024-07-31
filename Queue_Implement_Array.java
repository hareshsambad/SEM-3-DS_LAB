public class Queue_Implement_Array {

        int queue[] = new int[5];
    int front = 0;
    int rear = 0;
    Queue_Implement_Array()
    {
        queue[0] = front;
        queue[0] = rear;
    }
    void display()
    {
        System.out.print("Your Queue is : ");
        for(int i = front ; i <rear ; i++)
        {
            
            System.out.print(queue[i] + ",");
        }
    }
    void dequeue()
    {
        front++;
    }

    void enqueue(int data)
    {
        queue[rear] = data;
        rear++;
    }
    public static void main(String[] args) {
    
        Queue_Implement_Array q1 = new Queue_Implement_Array();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(15);
        q1.enqueue(20);
        q1.enqueue(25);
        q1.dequeue();
        q1.display();
    }
}