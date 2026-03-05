class Oddeven {
    int number;

    void check() {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void main(String[] args) {
        Oddeven obj = new Oddeven();
        obj.number = 7;
        obj.check();
    }
}
