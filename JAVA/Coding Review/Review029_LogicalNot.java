import java.util.Scanner;

public class Review029_LogicalNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner.nextInt();

        if(!(x<5 && x < 10)){
            System.out.println("Higher than 5!");
        }
        else{
            System.out.println("Lower than 5!");
        }

    }
}
