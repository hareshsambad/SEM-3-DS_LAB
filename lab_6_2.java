import java.util.Scanner;
public class lab_6_2 {
    public static void main(String[] args) {
        
        Employee_Details e1 = new Employee_Details();
        e1.set_details();
        e1.get_details();
    }
}
class Employee_Details
{
    int Employee_id;
    String name;
    String Designation;
    double Salary;
    void set_details()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Employee_id : ");
        Employee_id = sc.nextInt();

        System.out.print("Enter name A : ");
        name = sc.next();

        System.out.print("Enter  Designation : ");
         Designation = sc.next();
        
        System.out.print("Enter  Salary. : ");
         Salary = sc.nextDouble();
    }

    void get_details()
    {
        System.out.println("Your Employee_id : " +  Employee_id);
        System.out.println("your name : " + name);
        System.out.println("your  Designation : " + Designation);
        System.out.println("your  Salary. : " + Salary);
    }
}
