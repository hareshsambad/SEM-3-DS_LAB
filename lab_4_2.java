import java.util.Scanner;

public class lab_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size Of Array : ");
        int size = sc.nextInt();
        int array[] = new int[size];


        for (int i = 0 ; i < size ; i++) {
            System.out.print(" Enter Element an array : ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter location to delete : ");
        int location = sc.nextInt();

        int temparray[] = new int[size-1];

        for(int i = 0 ; i < location ; i++) {
            temparray[i] = array[i];
        }

        for(int i = location+1 ; i < size ; i++) {
            temparray[i-1] = array[i];
        }

        for(int i = 0 ; i < size-1 ; i++) {+
            System.out.print(temparray[i] + " ,");
        }

    }
}
