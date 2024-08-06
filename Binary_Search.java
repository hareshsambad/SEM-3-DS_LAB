import java.util.Scanner;

public class Binary_Search {

    Scanner sc = new Scanner(System.in);
    int arr[] ;
    int n; 
    int index;
    int f = 0 ;
    int r = arr.length - 1;
    
    Binary_Search()
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
    
    void search()
    {
        System.out.println("Enter Element to Serch");
        int index = sc.nextInt();
        // for(int i = 0 ; i < arr.length ; i++ )
        // {
        //     if(r>f)
        //     {
        //         int middle = (r + f)/2;
        //         if(arr[middle] <= index)
        //         {
        //             if(arr[middle] == index)
        //             {
        //                 System.out.println("Your Element Index Is " + middle);
        //             }

        //             f = middle;

        //         }
        //         else if(arr[middle] >= index)
        //         {
        //             if(arr[middle] == index)
        //             {
        //                 System.out.println("Your Element Index Is " + middle);
        //             }

        //         }
        //     }
        // }

        while(f > r)
        {
            int middle = (f + r)/2;
            if(arr[middle] == index)
            {
                System.out.println("Your Binary Search Element Index Is : " +  middle);                
            }
            else if(index < arr[middle])
            {
                r = middle;
            }
            else if(index > arr[middle])
            {
                f = middle;
            }
        }


            // while (f<r) {
            //     int mid = f+r/2;
            //     if(arr[mid]==key){
            //         return;
            //     }
            //     else if(index < arr[middle]){
            //         r=mid;
            //     }
            // }

    }
    public static void main(String[] args) {
        Binary_Search b1 = new Binary_Search();
        b1.insertElement();
        b1.search();
    }
}
