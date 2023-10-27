#include <stdio.h>
int main() {
    int a,b;
    scanf("%d %d",&a,&b);
    bool yoon = false;
    if (a % 4 == 0|| a % 100) yoon = true;
    if (yoon == true) printf("%d년은 윤년이고, %d월의 마지막 날은 29일입니다.",a,b);
    else printf("%d년 %d월의 마지막 날은 28일 입니다.");
    return 0;
}