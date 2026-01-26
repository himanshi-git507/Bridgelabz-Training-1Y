#include <stdio.h>

int CounterFor() {
    int counter;

    scanf("%d", &counter);

    for (; counter >= 1; counter--) {
        printf("%d\n", counter);
    }

    return 0;
}
