import java.util.Random;
import java.util.Scanner;
class guessing{
    int rand;
    int num;
    int noofguess=0;
    int highscore=2;
    public guessing(){
        Random rd=new Random();
        rand=rd.nextInt(20);
    }
    public void set(int n){
        num=n;
    }
    public boolean iscorrect(){
        if(rand>num){
            System.out.println("you enterd small no. try again ");
            noofguess=noofguess+1;
            return false;
        }
        else if(rand<num){
            System.out.println("you enterd large no. try again");
            noofguess=noofguess+1;
            return false;
        }
        else{
            System.out.println("Congrats! you enterd the right no.");
            noofguess=noofguess+1;
            return true;
        }
    }
    public int high(int a){
        if(a<highscore){
            highscore=a;
            System.out.println("your score is high now");
            System.out.println("high score =");
            System.out.println(a);
            return highscore;
        }
        System.out.println("high score =");
        System.out.print(highscore);
        return highscore;
    }

}

public class guestheno {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        guessing Faiz=new guessing();
        System.out.println("lets start the game....");
        System.out.println("plz enter the no.");
        Faiz.set(sc.nextInt());
        while(!Faiz.iscorrect()){
            System.out.println("entr again");
            Faiz.set(sc.nextInt());
        }
      System.out.println("****YOUR SCORE****");
      int b=Faiz.noofguess;
      System.out.println(b);
      Faiz.high(b);
    }
    
}
