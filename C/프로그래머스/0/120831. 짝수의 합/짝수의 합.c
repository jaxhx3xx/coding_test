#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int sum=0;
    int i;
    for(i=1; i<=n; i++) 
    {
        if(i%2==0) {
        printf("%d",i);
        sum += i;
        }
        
    }
    
    return sum;
}