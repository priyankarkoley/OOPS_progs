interface Printable {
    void print();
}

class Stat1 implements Printable {// only print
    public void print() {
        System.out.println("Hello from print in Stat1");
    }
}

// inheritance in interface
interface Showable extends Printable {
    void show();// print & show
}

class Stat2 implements Showable {// both print & show
    public void print() {
        System.out.println("Hello from print in Stat2");
    }

    public void show() {
        System.out.println("Welcome from show in Stat2");
    }
}

public class Inh {
    public static void main(String args[]) {
        Printable obj1 = new Stat1();
        obj1.print();

        Showable obj2 = new Stat2();
        obj2.print();
        obj2.show();
    }
}