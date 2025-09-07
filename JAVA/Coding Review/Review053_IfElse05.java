public class Review053_IfElse05 {
    public static void main(String[] args) {
        int time = 24;

        if (time >= 1 && time < 6) {
            System.out.println("It's dawn just sleep!");
        } else if (time < 12 && time >= 6){
            System.out.println("Good morning!");
        } else if (time == 12) {
            System.out.println("Good noon!");
        } else if (time > 12 && time <= 18) {
            System.out.println("Good Afternoon");
        } else if (time > 18 && time <= 24) {
            System.out.println("Good Evening!");
        }else{
            System.out.println("Invalid Number!");
        }
    }
}
