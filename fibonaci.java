public class fibonaci {
   /* static int fibo(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }*/
        static float varargs(int ...arr){
            int sum=0,average;
            for(int element :arr){
                sum+=element;
            }
            average=sum/arr.length;
            return average;
        }

    public static void main(String[] args) {
        int a=10;
       // System.out.println(" the fibonaci series of the n term is " +fibo(10));
      System.out.println(" the average of numbers is " +varargs(5,3,5,9,7,8,9));
    }
}
