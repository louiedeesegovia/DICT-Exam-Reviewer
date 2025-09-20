public class Review083_ForLoop09 {
    public static void main(String[] args){
        //Outer loop
        for(int i = 1; i <= 2; i++){
            System.out.println("Outer: " + i);

            for(int j = 1; j <= 3; j++){
                System.out.println("Inner: " + j);
            }
        }
    }
}
