 abstract class parent2{
    parent2(){
        System.out.println("Hello i m constructor of parent2");
    }
    public void some(){
        System.out.println("hello good morning");
    }
    abstract public void sum();
}
class  child2 extends parent2{
    public void sum(){
        System.out.println("hello im sum of child 2");
    }

}

public class abrastractclass {
    public static void main(String[] args) {
        child2 ch=new child2();
    ch.some();
    ch.sum();
    }
}
