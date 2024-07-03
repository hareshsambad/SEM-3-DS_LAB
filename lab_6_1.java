import java.util.Scanner;
public class lab_6_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number A : ");
        int a = sc.nextInt();
        System.out.print("Enter Number B : ");
        int b = sc.nextInt();
        Change c1 = new Change();
        
        System.out.println("before swapping values:");
        System.out.println("before > a: " + a);
        System.out.println("before > b: " + b);


        c1.user_defined(a,b);
    }
}

class Change
{
    int a;
    int b;
    int temp;
    void user_defined(int a , int b)
    {
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping values:");
        System.out.println("After > a: " + a);
        System.out.println("After > b: " + b);
    }
}