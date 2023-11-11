class Car {
    int speed;
    int reg_no;
}

public class Cons {
    public static void main(String[] args) {
        Car obj = new Car(); // def const is called
        System.out.println("\n\nspeed: " + obj.speed + "\nreg_no: " + obj.reg_no);
        obj.speed = 5;
        obj.reg_no = 50;
        System.out.println("\n\nspeed: " + obj.speed + "\nreg_no: " + obj.reg_no);
    }
}