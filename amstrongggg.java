import java.lang.Math;
public class amstrongggg {
    public static void main(String[] args) {
        int a=153;
        int b=a;
        int n=0;
        while(b!=0){
            b=b/10;
            ++n;
        }
        b=a;
        int d;
        double sum=0;
        while (b!=0) {
            d=b%10;
            sum= sum+ Math.pow(d, n);
            b/=10;
        }
    
        if(sum==a){
            System.out.println("THe given no is Amstrong");
        }
        else{
            System.out.println("The Given no is not Amstrong");
        }
    }
}
