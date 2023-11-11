interface Drawable {
    public void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Inter {
    public static void main(String[] args) {
        Drawable obj;

        obj = new Rectangle();
        obj.draw();

        obj = new Circle();
        obj.draw();
    }
}