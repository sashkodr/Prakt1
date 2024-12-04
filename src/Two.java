package mypackage;

class Two {
    private int a;
    private int b;
    private int c;

    public Two(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printProduct() {
        System.out.println("Добуток: " + (a * b * c));
    }

    public double divideSum(double divisor) {
        double sum = a + b + c;
        if (divisor != 0) {
            return sum / divisor;
        } else {
            System.out.println("Ділення на нуль:");
            return 0;
        }
    }
}
