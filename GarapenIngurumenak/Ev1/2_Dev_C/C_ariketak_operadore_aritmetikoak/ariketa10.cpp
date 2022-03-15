
#include <stdio.h>
#include <string.h>

int main(){  
          
		  
		  float nota1, nota2, nota3, media;
		  
		  printf("IKASLEAREN NOTAK: \n");
		  printf("\nProgramazioa: ");
          scanf("%f",&nota1);
          printf("Analisia: ");
          scanf("%f",&nota2);
          printf("Sareak: ");
          scanf("%f",&nota3);
          //scanf("%d",&zenb2);
          
          media = (nota1 + nota2 + nota3) / 3;

          
          printf("Batazbestekoa %.2f \n", media);

		  		 
 
		  
                            
          return 0;
        

}
