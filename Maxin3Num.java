class Max {
    int l, m, n;

    Max(int a, int b, int c) {
        l = a;
        m = b;
        n = c;
    }

    void finder() {
        if (l >= m && l >= n) {
            System.out.println("The greatest value: " + l);
        } else if (m >= n && m >= l) {
            System.out.println("The greatest value: " + m);
        } else {
            System.out.println("The greatest value: " + n);
        }
    }

    public static void main(String[] args) {
        Max obj1 = new Max(5, 8, 4);
        obj1.finder();
        Max obj2 = new Max(99, 66, 32);
        obj2.finder();
    }
}
