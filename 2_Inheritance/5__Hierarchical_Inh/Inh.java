class Goru {
    void run() {
        System.out.println("\nRunning Goruuu!");
    }
}

class Priya extends Goru {
    void run() {
        super.run();
        System.out.println("Running Priya!\n");
    }
}

class Gandu extends Goru {
    void run() {
        super.run();
        System.out.println("Running Gandu!\n");
    }
}

public class Inh {
    public static void main(String[] args) {
        Goru obj;

        obj = new Goru();
        obj.run();

        obj = new Priya();
        obj.run();

        obj = new Gandu();
        obj.run();
    }
}