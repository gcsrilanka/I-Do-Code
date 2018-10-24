import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Speak speak = new Speak();
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter your name! ");
        String name = read.nextLine();
        for(int i = 0; i < 10; i ++) {
            speak.sayHello(name);
        }

    }

}
