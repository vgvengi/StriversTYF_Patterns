public class Pattern7 {

    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            //spacing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            //spacing
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println( );
        }
    }

    public static void main(String args[]){
        pattern7(5);
    }
}

