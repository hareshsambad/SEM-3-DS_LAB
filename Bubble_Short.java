import java.util.Scanner;

public class Bubble_Short {
    Scanner sc = new Scanner(System.in);
    int arr[] ;
    int n; 
    int temp;


    Bubble_Short()
    {
        System.out.println("Enter Length of An Array :");
        n = sc.nextInt();
        arr = new int[n];
    }

        void insertElement()
    {
        for(int i = 0 ; i < arr.length ; i++ )
        {
            System.out.print("Enter Number arr[" +i+ "]  : ");
            arr[i] = sc.nextInt();
        }
    }

     void display()
    {
        for(int i = 0 ; i < arr.length ; i++ )
        {
            System.out.print(arr[i] + ",");
            
        }
    }

    void bubbleShort()
    {
        for(int i = 0 ; i < n - 1  ; i++)
        {
            for(int j =0 ; j < n - i - 1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        display();
    }
    public static void main(String[] args) {
          Bubble_Short b1 = new Bubble_Short();
           b1.insertElement();
          b1.bubbleShort();

         
         
    }
}


