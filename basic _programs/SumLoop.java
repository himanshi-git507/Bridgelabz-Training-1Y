#include <stdio.h>

int SumLoop() {
    int n;
    int sum_loop = 0;
    int sum_formula;

    scanf("%d", &n);

    if (n > 0) {  
        
        int i = 1;
        while (i <= n) {
            sum_loop += i;
            i++;
        }

       
        sum_formula = n * (n + 1) / 2;

       
        printf("Sum using while loop = %d\n", sum_loop);
        printf("Sum using formula = %d\n", sum_formula);

     
        if (sum_loop == sum_formula) {
            printf("Both methods give the same result.\n");
        } else {
            printf("There is a mismatch in the results.\n");
        }
    } else {
        printf("The number %d is not a natural number.\n", n);
    }

    return 0;
}
