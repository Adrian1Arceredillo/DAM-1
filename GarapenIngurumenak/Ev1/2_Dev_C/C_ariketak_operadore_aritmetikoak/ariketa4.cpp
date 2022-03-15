
#include <stdio.h>
#include <string.h>

int main(){  
          
          
		  
		  int millas;
		  int cambio = 1609;
		  double km;
		  	
		  
		  printf("Programa honek 'mila'-tatik \n");
		  printf("Kilometroetara pasatzen du \n \n");
		  printf("Sartu millak: ");
		  scanf("%d",&millas);
		  //printf("El radio es: %d", radio);
		  
		  km = millas / cambio; 
		  
		  
		  printf("%d milla ",millas);
		  printf("%.1f Km dira",km);
		  
 
		  
                            
          return 0;
        

}
