class Base{
    public int a,b;
    Base(){System.out.println("Base Constructor Called\n");a=5;b=6;}

    void show(){
        System.out.println("Hi from the BASEEE Class!!");
        System.out.println("a = "+a+" b = "+b);
    }
}

class Sub extends Base{
    public int c,d;
    Sub(){System.out.println("Sub Constructor Called\n");c=7;d=8;}
    
    void show(){
        super.show();
        System.out.println("Hi from the SUBBBB Class!!");
        System.out.println("c = "+c+" d = "+d);
    }
}

public class Oride {
    public static void main(String[] args) {
        // Base ba = new Base();
        // ba.show();
        Sub su = new Sub();
        su.show();
    }
}