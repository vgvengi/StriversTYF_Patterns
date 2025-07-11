public class DiamondPattern {
    public static void patternOne(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void patternTwo(int n){
        for(int i=1;i<=n;i++){
            //space
                //spacing
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                //star
                for(int j=1;j<=n*2-i-i+1;j++){
                    System.out.print("*");
                }
                //spacing
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                System.out.println( );
            }

    }
public static void main(String args[] ){
    patternOne(5);
    patternTwo(5);
}
}
