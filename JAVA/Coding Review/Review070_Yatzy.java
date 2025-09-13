public class Review070_Yatzy {
    public static void main(String[] args){
        int dice = 1;

        while (dice <= 6){
            if(dice < 6){
                System.out.print("No Yatzy! ");
            } else{
                System.out.print("Yatzy!");
            }
            if(dice < 5){
                System.out.print(" => ");
            }

            dice = dice + 1;
        }
    }
}
