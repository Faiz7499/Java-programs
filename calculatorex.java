import java.util.Scanner;
class maximuminput extends Exception{
    public String toString(){
        return " input cannot be greter than 10000";
    }
    public String getmessage(){
        return "i am getmeesage";
    }
}
class cannotdiv0 extends Exception{
    public String toString(){
        return "no cannot div by zero";
    }
    public String getmessage(){
        return "i am getmessage ";
    }
}
class custom{
double add(double a,double b){
    if(a>10000 || b>10000){
        try {
            throw new maximuminput();
        } catch (maximuminput e) {
            System.out.println(e);
        }
    }
    return a+b;
}
double sub(double a,double b){
    if(a>10000 || b>10000){
        try {
            throw new maximuminput();
        } catch (maximuminput e) {
            System.out.println(e);
        }
    }
    return a-b;
}
double multi(double a,double b){
    if(a>10000 || b>10000){
        try {
            throw new maximuminput();
        } catch (maximuminput e) {
            System.out.println(e);
        }
    }
    return a*b;
}
double divi(double a,double b){
    if( b==0){
        try {
            throw new cannotdiv0();
        } catch (cannotdiv0 e) {
            System.out.println(e);
        }
    }
    if(a>10000 || b>10000){
        try {
            throw new maximuminput();
        } catch (maximuminput e) {
            System.out.println(e);
        }
    }
    return a/b;
}
}
public class calculatorex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        custom cu=new custom();
        int a=sc.nextInt();
        int b=sc.nextInt();
     System.out.println(cu.add(a,b));
      System.out.println(cu.divi(a, b));
      System.out.println( cu.sub(a, b));
    }
}
