#include <stdio.h>

void decimalToBinary(int n) {
    if (n == 0) {
        printf("0");
        return;
    }

    int binaryNum[32];
    int i = 0;

    while (n > 0) {
        binaryNum[i] = n % 2;
        n = n / 2;
        i++;
    }

    int k;
    for ( k = i - 1; k >= 0; k--) {
        printf("%d", binaryNum[k]);
    }
}

int main(void) {
    int n;

    printf("Enter a decimal number: ");
    scanf("%d", &n);

    printf("Binary representation: ");
    decimalToBinary(n);
    printf("\n");

    return 0;
}