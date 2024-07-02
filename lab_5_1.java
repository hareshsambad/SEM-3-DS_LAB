import java.util.Scanner;

public class lab_5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number of row : ");
        int r = sc.nextInt();

        System.out.println("Enter a number of col : ");
        int c = sc.nextInt();
        
        int array1[][] = new int[r][c];

        System.out.println("Enter a first metrix");

        for(int i = 0; i <r; i++) {
            for(int j = 0; j <c; j++)
            {
                System.out.print("Enter a Element [" + i + "]" + "["+ j + "]" + ": ");
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a second metrix");

        int array2[][] = new int[r][c];

        for(int i = 0; i <r; i++) {
            for(int j = 0; j <c; j++)
            {
               System.out.print("Enter a Element  [" + i + "]" + "["+ j + "]" + ": ");
                array2[i][j] = sc.nextInt();
            }
        }

        int sum[][] = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++)
            {
               sum[i][j] = array1[i][j] + array2[i][j];
               
            }
        }

        System.out.println("Your Sum Matrix Is :");

        for(int i = 0; i <r; i++) {
            for(int j = 0; j <c; j++)
            {
              System.out.print(sum[i][j]+ ",");
            }
        }
    }
}