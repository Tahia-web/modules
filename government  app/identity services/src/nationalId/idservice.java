package nationalId;
import java.util.Scanner;
public class idservice {
    public void registerid(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter applicants name: ");
        String name=input.nextLine();
        System.out.println(" Applicants name = " + name);
        System.out.println("Enter applicants age:");
        int age=input.nextInt();
        System.out.println(" Applicants age = " + age);
        System.out.println(" National id registration recorded");
    }
}
