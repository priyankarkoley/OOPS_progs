import java.util.*;

class Car {
    int speed;
    int reg_no;

    Car() {
        System.out.println("\n\nspeed: " + speed + "\nreg_no: " + reg_no);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed: ");
        this.speed = sc.nextInt();
        System.out.print("Enter reg_no: ");
        this.reg_no = sc.nextInt();
    }
}

public class Cons {
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println("\n\nspeed: " + obj.speed + "\nreg_no: " + obj.reg_no);
    }
}