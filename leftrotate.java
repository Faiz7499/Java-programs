import java.util.Arrays;

class rotate{
    void leftrotate(int a[],int d,int n){
        for(int i=0;i<d;i++){
         leftrptatenyone(a, n);
        }
    }
    void leftrptatenyone(int a[],int n){
        int i,temp;
        temp=a[0];
        for(i=0;i<n-1;i++){
            a[i]=a[i+1];

        }
        a[i]=temp;
    }
}
public class leftrotate {
    public static void main(String[] args) {
        rotate rt=new rotate();
        int a[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
         rt.leftrotate(a,2,7);
        System.out.println(Arrays.toString(a));
    }
}
