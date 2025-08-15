import java.util.Scanner;

public class Review027_LogicalAnd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        if(x < 5 && x < 10){
            System.out.println("The number is less than 5");
        }
        else{
            System.out.println("The number is greater than 5");
        }
    }
}
