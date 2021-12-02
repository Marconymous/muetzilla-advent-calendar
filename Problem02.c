#include "stdio.h"
#include <stdbool.h>

#define MIN 1
#define MAX 10

size_t lcm(size_t a, size_t b);

int main() {
    for (int i = MIN; i <= MAX; i++) {
        for (int j = MIN; j <= MAX; j++) {
            if (i > j) continue;

            size_t nr = lcm(i, j);

            printf("LCM of %d & %d => %d\n", i, j, nr);
        }
    }

    return 0;
}

size_t lcm(size_t a, size_t b) {
    int max = (a > b) ? a : b;

    while (1) {
        if (max % a == 0 && max % b == 0) {
            return max;
        }

        ++max;
    }
}