public class Review076_NestedLoops02 {
    public static void main(String[] args){
        for(int i = 1; i <= 3; i++){
            System.out.println();
            for(int j = 1; j <= 3; j++)
                System.out.print(i * j + " ");
        }
        System.out.println();
    }
}
