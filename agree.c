#include <cs50.h>
#include <stdio.h>

int main(void)
{
//prompt user to get string

char c = get_char("Do you agree? y/n");
//check wheter user agree 

if(c=='y' || c == 'Y')
{
    printf("agreed.\n");

} 
else if (c == 'n' || c == 'N')
{
    printf("Not agreed.\n");
}

}