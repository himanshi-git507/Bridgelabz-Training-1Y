#include <stdio.h>

int Counter() {
    int counter;

    scanf("%d", &counter);

    while (counter >= 1) {
        printf("%d\n", counter);
        counter--;
    }

    return 0;
}
