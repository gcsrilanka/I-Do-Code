package arrays;

public class TwoDimensional {
    public static void main(String[] args) {
        int[][] numbers = new int[2][];
        numbers[0] = new int[2];
        numbers[1] = new int[3];

        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[1][0] = 30;
        numbers[1][1] = 40;
        numbers[1][2] = 50;

        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[1][0]);
        System.out.println(numbers[1][1]);
        System.out.println(numbers[1][2]);
    }
}
