import java.util.*;

class Car {
    private int speed;  // encapsulated
    private int reg_no; // encapsulated

    int getSpeed() {return speed;}
    int getRegNo() {return reg_no;}

    void setSpeed(int speed) {this.speed = speed;}
    void setRegNo(int reg_no) {this.reg_no = reg_no;}

    Car(int speed, int reg_no) { // pramam const
        System.out.println("\n\nBefore initialization:\nspeed: " + this.speed + "\nreg_no: " + this.reg_no);
        this.reg_no = reg_no;
        this.speed = speed;
    }
}

public class Cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter speed: ");
        int speed = sc.nextInt();
        System.out.print("Enter reg_no: ");
        int reg_no = sc.nextInt();

        Car obj = new Car(speed, reg_no);

        //printing after initialization
        System.out.println("\n\nprinting after initialization:\nspeed: " + obj.getSpeed() + "\nreg_no: " + obj.getRegNo());

        //updating speed and reg_no
        obj.setSpeed(500);
        obj.setRegNo(6541);

        //printing after updation
        System.out.println("\n\nprinting after updation\nspeed: " + obj.getSpeed() + "\nreg_no: " + obj.getRegNo());
    }
}