public class Review059_IfElse06 {
    public static void main(String[] args){
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3;

        if(isLoggedIn && (isAdmin || securityLevel <= 2)){
            System.out.println("Access granted!");
        } else{
            System.out.println("Access denied");
        }
    }
}
