public class GugudanFuction {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j +  " = " + String.format("%2d", i * j));
            }
            System.out.println();
        }
    }
}
