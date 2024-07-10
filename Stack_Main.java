import java.util.Scanner;

public class Stack_Main {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Stack_Demo sd = new Stack_Demo(size);
        sd.push(10);
        sd.push(11);
        sd.push(12);
        sd.pop(); 
        sd.display();
    }
}

class Stack_Demo
{
      
        int size;
        int array[];
        int top = -1;
        Stack_Demo(int size){
            this.size = size;
            array=new int[size];
        }

    void push(int x)
    {
        if (top>=size-1){
            System.out.println("stack overflow");
            return;
        }
   
            top++;
            array[top] =x;
    }

    void pop()
    {
        if(top<=-1){
            System.out.println("stack underflow");
            return;
        }
        top--;
        System.out.println(array[top+1]);
    }

    void display()
    {
    
        for(int i = top ; i >= 0 ; i-- )
        {
            System.out.print(array[i] + ",");
            
        }
    }
}







































        