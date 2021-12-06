object Problem06 {
    def main(args: Array[String]): Unit = {
        try {
            val input = scala.io.StdIn.readLine("Enter which nth Prime number you want > ").toInt

            val nthPrime = findNthPrime(input)
            println(s"The ${input}th Prime number is: ${nthPrime}")
        } catch {
            case e: NumberFormatException =>  println("This is not a valid input for n!")
        }
        
    }

    private def findNthPrime(n: Int, current: Int = 2, currentN: Int = 0): Int = {
        if (currentN == n) {
            return current - 1;
        }

        if (isPrime(current)) {
            return findNthPrime(n, current + 1, currentN + 1)
        }

        return findNthPrime(n, current + 1, currentN)
    }

    private def isPrime(n: Int): Boolean = {
        for (i <- 2 to (n / 2)) {
            if (n % i == 0) return false
        }

        true
    }
}