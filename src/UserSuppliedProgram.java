import java.util.Scanner;
public class UserSuppliedProgram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x,y;
        System.out.println("Enter first num: ");
        x= sc.nextInt();
        System.out.println("Enter Second num: ");
        y= sc.nextInt();
        addNum(x,y);
        subtract(x,y);
    }
    static void addNum( int a,int b)
    {
        int c=a+b;
        System.out.println("Sum:"+c);
    }
    static void subtract(int a, int b)
    {
        int c= a-b;
        System.out.println("Subtract :"+c);
    }
}
