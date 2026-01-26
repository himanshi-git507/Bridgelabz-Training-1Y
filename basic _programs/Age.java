#include <stdio.h>

int Age() {
    int age;

    printf("Enter age: ");
    scanf("%d", &age);

    if (age >= 18) {
        printf("The person's age is %d and can vote.", age);
    } else {
        printf("The person's age is %d and cannot vote.", age);
    }

    return 0;
}
