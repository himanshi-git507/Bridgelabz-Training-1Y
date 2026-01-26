#include <stdio.h>

int Total() {
    double total = 0.0;
    double number;

    scanf("%lf", &number);

    while (number != 0) {
        total = total + number;
        scanf("%lf", &number);
    }

    printf("Sum = %lf", total);

    return 0;
}
