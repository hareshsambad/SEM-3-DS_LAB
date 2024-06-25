import java.util.Scanner;
public class lab_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size Of Array : ");
        int size = sc.nextInt();
        int[] array1 = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter a Array Element :  ");
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter values to insert : ");
        int ins = sc.nextInt();
        int temparray[] = new int[size+1];

        for(int i = 0; i < ins; i++)
        {
            temparray[i] = array1[i]; 
        }
        
        while(array[i]<ins && i<array1.lenght) {
            ins 
            i++;
        }
       temparray[i] = ins;


    }
}
