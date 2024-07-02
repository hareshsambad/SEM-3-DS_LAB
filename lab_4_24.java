import java.util.Scanner;
public class lab_4_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size Of Array : ");
        int size = sc.nextInt();
        int array[] = new int[size];


        for (int i = 0 ; i < size ; i++) {
            System.out.print(" Enter Element an array : ");
            array[i] = sc.nextInt();
        }

        int temp = 0;
        System.out.println("Enter Element To Delete :");
        int a = sc.nextInt();

        for(int i = 0 ; i < size ; i++) {
            if(array[i] == a)
            {
                temp = i;
            }
        }
        // System.out.println(temp);

        int array1[] = new int[size];
        int k =0;
        for(int i = 0   ; i < array.length; i++) {
            if(i==temp){
                continue;
            }
            array1[k] = array[i];
            k++;
         }

            
       
        System.out.println("Your Array Is :");


        for(int i = 0 ; i < size -1  ; i++)
        {
            System.out.print( array1[i] + " , ");
        }

    }
}