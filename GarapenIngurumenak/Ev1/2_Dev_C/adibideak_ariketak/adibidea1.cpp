
#include <stdio.h>
#include <string.h>


int main(){  
          char izena_osoa [50];
          //char izena[] = "Adrian";
          char izena[] = "";
          char abizena[] = "Arceredillo";
          
          printf("Nola deitzen zara?: \n");
          scanf("%s",&izena);
          printf("Ongietorri, %s. \n",izena);
          printf("Eta abizena? ");
          printf("%s ezta? \n", abizena);
          
          strcpy(izena_osoa, izena);
          strcat(izena_osoa, " " );
          strcat(izena_osoa, abizena);
          
          printf("Ongietorri berriro, %s", izena_osoa);
          
		  return 0;
        
}



