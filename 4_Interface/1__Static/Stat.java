interface Drawable {
    public void draw();

    int a = 1001;// public static final

    // default method is non-static & not final by default
    default void speak() {
        System.out.println("quak quak..!!");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void speak() {
        System.out.println("pak pak..!!");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Stat {
    public static void main(String[] args) {
        Drawable obj;
        obj = new Rectangle();
        obj.draw();
        obj.speak();
        obj = new Circle();
        obj.draw();
        obj.speak();
    }
}