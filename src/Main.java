import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String nameInput = scan.next();

       String results = nameInput.substring(0, 1).toUpperCase() + nameInput.substring(1);
       System.out.println("Welcome: " + results);

       Scanner age = new Scanner(System.in);
       System.out.println("Enter your age: ");
       int ageProvided = age.nextInt();

       if(ageProvided <= 20){
           System.out.println("You are still young...");
       } else {
           System.out.println("Your granted access..🎉🥳");
       }


    }
}