public class Review056_NestedIfElse {
    public static void main(String[] args){
        int age = 18;
        boolean isCitizen = true;

        if(age >= 18){

            if(isCitizen){
                System.out.println("You can vote!");
            } else {
                System.out.println("You must be a citizen to vote!");
            }
        }else{
            System.out.println("You're not old enough!");
        }
    }
}
