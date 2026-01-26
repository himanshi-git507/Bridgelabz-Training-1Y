#include <stdio.h>

int NaturalNumber() {
    int n;
    int sum;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (n > 0) {
        sum = n * (n + 1) / 2;
        printf("The sum of %d natural numbers is %d", n, sum);
    } else {
        printf("The number %d is not a natural number", n);
    }

    return 0;
}
