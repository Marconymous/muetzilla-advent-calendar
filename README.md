# Solutions for Muetzilla's Advent Calendar
[Link To the Advents Calendar](https://muetzilla.github.io/Advent-Calendar/)

## Content
- [Solutions for Muetzilla's Advent Calendar](#solutions-for-muetzillas-advent-calendar)
  - [Content](#content)
  - [Problem 1](#problem-1)
  - [Problem 2](#problem-2)
  - [Problem 3](#problem-3)
  - [Problem 4](#problem-4)
  - [Problem 4](#problem-4-1)
  - [How To Run The Code](#how-to-run-the-code)

## Problem 1

Hello World in a new Language: Go

[Source Code](Problem01.go)

```go
package main

func main() {
	println("Hello World!")
}

```

## Problem 2 

Calculate the LCM from numbers 1 - 10

[Source Code](Problem02.c)

- The Function `size_t lcm(size_t a, size_t b)` takes 2 numbers as parameters.
- The Bigger number of the two is used as a start.
- Then the program counts up until the number is divisible by both numbers.

```c
size_t lcm(size_t a, size_t b) {
    int max = (a > b) ? a : b;

    while (1) {
        if (max % a == 0 && max % b == 0) {
            return max;
        }

        ++max;
    }
}
```


## Problem 3

Calculate the GCD of all numbers from 1 - 10

[Source Code](Problem03.java)

- The Function `private int findGCD(int a, int b)` takes 2 numbers as parameters.
- This Function will be called recursively with the args `(b, a % b)` until `b == 0` and `a` is returned.

```java
private int findGCD(int a, int b) {
    if (b == 0) return a;
    return findGCD(b, a % b);
}
```

## Problem 4

Create a Calculator using Python which can do (+-*/) operations.

[Source Code](Problem04.py)

- First the calculation is split into it's parts (numbers & operators)
  - 15 + 53 * 10 => `['15', '+', '53', '*', '10']`
- Then the operations * and / are performed
  - `def point_calc(calc):`
  - `=> ['15', '+', '530']`
- Finally the operations + and - are performed
  - `def dash_calc(calc):`
  - `=> [545]`

```python
split = split_calculation(calculation)
try:
    after_point = point_calc(split)
    after_dash = dash_calc(after_point)
    print(f"The result is: {after_dash}")
except:
    print("The calculation you entered is not Valid!")
```


## Problem 4

Make a Program to calculate the circumference and area of a Shape

[Source Code](Problem05.kt)

Enum with functions for shapes `enum class Shape(val circumerence: () -> Double, val area: () -> Double)`

## How To Run The Code
- Go
  - Install Golang on your local machine
  - Run the following command in a terminal: `go run .\ProblemXX.go`
- C
  - Install a C compiler (Ex. GCC)
  - Run the following command: `gcc ProblemXX.c -o ProblemXX`
  - Run the created .exe / .o file
- Java
  - Install JDK & JRE
  - Run the following commands in a terminal: `javac .\ProblemXX.java; & java ProblemXX`
- Python
  - Install Python on your system
  - Run the following command: `python ProblemXX.py`
- Kotlin
  - Install Kotlin
  - Run the following command: `kotlinc ProblemXX.kt -include-runtime -d ProblemXX.jar`
  - To Run the Problem, run: `java -jar ProblemXX.kt` 