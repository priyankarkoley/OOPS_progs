class Base{
    private static int a;

    static void setA(int a){Base.a = a;}
    int getA(){return a;}
}

public class Stat {
    public static void main(String[] args) {

        Base obj = new Base();

        Base.setA(54);
        System.out.println("a = " + obj.getA());
    }
}