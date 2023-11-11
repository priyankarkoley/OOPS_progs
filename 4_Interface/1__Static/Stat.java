interface Drawable {
    public void draw();

    int a = 1001;// public static final

    // default method is non-static & not final by default
    default void speak() {
        System.out.println("quak quak..!!");
    }

    //static methods in interface are not inherited(intrface to another interface) & not implemented(can not be overridden to subclass) and can be called directly by Drawable.run()
    static void run(){System.out.println("drawbale running!!\n");}
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void speak() {
        System.out.println("pak pak..!!");
    }
    //this is a seperate static method and can be called by Rectangle.run
    public static void run(){System.out.println("rect running!!\n");}
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
    //this is a seperate static method and can be called by Circle.run
    public static void run(){System.out.println("circ running!!\n");}

}

public class Stat {
    public static void main(String[] args) {
        Drawable obj;
        Drawable.run();
        obj = new Rectangle();
        obj.draw();
        obj.speak();
        Rectangle.run();
        obj = new Circle();
        obj.draw();
        obj.speak();
        Circle.run();
    }
}