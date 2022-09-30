#include <stdio.h>

int main(int argc, char *argv[])
{
    int zenb;
    int *punteroa;
    printf("Sartu zenbaki bat:");
    scanf("%i", &zenb);
    printf("Zuk sartutako zenbakia hurrengoa da: %i \n", zenb);
    printf("Zuk sartutako zenbakia emen dago gordeta: %p \n", &zenb);
    punteroa = &zenb;
    *punteroa = 7;
    printf("Zuk sartutako zenbakia hurrengoa da: %i \n", zenb);
    return 0;
}