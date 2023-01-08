import javax.swing.undo.StateEdit;

public class squarepattern {
    static void pattern(int row,int colm){
        
        for(int a=1;a<=row;a++){
            for(int b=1;b<=colm;b++){
                if(a==1 || a==row || b==1 || b==colm){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();

        }
        
    }
    static void patternn(int row){
        for(int a=1;a<=row;a++){
            for(int b=1;b<=row;b++){
                if(a==1 || a==row || b==1 || b==row || a==b || b==(row-a+1)){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int row=8;
        int colm=22;
        pattern(row, colm);
        patternn(12);
    }
}
