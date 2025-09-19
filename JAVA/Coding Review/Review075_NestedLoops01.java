public class Review075_NestedLoops01 {
    public static void main(String[] args){
        for(int i = 1; i <= 2; i++){
            System.out.println("Outer: " + i);

            //Inner Loop
            for(int j = 1; j <= 3; j++){
                System.out.println("Inner: " + j);
            }
        }
    }
}
