
#include <stdio.h>
#include <string.h>


int main(){  
          
          float radio, azalera, luzera;
          const double PI = 3.14159;
		  
		  printf("Programa honek zirkunferentzia baten \n");
		  printf("luzera eta azalera kalkulatzen ditu. \n \n");
		  printf("Sartu erradioa: ");
		  scanf("%f",&radio);
		  
		  luzera = (2 * PI * radio);
		  azalera = PI * (radio * radio);
		  
		  printf("Luzera = %.2f zm da. \n", luzera);
		  printf("Azalera = %.2f zm2 da. \n", azalera);
                            
          return 0;
        

}
