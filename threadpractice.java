import java.lang.*;

class goodmorning extends Thread{
    public void run(){
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
       
        
    }
}
class welcome extends Thread{
    public void run(){
       /* try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }*/
        System.out.println("welcome");
        System.out.println("welcome");
        System.out.println("welcome");
        System.out.println("welcome");
        System.out.println("welcome");
        
        }
    }

public class threadpractice {
    public static void main(String[] args) {
        goodmorning g1=new goodmorning();
        welcome w1=new welcome();
       // g1.setPriority(8);
        w1.setPriority(8);
       // System.out.println(g1.getPriority());
      //  System.out.println(w1.getPriority());
        g1.start();
        w1.start();

    }
}
