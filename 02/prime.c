#include <stdio.h>

void main()
{
    int num, i = 2, prime = 1;
    printf("Input number\n");
    scanf("%d", &num);
    if (num <= 1)
    {
        printf("Neither prime nor composite\n");
    }
    else
    {
        while (i <= num/2)
        {
            if (num % i == 0)
            {
                prime = 0;
                break;
            }
            i++;
        }
        if (prime == 1)
            printf("%d is prime\n", num);
        else
            printf("%d is not prime\n", num);
    }
}