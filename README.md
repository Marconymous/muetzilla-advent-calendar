# Solutions for Muetzilla's Advent Calendar
[Link To the Advents Calendar](https://muetzilla.github.io/Advent-Calendar/)

## Content
- [Solutions for Muetzilla's Advent Calendar](#solutions-for-muetzillas-advent-calendar)
  - [Content](#content)
    - [Problem 1](#problem-1)
    - [Problem 2](#problem-2)
    - [How To Run The Code](#how-to-run-the-code)

### Problem 1

Hello World in a new Language: Go

[Source Code](Problem01.go)

```go
package main

func main() {
	println("Hello World!")
}

```

### Problem 2 

Calculate the LCM from numbers 1 - 10

[Source Code](Problem02.c)

- The Function `size_t lcm(size_t a, size_t b)` takes 2 numbers as parameters.
- The Bigger number of the two is used as a start.
- Then the program counts up until the number is divisible by both numbers.


### How To Run The Code
- Go
  - Install Golang on your local machine
  - Run the following command in a terminal: `go run .\Problem01.go`
- C
  - Install a C compiler (Ex. GCC)
  - gcc Problem02.c -o Problem2
  - Run the created .EXE file