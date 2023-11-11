interface Father{
    void shop();
    void job();
}

interface Mother{
    void makeUp();
    void cook();
}

class Child implements Father, Mother{
    public void shop(){System.out.println("Daddy goes shopping.. ..");}
    public void job(){System.out.println("Daddy goes Jobbing.. ..");}
    public void makeUp(){System.out.println("Mommy Makeup makeup....");}
    public void cook(){System.out.println("Mommy does cooking....");}
}

public class Inh {
    public static void main(String[] args){
        Child goru = new Child();
        goru.shop();
        goru.job();
        goru.makeUp();
        goru.cook();
    }
}