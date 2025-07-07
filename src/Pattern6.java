public class Pattern6 {
    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String []args){
        pattern6(5);
    }

}
