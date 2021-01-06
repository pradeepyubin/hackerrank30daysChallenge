#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";
    int integer;
   double doubleInput;
   char t[100];
   scanf("%d%lf", &integer,&doubleInput);
   getchar();
   scanf("%[^\n]s", t);
   printf("%d\n%.1lf\n",(i+integer), (d+doubleInput));
   printf("%s%s", s,t);
    return 0;
}
