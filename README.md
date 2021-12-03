# Solutions for Muetzilla's Advent Calendar
[Link To the Advents Calendar](https://muetzilla.github.io/Advent-Calendar/)

## Content
- [Solutions for Muetzilla's Advent Calendar](#solutions-for-muetzillas-advent-calendar)
  - [Content](#content)
  - [Problem 1](#problem-1)
  - [Problem 2](#problem-2)
  - [Problem 3](#problem-3)
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


## How To Run The Code
- Go
  - Install Golang on your local machine
  - Run the following command in a terminal: `go run .\Problem01.go`
- C
  - Install a C compiler (Ex. GCC)
  - gcc Problem02.c -o Problem2
  - Run the created .exe / .o file
- Java
  - Install JDK & JRE
  - Run the following commands in a terminal: `javac .\Problem03.java; & java Problem03`