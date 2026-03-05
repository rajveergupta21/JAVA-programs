class Swapper {
    int a, b;

    Swapper(int x, int y) {
        a = x;
        b = y;
    }

    void swap() {
        System.out.println("Before swapping: " + a + " " + b);
        // Note: This logic prints them in reverse to simulate swapping
        System.out.println("After swapping: " + b + " " + a);
    }

    public static void main(String[] args) {
        Swapper obj1 = new Swapper(5, 6);
        obj1.swap();
        Swapper obj2 = new Swapper(9, 3);
        obj2.swap();
    }
}
