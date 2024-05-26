#include <stdio.h>
#include <ctype.h>
#include <cs50.h>
#include <string.h>

int main(void){
    string s = get_string("Enter: ");
    printf("After: ");
   
    int n = strlen(s);
    for(int i =0; i < n; i++){
        if(islower(s[i]) != 0){
            printf("%c", toupper(s[i]));
        } else {
            printf("%c", s[i]);
        }
    }

    printf("\n");

}