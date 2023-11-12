#include <stdio.h>
int main() {
    int a,b,c;
    scanf("%d",&a);
    b = a / 5;
    c = (a % 5) / 3;
    if (b + c == 0 || (a % 5) % 3 != 0) printf("-1");
    else printf("%d",b+c);
    return 0;
}