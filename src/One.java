package mypackage;

class One {
    private double var1;
    private double var2;
    private double var3;

    public One(double var1, double var2, double var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public void printSum() {
        System.out.println("Сума: " + (var1 + var2 + var3));
    }

    public double multiply(double factor) {
        return (var1 * var2 * var3) * factor;
    }
}
