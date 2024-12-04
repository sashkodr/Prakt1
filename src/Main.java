package mypackage;

public class Main {
    public static void main(String[] args) {
        One one = new One(2.5, 3.5, 4.5);
        Two two = new Two(1, 2, 3);
        Three three = new Three(6.0, 8.0, 10.0);

        System.out.println("Клас One:");
        one.printSum();
        System.out.println("Множення: " + one.multiply(2.0));

        System.out.println("\nКлас Two:");
        two.printProduct();
        System.out.println("Результат ділення суми: " + two.divideSum(3.0));

        System.out.println("\nКлас Three:");
        three.printAverage();
        System.out.println("Результат ділення: " + three.divide(4.0));
    }
}