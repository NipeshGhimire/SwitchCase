import java.util.Scanner;
public class UserSupplied {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name: ");
        String fname = sc.nextLine();
        System.out.println("Enter last name: ");
        String lname= sc.nextLine();
        System.out.println("Your name is "+fname+" "+lname);
    }
}

