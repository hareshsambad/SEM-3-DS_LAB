import java.util.Scanner;

public class lab_4_1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size Of Array : ");
        int size = sc.nextInt();

        int[] array1 = new int[size];
        

        for (int i=0; i<size ; i++) 
        {
            System.out.print("Enter a Array Element :  ");
            array1[i] = sc.nextInt();
        }

        
           
            System.out.println("Enter a location : ");
            int loc = sc.nextInt();
            System.out.println("Enter a Value : ");
            int val = sc.nextInt();
            int[] array2 = new int[size + 1];

            for(int i=0; i<loc; i++)
            {
                array2[i] = array1[i];
            }

            array2[loc] = val;

            for(int i=loc +1; i<=size; i++)
            {
                array2[i] = array1[i-1];
            }
            
            for(int i=0; i<=size; i++)
            {
                System.out.print(array2[i] + ", ");
            }


    }
}










































