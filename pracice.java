import java.util.*;
public class pracice {
    public static void main(String[] args) {
        System.out.println("lets practice on string ");
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter the String ");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 6));
        System.out.println("plz enter the another String");
        String naam=sc.nextLine();
         System.out.println(naam);
         System.out.println(naam.replace("now", "faisal"));
         System.out.println(naam.replace('r','e'));
         System.out.println(naam.startsWith("de"));
         System.out.println(naam.endsWith("ot"));





        
    }
}
