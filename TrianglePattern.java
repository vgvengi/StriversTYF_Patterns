public class TrianglePattern {
    public static void pattern(int n) {
        //spacing
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
            //star
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            //spacing
            for (i = 1; i <= n; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pattern(5);
    }
}

