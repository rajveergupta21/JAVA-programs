class Leap {
    int year;

    void count() {
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        Leap obj = new Leap();
        obj.year = 2026;
        obj.count();
    }
}
