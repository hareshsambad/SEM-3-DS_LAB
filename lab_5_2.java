import java.util.Scanner;

public class lab_5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of first matrix row : ");
        int r1 = sc.nextInt();

        System.out.println("Enter a number of first matrix column : ");
        int c1 = sc.nextInt();


        
        int array1[][] = new int[r1][c1];

        System.out.println("Enter a first metrix");
        for(int i = 0; i <r1; i++) {
            for(int j = 0; j <c1; j++)
            {
                System.out.print("Enter a Element [" + i + "]" + "["+ j + "]" + ": ");
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a number of second matrix row: ");
        int r2 = sc.nextInt();

        System.out.println("Enter a number of second matrix col : ");
        int c2 = sc.nextInt();


        int array2[][] = new int[r2][c2];
        System.out.println("Enter a second metrix");
        for(int i = 0; i <r2; i++) {
            for(int j = 0; j <c2; j++)
            {
               System.out.print("Enter a Element  [" + i + "]" + "["+ j + "]" + ": ");
                array2[i][j] = sc.nextInt();
            }
        }

        int sum[][] = new int[r1][c2];

        for(int i = 0; i <r1; i++)
        {
            for(int j = 0 ; j <c2; j++)
            {
                for(int k = 0; k <c1; k++)
                {
                    sum[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        for(int i = 0; i <r2; i++) {
            for(int j = 0; j <c2; j++)
            {
               System.out.println("Enter a Element  [" + i + "]" + "["+ j + "]" + ": " + sum[i][j]  + ",");
            }
        }


    }
}
