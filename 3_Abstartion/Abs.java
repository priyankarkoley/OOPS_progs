abstract class Shape {
    public int a,b;
    void display(){System.err.println("a = "+a+"\tb = "+b);}
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.err.println("\n\nDrawing Circle! O");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.err.println("\n\nDrawing rectangle! [__]");
    }
}

class Square extends Shape {
    void draw() {
        System.err.println("\n\nDrawing square! []");
    }
}

public class Abs {
    public static void main(String[] args) {
        Shape obj;
        
        obj= new Circle();
        obj.a=3;
        obj.b=4;
        obj.draw();
        obj.display();

        obj= new Rectangle();
        obj.a=5;
        obj.b=6;
        obj.draw();
        obj.display();

        obj= new Square();
        obj.a=7;
        obj.b=8;
        obj.draw();
        obj.display();

    }
}