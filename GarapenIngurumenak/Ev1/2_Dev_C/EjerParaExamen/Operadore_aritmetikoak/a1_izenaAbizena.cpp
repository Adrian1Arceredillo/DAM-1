
#include <stdio.h>
#include <string.h>

int main(){  
          
          char izenaOsoa[50];
          char izena[50] = "";
          char abizena1[50] = "";
          char abizena2[50] = "";
          
          printf("Sartu izena: ");
          scanf("%s", &izena);
          printf("Sartu lehenengo abizena: ");
          scanf("%s", &abizena1);
          printf("Sartu bigarren abizena: ");
          scanf("%s", &abizena2);
          
          printf("Nire izena: %s\n", izena);
          printf("\t 1. Abizena: %s\n", abizena1);
          printf("\t\t 2. Abizena: %s\n", abizena2);
          
          return 0;
        

}
