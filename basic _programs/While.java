#include <stdio.h>

int While() {
    double total = 0.0;
    double number;

    scanf("%lf", &number);

    while (number != 0) {
        total = total + number;
        scanf("%lf", &number);
    }

    printf("%lf", total);

    return 0;
}
