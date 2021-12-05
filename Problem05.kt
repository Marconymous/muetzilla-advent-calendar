import kotlin.math.pow

enum class Shape(val circumerence: () -> Double, val area: () -> Double) {
    SQUARE(
        fun(): Double {
            print("What is the length of side A > ")
            val a = readLine()?.toDoubleOrNull() ?: 0.0
            print("What is the length of side B > ")
            val b = readLine()?.toDoubleOrNull() ?: 0.0

            return a * 2 + 2 * b
        },
        fun(): Double {
            print("What is the length of side A > ")
            val a = readLine()?.toDoubleOrNull() ?: 0.0
            print("What is the length of side B > ")
            val b = readLine()?.toDoubleOrNull() ?: 0.0

            return a * b
        }
    ),

    TRIANGLE(
        fun(): Double {
            val sides = Array(3) {
                print("What is the length of side ${'A' + it} > ")
                readLine()?.toDoubleOrNull() ?: 0.0
            }

            return sides.reduce(fun(a, b) = a + b)
        },
        fun(): Double {
            print("What is the length of side C > ")
            val a = readLine()?.toDoubleOrNull() ?: 0.0
            print("What is the length of the height c > ")
            val b = readLine()?.toDoubleOrNull() ?: 0.0

            return a * b / 2
        }
    ),

    CIRCLE(
        fun(): Double {
            print("What is the radius of the circle > ")
            val r = readLine()?.toDoubleOrNull() ?: 0.0

            return r * 2 * Math.PI
        },
        fun(): Double {
            print("What is the radius of the circle > ")
            val r = readLine()?.toDoubleOrNull() ?: 0.0

            return r * Math.PI.pow(2.0)
        }
    );
}

fun main() {
    val shapelist = Shape.values().map { it.name }.reduce(fun(s, s1) = "$s $s1,").removeSuffix(",")
    print("Which Shape should be calculated ($shapelist) > ")
    val shape = readLine() ?: run {
        println("Shape not entered!")
        return@main
    }

    val converter = Shape.valueOf(shape.uppercase())

    print("What operation should be done (Circumference, Area) > ")
    val op = readLine() ?: run {
        println("Operation not entered!")
        return@main
    }

    val calc: () -> Double = when (op) {
        "circumference" -> converter.circumerence
        "area" -> converter.area

        else -> {
            println("Operation not valid!")
            return
        }
    }

    val res = calc()

    println("The $op of $shape is $res")
}