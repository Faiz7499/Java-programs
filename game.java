import java.util.*;
class gaming{
int rand;
int num;
int guess=0;
public gaming(){
    Random rd=new Random();
    rand=rd.nextInt(20);
}
public void set(int n){
    num=n;
}
public boolean correct(){
     if(num<rand){
        System.out.println("you enter small no try again");
        guess++;
        return false;
    }
    else if(num>rand){
        System.out.println("you enter large no. try again");
        guess++;
        return false;
    }
    else{
        guess++;
        System.out.println("your guess is correct");
        return true;
    }
}
}

public class game {
    public static void main(String[] args) {
        
    }
}
