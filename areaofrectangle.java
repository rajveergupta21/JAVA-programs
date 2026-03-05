class Rectangle {
    double l, b;

    void calculate() {
        double area = l * b;
        double perimeter = 2 * (l + b);
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.l = 10;
        obj.b = 2;
        obj.calculate();
    }
}
