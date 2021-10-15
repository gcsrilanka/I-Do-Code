import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String user input
        System.out.println("What is your name:");
        String name = sc.nextLine();
        System.out.println("Name : " + name);

        //Integer user input
        System.out.println("What is your age:");
        int age = sc.nextInt();
        System.out.println("Age : " + age);

        //Double user input
        System.out.println("What is your salary:");
        double salary = sc.nextDouble();
        System.out.println("Salary : " + salary);

        //Boolean user input
        System.out.println("What is your marriage status (true/false):");
        boolean marriageStatus = sc.nextBoolean();
        System.out.println(marriageStatus);

        sc.close();
    }
}
