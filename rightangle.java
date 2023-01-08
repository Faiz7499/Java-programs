public class rightangle {
    public static void main(String[] args) {
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        for(int k=0;k<=4;k++){
            for(int l=2*(4-k);l>=0;l--){
                System.out.print(" ");
            }
            for(int m=0;m<=k;m++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
