
#include <stdio.h>  //preprocessor directives 
#define SQ(a) (a * a)   //cool

int main(){

    int arr[] = {1, 2, 3,4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);


    printf("Hello, World!\n");

    for(int i = 0; i < size; i++){

        printf("Square of Num %d: %d \n", arr[i], SQ(arr[i]));
    }

    char ch; 
    char word[10];

    int i = 0;
    while(1){
        ch = getchar();
        word[i] = ch;
        if(ch == '\n'){
            break;
        }
        i++;
    }

    printf("You entered the word, %s", word);



    return 0;
}

//Preprocessing: installs the pre process directives, the define, macros and needed libraries to run the code
//Compiling: complies hll code to assembly code. :.asm
//Assembling: transform to binary code 
//linking: Link back to executable(in binary) to then run on machine. link static lib and dynamic lib togehter 