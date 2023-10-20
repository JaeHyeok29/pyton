public class GugudanWhile {

    public static void main(String[] args) {
        int i = 2;
        while (i++ < 9) {
            int j = 0;
            while (j++ < 9) {
                System.out.println(i + " * " + j + " = " + String.format("%2d", i * j));
                //System.out.println("   "); //줄간격
            }
            //System.out.println(); // 단수 간격
        }
    }
}