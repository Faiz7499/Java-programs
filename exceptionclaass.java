import java.util.Scanner;
class tre extends Exception{
    public String toString(){
        return " i m to String methode";
    }
}
public class exceptionclaass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int b=10;
            System.out.println("ENter the no");
            int a=sc.nextInt();
            try{
                if(a==0){
                //throw new tre();
                throw new ArithmeticException("Exception occur due to div by zero");
                }
                System.out.println(b/a);
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println(e.toString());
            }
        }
    }
    
}
