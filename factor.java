import java.util.Scanner;

public class factor{
   static int factorial(int x){
      int ans=1;
      for(int i=1;i<=x;i++){
         ans*=i;
      }
      return ans;
   }
   public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int result=factorial(x);
      System.out.println(result);
   }
}