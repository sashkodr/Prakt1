package mypackage;

class Three {
    private double x;
    private double y;
    private double z;

    public Three(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void printAverage() {
        System.out.println("Середнє значення: " + ((x + y + z) / 3));
    }

    public double divide(double divisor) {
        if (divisor != 0) {
            return (x + y + z) / divisor;
        } else {
            System.out.println("Ділення на нуль!");
            return 0;
        }
    }
}
