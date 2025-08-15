import java.util.Scanner;

public class Review026_DynamicSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to add?: ");
        int count = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= count; i++){
            System.out.println("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println(("Total sum is: " + sum));
        scanner.close();
    }
}
