import java.util.*;

class Area {
    final double PAI = 3.1415;

    public double getArea(double rad){return PAI *rad*rad;}
    public double getArea(int sq_length){return sq_length*sq_length;}
    public double getArea(int length, int width){return length*width;}
}

public class CalcArea{
    public static void main(String[] args) {

        double rad;
        int length, width, sq_length;
        System.out.print("\n\n1. Calculate area of cicrle\n2. Calculate area of Square\n3. Calculate area of Rectangle\nEnter Choice: ");
        
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Area obj = new Area();
        switch(choice){
            case 1:
                System.out.print("Enter rad: ");
                rad = sc.nextDouble();
                System.out.println("AREA OF CIRCLE = "+obj.getArea(rad));
            break;
            
            case 2:
                System.out.print("Enter length: ");
                sq_length=sc. nextInt();
                System.out.println("AREA OF SQUARE = "+obj.getArea(sq_length));
            break;

            case 3:
                System.out.print("Enter length: ");
                length = sc. nextInt();
                System.out.print("Enter width: ");
                width = sc. nextInt();
                System.out.println("AREA OF RECTANGLE = "+obj.getArea(length, width));
            break;
        }
    }
}