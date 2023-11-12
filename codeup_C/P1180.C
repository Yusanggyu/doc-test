#include <stdio.h>
int main() {
    int a,b,result = -1;
    bool check = false;
    scanf("%d",&a);
    int line[a];
    for (int i = 0; i < a; i++) scanf("%d", &line[i]);
    scanf("%d",&b);
    for (int i = 0; i < a; i++) {
        result++;
        if (line[i] > b) { check = true; break; }
    }
    if (check == false) printf("%d",a+1);
    else printf("%d",result+1);
    return 0;
}