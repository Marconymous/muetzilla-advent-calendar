#include <stdio.h>

long faculty(int from);

int main() {
    int input;
    printf("Enter a number > ");
    scanf("%d", &input);


    long fc = faculty(input);
    printf("Faculty -> %i\n", fc);

    return 0;
}

long faculty(int from) {
    if (from > 1) {
        return faculty(from - 1) * from;
    } else {
        return 1;
    }
}
