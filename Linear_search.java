import java.util.Scanner;
public class Linear_search {
    Scanner sc = new Scanner(System.in);
    int arr[] ;
    int n; 
    int index;
    int x = -1;
    Linear_search()
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

    void search()
    {
        System.out.print("Enter ELement To Serch :");
        index = sc.nextInt();
        for(int i = 0 ; i < arr.length ; i++)
        {
    
            if(index == arr[i])
            {
                x = i;
                System.out.println("Your Element Index Is " + x);
            }
        }
            if(x == -1)
            System.out.println("Here No element In Array ");
        
    }

    public static void main(String[] args) {
        Linear_search l1 = new Linear_search();
        l1.insertElement();
        l1.search();
        l1.display();
    }
}
