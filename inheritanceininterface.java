interface sample{
    void meth1();
    void meth2();
  /*  private void meth4(){
        System.out.println("meth4 ");
    }
    default void meth3(){
        meth4();
        System.out.println("default methode");
    }*/
}
interface demo extends sample{
    void meth3();
    void meth4();
}
class simple implements demo{
    
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }

public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }


}
public class inheritanceininterface {
    public static void main(String[] args) {
        simple si =new simple();
        si.meth1();
        si.meth2();
        si.meth3();
    }
}
