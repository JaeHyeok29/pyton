public class GugudanFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; i++) {
                System.out.println(j + " * " + " = " + String.format("%2d", i * j));
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
