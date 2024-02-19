import java.util.Scanner;
public class BodyMassIndexCalculation {
    public static void main(String[] args) {
        //define height (h) ,  weight (w)
        double h, w;

        // Define Scanner
        Scanner doa=new Scanner(System.in);

        //Get value from user
        System.out.print("Enter of Your Height (Meter) : ");
        h=doa.nextDouble();

        System.out.print("Enter of Your Weight (Kg): ");
        w=doa.nextDouble();

        // Calculating Body Mass Index
        double bmi=w/(h*h);

        System.out.println("Body Mass Index : "  + bmi);
    }
}