class Problem13 {
    private static int MAX = 100
    private static int MIN = 1

    static void main(String[] args) {
        run()
    }

    static void run() {
        final int generatedNumber = (int) ((Math.random() * (MAX - MIN)) + MIN)
        while (true) {
            print "Guess a number ($MIN, $MAX) > "
            def i = System.in.newReader().readLine() as Integer

            if (i == generatedNumber) {
                println "You guessed correctly : $i"
                break
            }

            if (i > generatedNumber) {
                println "Your guess was too high"
                if (i < MAX) {
                    MAX = i
                }
            } else {
                println "Your guess was too low"
                if (i > MIN) {
                    MIN = i
                }
            }

        }
    }
}