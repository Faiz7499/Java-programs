class negativeexception extends Exception{
    public String toString(){
        return "i am negative exception";
    }
}
public class throwvsthrows {
    public static double area(int r)throws negativeexception{
        if(r<0){
            throw new negativeexception();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
       throw new ArithmeticException("Arithmatic exception");
        }
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println(divide(6,2));
        try{
            System.out.println(area(3));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
