import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class filecreation {
    public static void main(String[] args) {
        filecreation fi=new filecreation();
      fi.newfile();
        
    }
    public void newfile(){
       String strpath=" ",strName=" ";
       try{
           BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter the file name");
           strName=bf.readLine();
           System.out.println("ENter the file  path");
           strpath=bf.readLine();
           File file=new File(strpath+" "+strName+".txt");
           file.createNewFile();

       }
       catch(Exception e){

       }
    }
}
