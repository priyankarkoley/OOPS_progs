class Base {
    void show() {
        System.out.println("Hi from the BASEEE Class!!");
    }
}

class Sub extends Base {
    void show() {
        super.show();
        System.out.println("Hi from the SUBBBB Class!!");
    }
}

public class Oride {
    public static void main(String[] args) {
        Base ba = new Base();
        ba.show();
        Sub su = new Sub();
        su.show();
    }
}
