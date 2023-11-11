import java.util.*;

class Car {
    int speed;
    int reg_no;

    Car() {
        this.speed = 5;
        this.reg_no = 6541;
    }
    
    Car(int speed) { // pramam const
        System.out.println("\n\nspeed: " + this.speed + "\nreg_no: " + this.reg_no);
        this.speed = speed;
    }

    Car(int speed, int reg_no) { // pramam const
        System.out.println("\n\nspeed: " + this.speed + "\nreg_no: " + this.reg_no);
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

        Car obj1 = new Car();
        Car obj2 = new Car(speed);
        Car obj3 = new Car(speed, reg_no);

        System.out.println("\n\nOBJ: 1 ->speed: " + obj1.speed + "\nreg_no: " + obj1.reg_no+"\n");
        System.out.println("\n\nOBJ: 2 ->speed: " + obj2.speed + "\nreg_no: " + obj2.reg_no+"\n");
        System.out.println("\n\nOBJ: 3 ->speed: " + obj3.speed + "\nreg_no: " + obj3.reg_no+"\n");
    }
}