public class firstnaturalsum {
   static int sumn(int n){
       if(n==1){
           return 1;
       }
       return n+sumn(n-1);
   } 
   public static void main(String[] args) {
       int a= 10;
       System.out.println("the sum 0f natural no of n is " +sumn(5));
      int sum=0;
       for(int i=1;i<=a;i++){
           sum+=i;
       }
       System.out.println(sum);
   }
}
