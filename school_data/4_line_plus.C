#include<stdio.h>
int main() {
    int a,result = 0;
    for (int i = 0; i < 4; i++) {
        scanf("%d",&a);
        result += a;
    }
    printf("%d",result);
}