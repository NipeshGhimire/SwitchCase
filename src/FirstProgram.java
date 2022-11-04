public class FirstProgram {
    public static void main(String[] args){
        System.out.println("Hello");
         addNum();
         subtractNum();
        divNum();
        multiplyNum();
        multiplyNum();
    }
     static void addNum()
    {
       int a=5;
       int b=6;
        int c=a+b;
        System.out.println("Addition:"+c);
    }
    static void subtractNum(){
        int a=5;
        int b=6;
        int c=a-b;
        System.out.println("Subtract:"+c);
    }
    static void divNum()
    {
        int a=5;
        int b=6;
        int c=a/b;
        System.out.println("Division:"+c);
    }
    static void multiplyNum()
    {
        int a=5;
        int b=6;
        int c=a*b;
        System.out.println("Multiplication:"+c);
    }
}
