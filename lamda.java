import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


public class lamda {
    Interface BinaryOperator {
        int bind(int a, int b) {
            return a + b;
        }
    }
    
/*     class Adder { // 1번 adder
        public int add(int a, int b) {
            return a + b;
        }
    }

   class Adder { //method 통일 // 2번 adder
        public int bind(int a, int b) {
            return a + b;
        }
    } */

   class Adder implements BinaryOperator { // implement binaryop 사용으로 // 3번 adder
        public int bind(int a, int b) {
            return a + b;
        }
    }


 /*    class Multy { // 1번 Multyy
        public int Multy(int a, int b) {
            return a * b;
        }
    }

   class Multy { // 2번 Multyy // bind 사용
        public int bind(int a, int b) {용
            return a * b;
        }
    }   */  
    
    class Multy implements BinaryOp { // 3번 Multyy 
    public int bind(int a, int b) {
        return a * b;
        }
    }  


    // public int exam(int a, int b, int c) {
    //     return a(b, c);
    // }

    public int exam(BinaryOp a, int b, int c) {
        return a.add(b, c);
    }

    class BinaryOp {
    public int add(int a, int b) {
        return a + b;
    }   


    }

public static void main(String[] args) {
    lamda
}
    
}



// 이러한 기본적인 방식
/* public class lamda {
    
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> Multyy = (a, b) -> a * b;
            int result = exam(Multyy, 1, 2);
            System.out.println(result);
        }

        public static int exam(BiFunction<Integer, Integer, Integer> function, int a, int b) {

            return function.apply(a, b);
        }
    }

 */