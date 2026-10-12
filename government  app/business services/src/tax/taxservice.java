package tax;
import java.util.Scanner;
public class taxservice {
    public void calculatetax(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  your monthly  income:  ");
        double income= input.nextDouble();
        double  tax =income* 0.12;
        System.out.println("tax = " + tax);
    }
    
}
