import java.io.Reader;

public class addtwostring {
    static String stringadd(String a,String b){
        String result=" ";
        int d=0;
        int k=a.length()-1  , l=b.length()-1;
        while(k>=0 || l>=0 || d==1){
             d +=((k>=0)?a.charAt(k)-'0':0);
             d +=((l>=0)?b.charAt(l)-'0':0); 
             result=(char)(d%2 +'0') +result;
             d/=2;
             k--;
             l--;
        }
        return result ;
    }
    public static void main(String[] args) {
        String a="11001",b="01101";
      System.out.println(stringadd(a, b));
    }
}
