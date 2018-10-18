import java.util.Scanner;

public class CalculateAverage{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int itemCount = 0;
        int sum = 0;
        int input;

        while(true)
        {
            System.out.println("Enter a number. Enter 0 to quit: ");
            input = scan.nextInt();
            scan.nextLine();

            if(input == 0) break;

            sum += input;
            itemCount++;
        }

        double average = (double)sum / itemCount;

        System.out.println("Average is " + average);
    }
}