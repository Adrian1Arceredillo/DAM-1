
#include <stdio.h>
#include <string.h>






int main(){  
          char izena_osoa [50];
          char izena[50];
          char abizenabat[50];
          char abizenabi[50];
          
          
          
          printf("Nire izena: ");  //komila artekoa bistaratuAdAAko da pantailan 
          scanf("%s",&izena); 
          
          printf("\t 1. Abizena: ");
          scanf("%s",&abizenabat); 
          
          printf("\t \t 2. Abizena: ");
          scanf("%s",&abizenabi);
          
          strcpy(izena_osoa, izena);
          strcat(izena_osoa, " ");
          strcat(izena_osoa, abizenabat);
          strcat(izena_osoa, " ");
          strcat( izena_osoa, abizenabi);
          //scanf("%s",izena_osoa); 
          printf("Ongietorri, %s", izena_osoa);
          
          
          return 0;
        
		//int c;
          //printf("Sartu zenbaki bat: \n");  //komila artekoa bistaratuko da pantailan 
          //scanf("%d",&c); 
         // printf("Zenbakia = %d",c);
          //return 0;

}



