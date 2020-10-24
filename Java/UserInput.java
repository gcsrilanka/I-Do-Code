import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name:");
        String name = sc.nextLine();
        sc.close();

        System.out.println("Name : " + name);
    }
}
