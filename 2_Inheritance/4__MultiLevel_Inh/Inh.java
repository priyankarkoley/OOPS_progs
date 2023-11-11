class A {
    int a;
    void disp() {
        System.out.println("a = " + a);
    }

    A(int a) {
        this.a = a;
    }
}

class B extends A {
    int b;
    void disp() {
        super.disp();
        System.out.println("b = " + b);
    }

    B(int a, int b) {
        super(a);
        this.b = b;
    }
}

class C extends B {
    int c;
    void disp() {
        super.disp();
        System.out.println("c = " + c);
    }

    C(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
}

class Inh {
    public static void main(String[] args) {
        C obj = new C(10, 20, 30);
        obj.disp();
    }
}