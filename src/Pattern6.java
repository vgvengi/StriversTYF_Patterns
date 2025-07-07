public class Pattern6 {
    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
    public static void main(String []args){
        pattern6(5);
    }

}

