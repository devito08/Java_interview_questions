public class prime {
    public static void main(String[] args) {
        System.out.println(isPrime(49));
    }
     public static boolean isPrime(int n) {
        if(n==1|| n==0){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
     }
}
