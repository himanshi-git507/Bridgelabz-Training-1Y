#include <stdio.h>

int Numbers() {
    int number1, number2, number3;
    printf("Enter three numbers:\n");
    scanf("%d %d %d", &number1, &number2, &number3);
    printf("Is the first number the largest? %s\n",
           (number1 >= number2 && number1 >= number3) ? "Yes" : "No");

    printf("Is the second number the largest? %s\n",
           (number2 >= number1 && number2 >= number3) ? "Yes" : "No");

    printf("Is the third number the largest? %s\n",
           (number3 >= number1 && number3 >= number2) ? "Yes" : "No");

    return 0;
}
