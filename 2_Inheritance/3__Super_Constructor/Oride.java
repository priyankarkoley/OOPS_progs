class Base {
    public int a, b;

    Base(int a, int b) {
        System.out.println("Base Constructor Called\n");
        this.a = a;
        this.b = b;
    }

    void show() {
        System.out.println("Hi from the BASEEE Class!!");
        System.out.println("a = " + a + " b = " + b);
    }
}

class Sub extends Base {
    public int c, d;

    Sub(int a, int b, int c, int d) {
        super(a,b);
        System.out.println("Sub Constructor Called\n");
        this.c = c;
        this.d = d;
    }

    void show() {
        super.show();
        System.out.println("Hi from the SUBBBB Class!!");
        System.out.println("c = " + c + " d = " + d);
    }
}

public class Oride {
    public static void main(String[] args) {
        // Base ba = new Base();
        // ba.show();
        Sub su = new Sub(5,6,7,8);
        su.show();
    }
}