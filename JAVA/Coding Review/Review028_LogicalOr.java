import java.util.Scanner;

public class Review028_LogicalOr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        if(10 > x || x < 25){
            System.out.println("The number Ranges from 11 to 24.");
        }
        else{
            System.out.println("The number is not in the range");
        }
    }
}
