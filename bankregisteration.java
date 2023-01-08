import java.util.*;
class already{
    Random rd=new Random();
    Scanner sc=new Scanner(System.in);
    String name="FAIZ KHAN FEROZ KHAN";
    String addresss="Roshan gate";
    long bankaccount=423765492476L;
    long phone=7499264747L;
    
    long phone2;
    long po;
    long ty;
    int b;
    private int upi=4552;
    private double currentb=800.00;
    private void setupi(){
        System.out.println("ENter Cuurent password");
        int upo=sc.nextInt();
        if(upo==upi){
            System.out.println("ENter NEw password");
            int sd=sc.nextInt();
            System.out.println("Enter again");
            int ds=sc.nextInt();
            if(sd==ds){
                this.upi=ds;
                System.out.println("Password changed Succesfully");
                home();
            }
            else{
                System.out.println("not match, try again");
                setupi();

            }
        }
        else{
            System.out.println("you enterd wrong password,try again");
            setupi();
        }
        
    }
    public void phonee(){
        System.out.println("Enter Your Mobile No");
        phone2=sc.nextLong();
       if(phone==phone2){
           System.out.println("OTP HAS BEEN SUCCESFULLY  SEND TO "+phone);
           po=rd.nextLong(5000);
           System.out.println("Message Recived From KHAN Bank");
           System.out.println(po);
           System.out.println("Enter the OTP");
           ty=sc.nextLong();
           if(ty==po){
               System.out.println("....MOBILE NO VERIFIED SUCCESFULLY....");
               finy();
           }
           else{
               System.out.println(".....TIME OUT....");
               System.out.println("If u have not recieve OTP then Try again ");
             phonee();
           }
       }
       else{
           System.out.println("YOU HAVE NO ACCOUNT IN THIS BANK ");
       }
     
           
       }
       public void finy(){
        System.out.println("|  >>>..KHAN BANK PVT LTD..<<<<<    |");
        System.out.println("|   ONLINE BANK WITH NO CHARGE      |");
           System.out.println("  YOUR ACCOUNT DETAILS");
           System.out.println("NAME OF ACC HOLDE  :"+name);
           System.out.println("MOBILE NO          : "+phone);
           System.out.println("Postal Address     :"+addresss);
           System.out.println("ACCOUNT NO         :2504207658712");
           System.out.println("IFSC CODE          :KH8790 ");
           System.out.println("BRANCH             :JALNA ROAD");
           System.out.println("-------------------------------");
           System.out.println("Skip by pressing one");
           b=sc.nextInt();
           if(b==1){
               home();
           }
           else{
               System.out.println("Thank YOU");
           }

       }
       public void home(){
        System.out.println("CURRENT BALANCE>.......>Enter 1");
        System.out.println("PAY TO UPI ID....... >Enter 2");
        System.out.println("LAST MONTH TRANSACTION....>Enter 3");
        System.out.println("PROFILE CORRECTION.......>Enter 4");
        System.out.println("CHANGE UPI PASSWORD.....>Enter 5");
        System.out.println("Get Account Details.......>Enter 6");
        int u=sc.nextInt();
        if(u==1){
            currentbalance();
        }
        else if(u==2){
         toupid();
        }
        else if(u==3){
            lastmonth();
        }
        else if(u==4){
           correctinprofile();
        }
        else if(u==5){
            setupi();
        }
        else if(u==6){
            finy();
        }
       }
       private void correctinprofile(){
           System.out.println("If you want to change NAME  so press 1");
           System.out.println("If you want to change mobile  no so press 2");
           System.out.println("if you want to change addres so press 3");
           int u=sc.nextInt();
           if(u==1){
            System.out.println("Enter correct name");
            name=sc.next();
            home();
           }
           else if(u==2){
               System.out.println("Enter the Write phone no.");
                phone=sc.nextLong();
               home();

           }
           else if(u==3){
               System.out.println("Enter postal address");
             addresss=sc.next();
             home();
           }
       }
       private void currentbalance(){
           System.out.println("ENter your UPI...");
           int upd=sc.nextInt();
           if(upd==upi){
               System.out.println("-------------------------------------");
               System.out.println("-------------------------------------");

                System.out.println("CURRENT BALANCE>>>>>>>>"+currentb);

                System.out.println("-------------------------------------");
                System.out.println("-------------------------------------");
                System.out.println("Enter 1 for home");
                int g=sc.nextInt();
                if(g==1){
                    home();
                }
           }
           else{
               System.out.println("YOU ENTERD WRONG UPI PIN");
               home();
           }
       }
       private void lastmonth(){
          System.out.println("payment not initiated by this account");
          home();
       }
       private void toupid(){
        System.out.println("ENter a valid upi id");
        String topay=sc.next();
        System.out.println("Chech the reciverse upi id once again");
        System.out.println("ENter amount ");
        int amount=sc.nextInt();
        System.out.println("Enter the 4 digit pin");
        int fd=sc.nextInt();
        if(fd==upi){
            if(this.currentb>=amount){
            System.out.println("-------------------------------------");
          System.out.println(amount+" SUCCESFULLY TRANSFERD TO "+topay);
          System.out.println("-------------------------------------");
          amountminus(amount);
          home();
            }
            else{
                System.out.println("SORY WE CANNOT PROCCED YOUR REQUEST BECUSE .........");
                System.out.println("NOT ENOUGH BALANCE TO TRANSFER");
                home();
            }
        }
        else{
            System.out.println("Enter Wrong pin <<OR>>UPI NEWTWORK SLOW AT YOUR OR RECIVERSE BANK  (please try again)");
            home();
        }


       }
       private void amountminus(int amount){
           this.currentb=this.currentb-amount;
       }

    }
class registration{
    String Fullname;
    String surname;
    String add;
    String city;
    String state;
    long mobileno;
    long aadhar;
    long otp;
    long otttt;
    long h;
    long k;
    Scanner sc=new Scanner(System.in);
    Random rd=new Random();
    public void setdetails(){
        System.out.println(">>> Complete Personal details<<<");
        System.out.println("Enter Surname");
        surname=sc.nextLine();
        System.out.println("Enter Full Name.");
        Fullname=sc.nextLine();
        System.out.println("Enter Residential Address");
        add=sc.nextLine();
        System.out.println("Enter City");
        city=sc.nextLine();
        System.out.println("Enter State");
        state=sc.nextLine();
        getdetails();

    }
    public void getdetails(){
        System.out.println("--------------------------------");
        System.out.println("Befor going to Contact Details Check the personal details");
        System.out.println("Surname : "+surname);
        System.out.println("Name : "+Fullname);
        System.out.println("Address : "+add);
        System.out.println("City : "+city);
        System.out.println("State : "+state);
        System.out.println("--------------------------------");
        System.out.println("if Details are not right then press back OR Press one  ");
        int c=sc.nextInt();
        if(c==1){
            setdetails();
        }
        else{
            contactdetails();
        }
    }
    public void contactdetails(){
        System.out.println("--------------------------------");
        System.out.println("Enter 10 Digit mobile no:");
        mobileno=sc.nextLong();
        System.out.println("OTP Send Successfully to"+mobileno);
        System.out.println("Message Recieved From Khan Bank");
        otp=rd.nextLong(2000);
        System.out.println(otp);
        System.out.println("Enter The OTP ");
        otttt=sc.nextLong();
        System.out.println("--------------------------------");
        if(otp==otttt){
            System.out.println("Mobile No. Verified Succesfully");
            adhar();
        }
        else{
            System.out.println("Time Out..");
            System.out.println("plz Try Again");
            System.out.println("Enter a valid OTP Or Enter the Correct Mobile no.");
            contactdetails();
        }

    }
    public void adhar(){
        System.out.println("--------------------------------");
        System.out.println("Enter Aadhar NO");
        aadhar=sc.nextLong();
        System.out.println("OTP Has been Send to Aadhar Linked Mobile NO.");
        h=rd.nextLong(2000);
        System.out.println("Message recieved from bank");
        System.out.println(h);
        System.out.println("Enter the OTP");
        k=sc.nextLong();
        if(h==k){
            System.out.println("Aadhar Verified Succesfully...");
            getwholedetails();
        }
        else{
            System.out.println("Time out");
            System.out.println("If you not get OTP ,SO please linked YOUR Aadhar with mobile NO");
        }
    }
    public void getwholedetails(){
        System.out.println("Check Your Details");
        System.out.println("#.......KHAN BANK pvt LTD......#");
        System.out.println("--------------------------------");
        System.out.println("Surname : "+surname);
        System.out.println("Name : "+Fullname);
        System.out.println("Address : "+add);
        System.out.println("City : "+city);
        System.out.println("State : "+state);
        System.out.println("Aadhar NO : "+aadhar);
        System.out.println("Mobile NO : "+mobileno);
        System.out.println("--------------------------------");
        System.out.println("Enter Submit Button");
        
        thank();
    }
    public void thank(){
        System.out.println("************************************");
        System.out.println("YOUR BANK ACCOUNT WILL BE CREATED WITHIN 24 HRS ");
        System.out.println("AND YOU WILL RECIEVE AN CONFIRMATION CALL FROM KHAN BANK ");
        System.out.println("THANK YOU");
        System.out.println("............########..............");
    }
}
public class bankregisteration {
    public static void main(String[] args) {
        int a;
        registration re=new registration();
        already al=new already();
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("|   ....Welcome to Khan Bank....    |");
        System.out.println("|  >>>..KHAN BANK PVT LTD..<<<<<    |");
        System.out.println("|   ONLINE BANK WITH NO CHARGE      |");
        System.out.println("|                                   |");
        System.out.println("|                                   |");
        System.out.println("|        *CREATE ACCOUNT            |");
        System.out.println("|        *ALREADY HAVE ACCOUNT      |");
        System.out.println("-------------------------------------");
        System.out.println("Enter 1 for create account ");
        System.out.println("Enter 2 for already have an account ");
        a=sc.nextInt();
        if(a==1){
            re.setdetails();
        }
        else if(a==2){
        al.phonee();
        }
        else{
            System.out.println("  BACK TO Home Screen  ");
        }
    }
}
