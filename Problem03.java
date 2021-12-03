class Problem03 {
    public static void main(String[] args) {
        Problem03 p = new Problem03();
        p.run();
    }

    private void run() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i < j)
                    continue;

                int gcd = findGCD(i, j);


                System.out.printf("GCD of %d and %d => %d\n", i, j, gcd);
            }
        }
    }

    private int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}