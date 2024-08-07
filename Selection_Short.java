import java.util.Scanner;

public class Selection_Short {

    Scanner sc = new Scanner(System.in);
    int arr[] ;
    int n; 
    int temp;
    int minIndex;

    Selection_Short()
    {
        System.out.println("Enter Length of An Array :");
        n = sc.nextInt();
        arr = new int[n];
    }

      void display()
    {
        for(int i = 0 ; i < arr.length ; i++ )
        {
            System.out.print(arr[i] + ",");
            
        }
    }

      void insertElement()
    {
        for(int i = 0 ; i < arr.length ; i++ )
        {
            System.out.print("Enter Number arr[" +i+ "]  : ");
            arr[i] = sc.nextInt();
        }
    }


    void selectionSort()
    {
        
        for(int i = 0 ; i <  n - 1 ; i++)
        {
            minIndex = i ;
            for(int j = i+1; j < n ; j++)
            {
                if(arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        display();
    }






    public static void main(String[] args) {
        Selection_Short s1 = new  Selection_Short();
        s1.insertElement();
        s1.selectionSort();
    }
}
