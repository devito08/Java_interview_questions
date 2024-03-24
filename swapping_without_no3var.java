public class swapping_without_no3var {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swapping a is "+a+" b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a is "+a+" b is"+b);
    }
    
}
