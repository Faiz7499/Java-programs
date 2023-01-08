import java.util.*;

class valuegretere extends Exception{
    public String toString(){
        return "value is greater plz enter the small value";
    }
}
class valueless extends Exception{
    public String toString(){
        return "value is less plz enter the hgreater  value";
    }
}


public class thropractice {
    public static int multiply(int a,int b)throws valuegretere,valueless{
        if(a<=10){
            throw new valueless();
        }
        else if(b>=5){
            throw new valuegretere();
        }
        else{
      return a/b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter value greater the 10");
        int a=sc.nextInt();
        System.out.println("enter value less than 5");
        int b=sc.nextInt();
       
        try{
            System.out.println(multiply(a, b));
        }
        catch(Exception e){
            System.out.println(e);
           
        }
        finally{
            System.out.println("program run with an or not");
        }
    }
}