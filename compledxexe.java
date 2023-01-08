public class compledxexe {
    int real,image;
    public compledxexe(int r,int i){
        this.real=r;
        this.image=i;
    }
   public void showa(){
       System.out.println(this.real+"+i"+this.image);
   }
   public static compledxexe add(compledxexe n1,compledxexe n2){
       compledxexe res=new compledxexe(0, 0);
       res.real=n1.real+n2.real;
       res.image=n1.image+n2.image;
       return res;
   }
    public static void main(String[] args) {
    compledxexe n1=new compledxexe(4, 5);
    compledxexe n2=new compledxexe(2,4);
    System.out.println("the first complex no is ");
    n1.showa();
    System.out.println("Secoud complex no is ");
    n2.showa();
    compledxexe res=add(n1, n2);
    System.out.println("The sum of two complex no is");
    res.showa();


    }
}
