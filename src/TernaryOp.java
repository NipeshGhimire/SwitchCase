public class TernaryOp {
    public static void main(String[] args){
        int x=5;
        String n=(x>0)?"Greater":(x==0)?"Equal":(x<0)?"Less":"Invalid";
        System.out.println(n);
    }
}
