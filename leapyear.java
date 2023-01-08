import java.util.*;
public class leapyear{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the year that want to check");
    int year=sc.nextInt();
    boolean isleapyear=false;
    if(year%4==0){
        isleapyear=true;
        if(year%100==0){
            if(year%400==0){
                isleapyear=true;
            }
            else{
                isleapyear=false;
            }
        }
    }
    else{
        isleapyear=false;
    }
    if(isleapyear){
        System.out.println("year is leap year" +year);
    }
    else{
        System.out.println("year is not leap year" +year);
    }
}
}

