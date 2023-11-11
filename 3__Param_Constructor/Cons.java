import java.util.*;

class Car {
    int speed;
    int reg_no;

    Car(int speed, int reg_no) { // pramam const
        System.out.println("\n\nspeed: " + speed + "\nreg_no: " + reg_no);
        this.reg_no = reg_no;
        this.speed = speed;
    }
}

public class Cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        System.out.print("Enter reg_no: ");
        int reg_no = sc.nextInt();

        Car obj = new Car(speed, reg_no);

        System.out.println("\n\nspeed: " + obj.speed + "\nreg_no: " + obj.reg_no);
    }
}