#include <cs50.h>
#include <stdio.h>

int main(void){
    int numbers[] = {4, 6, 8, 2, 5, 7, 0};

    for (int i = 0; i<= 7; i++){

        if(numbers[i] == 0){
            printf("Found\n");
            return 0;
        }
    }
printf("Not Found\n");
return 1;
}