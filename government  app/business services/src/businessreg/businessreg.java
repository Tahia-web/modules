package businessreg;
import java.util.Scanner;
public class businessreg {
    public void registerbusiness(){
        Scanner  input=new Scanner(System.in);
        System.out.println("Enter business name");
        String  name=input.nextLine();
        System.out.println(" business name = " + name);
        System.out.println("enter business id");
        int id=input.nextInt();
        System.out.println(" business id = " + id);
        System.out.println("registration request  recorded");
    }
}
