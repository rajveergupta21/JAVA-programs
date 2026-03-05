class Factorial {
    int facto(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int number = 5;
        int result = obj.facto(number);
        System.out.println("Factorial of the number " + number + " is: " + result);
    }
}
