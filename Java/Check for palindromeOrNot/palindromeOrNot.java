import java.io.*;
import java.util.*;


//this will show your word is a palindrome Or not

public class palindromeOrNot {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        StringBuilder s = new StringBuilder();
        s.append(input);
        s.reverse();
        
        if(s.toString().equals(input)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}