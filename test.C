#include <stdio.h>
int main(void) {
    char a[3];
    scanf("%s",a);
    int result = ((a[1] - '0') * 10 + a[0] - '0')*2;
    printf("%d\n",result);
    if (result <= 50) printf("GOOD");
    else printf("OH MY GOD");
    return 0;
    }