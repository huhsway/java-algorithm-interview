package ch02;

public class LambdaExpressionExample {

    /*
    @FunctionalInterface
    Object Class의 메서드를 제외하고 '구현해야 할 추상 메서드가 하나만 정의된 인터페이스'
    참고: https://colevelup.tistory.com/10
     */
    @FunctionalInterface
    interface MathInterface {
        double getPiValue();
    }

    public static void main(String[] args) {
        MathInterface math1 = new MathInterface() {
            @Override
            public double getPiValue() {
                return 3.141592;
            }
        };
        System.out.println("Pi: " + math1.getPiValue());

        // ---

        MathInterface math2 = () -> 3.141592;
        System.out.println("Pi: " + math2.getPiValue());
    }

}