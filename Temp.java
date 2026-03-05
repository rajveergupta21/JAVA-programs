class Temp {
    double celsius;

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temp in F = " + fahrenheit);
    }

    public static void main(String[] args) {
        Temp obj = new Temp();
        obj.celsius = 37;
        obj.convert();
    }
}
