import java.util.*;
import java.util.Scanner;
class first{
    GregorianCalendar gr=new GregorianCalendar();
    Scanner sc=new Scanner(System.in);
    Random rd=new Random();
    String name;
    String add;
    long mobileno;
    long Adhar;
    int age;
    long otp;
    long ott;
    String gender;
    String doctor="DR. FAIZ KHAN";
    public void phone(){
        System.out.println("Enter your phone NUMBER");
        mobileno=sc.nextLong();
        System.out.println("OTP has been send to "+mobileno);
        System.out.println("Message recived from covid portal");
        otp=rd.nextLong(5000);
        System.out.println(otp);
        System.out.println("Enter OTP");
        ott=sc.nextLong();
        if(otp==ott){
            System.out.println("MOBILE NO VERIFIED SUCCESFULLY");
            setdetails();
        }
        else{
            System.out.println("Time out................");
            phone();
        }


    }
    public void setdetails(){
        System.out.println("Enter your Age");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("Enter NAME:");
            name=sc.next();
            System.out.println("Gender : 1 for male, 2 for female ,6 for other");
            int g=sc.nextInt();
            if(g==1){
                gender="MALE";
            }
            else if(g==2){
               gender="FEMALE";
            }
            else{
                gender="OTHER";
            }
            System.out.println("Enter residential address");
            add=sc.next();
            System.out.println("Enter your Adhar no.");
            Adhar=sc.nextLong();
            System.out.println("details verified succesfully");
            vacci();
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBEL FOR COVID VACCINE ");
            System.out.println("REASON:YOU ARE UNDER 18");
        }
    }
    public void vacci(){
        System.out.println("NOW take vaccine ");
        System.out.println("ENter 1 after taking vaccine");
        int v=sc.nextInt();
        if(v==1){
          succes();
        }
    }
    public void succes(){
   System.out.println("NOW YOU ARE PARTIALY VACCINATED ON "+gr.getTime());
   System.out.println("Enter 1 for downloading Certificate");
   int s=sc.nextInt();
   if(s==1){
       getdetails();
   }
   else{
       System.out.println(">>>>>>>>>>>>>>");
   }

    }
    public void getdetails(){
        System.out.println("   ....      COVID-19      ....    ");
        System.out.println("    Ministry of health & family    ");
        System.out.println("              Welfare              ");
        System.out.println("         Goverment of India         ");
        System.out.println();
     System.out.println("      Certificate of COVID-19 Vaccination    ");
     System.out.println("Benificiary details:");
     System.out.println();
    System.out.println("NAME        :           "+name);
     System.out.println("AGE         :           "+age);
     System.out.println("Gender      :           "+gender);
     System.out.println("Aadhar NO   :           "+Adhar);
     System.out.println("Refernce id :           "+rd.nextLong());
     System.out.println();
     System.out.println("Vaccination details:");
     System.out.println("Vaccination type      :        COVISHIELD");
     System.out.println("Date of 1st Dose      :        "+gr.getTime());
     gr.roll(Calendar.MONTH,3);
    // gr.roll(calender.YEAR,1);
     System.out.println("Date for Secound dose :         "+gr.getTime());
     System.out.println("VAccine Status        :        PARTIALLY VACCINATED");
     System.out.println("Vaccinated by         :         "+doctor);
     System.out.println("Vaccinated at         :        Roshan Gate Aurangabad");
    }
}
class secound{
    GregorianCalendar gr=new GregorianCalendar();
    Scanner sc=new Scanner(System.in);
    Random rd=new Random();
    String name="SAMEER SHAIKH";
    String add;
    long mobileno=9049636228L;
    long phonn;
    long Adhar=9786756856L;
    int age=19;
    long otp;
    long ott;
    String gender="MALE";
    String doctor="DR. FAIZ KHAN";
    public void chechpho(){
        System.out.println("ENter your Phone NO");
         phonn=sc.nextLong();
         if(mobileno==phonn){
             System.out.println("OTP has been send to "+mobileno);
             System.out.println("Message recived from Covid portal");
             otp=rd.nextInt(5000);
             System.out.println(otp);
             System.out.println("ENter OTP");
            ott=sc.nextLong();
            if(otp==ott){
                System.out.println("Mobile non verified Succesfully");
                System.out.println("Done");
                System.out.println("Enter 1 for Downlloading the certificate");
                int e=sc.nextInt();
                if(e==1){
                    forsecound();
                }
                else{
                    System.out.println("THANK YOU...");
                }
               
            }
            else{
                System.out.println("time out ........try agin");
                chechpho();
            }
         }
         else{
             System.out.println("You have not Registerated ");
             System.out.println("   OR  ");
             System.out.println("Enter right mobile no.");
         }
    }
    public void forsecound(){
        System.out.println("NAME      :"+name);
        System.out.println("Adhar no  :"+Adhar);
        System.out.println("Gender    :"+gender);
        System.out.println("Check the above details ");
        System.out.println("now go for vaccine");
        System.out.println("Enter 1 after vaccine");
        int d=sc.nextInt();
        if(d==1){
            System.out.println("NOW YOU ARE FULLY VACCINATED ");
            System.out.println("DATE "+gr.getTime());
            getdetails();
        }
    }
    public void getdetails(){
        System.out.println("   ....      COVID-19      ....    ");
        System.out.println("    Ministry of health & family    ");
        System.out.println("              Welfare              ");
        System.out.println("         Goverment of India         ");
        System.out.println();
     System.out.println("      Certificate of COVID-19 Vaccination    ");
     System.out.println("Benificiary details:");
     System.out.println();
    System.out.println("NAME        :           "+name);
     System.out.println("AGE         :           "+age);
     System.out.println("Gender      :           "+gender);
     System.out.println("Aadhar NO   :           "+Adhar);
     System.out.println("Refernce id :           "+rd.nextLong());
     System.out.println();
     System.out.println("Vaccination details:");
     System.out.println("Vaccination type      :        COVISHIELD");
     System.out.println("Date of 2st Dose      :        "+gr.getTime());
     gr.roll(Calendar.MONTH,-3);
    // gr.roll(calender.YEAR, -1);
     System.out.println("Date of first dose    :        "+gr.getTime());
     System.out.println("Vaccine Status        :        FULLY VACCINATED");
     System.out.println("Vaccinated by         :         "+doctor);
     System.out.println("Vaccinated at         :        Roshan Gate Aurangabad");
    }
}

public class covid {
    public static void main(String[] args) {
        ArrayList<first> arr=new ArrayList<first>();
        int a;
        first fi=new first();
        secound se=new secound();
        Scanner sd = new Scanner(System.in);
            System.out.println("-------------------------------------");
            System.out.println("|   ....      COVID-19      ....    |");
            System.out.println("|    Ministry of health & family    |");
            System.out.println("|               Welfare             |");
            System.out.println("|      Goverment of India           |");
            System.out.println("|                                   |");
            System.out.println("|        *First   vaccine           |");
            System.out.println("|        *second vaccine            |");
            System.out.println("|        *Download certificate      |");
            System.out.println("-------------------------------------");
            System.out.println("ENter 1 for first vaccine");
            System.out.println("ENter 2 for Secound Vaccine");
            System.out.println("ENter 3 for Download certificate");
            a=sd.nextInt();
        
    
        if(a==1){
       fi.phone();
        }
        else if(a==2){
           se.chechpho();
        }
    }
}
