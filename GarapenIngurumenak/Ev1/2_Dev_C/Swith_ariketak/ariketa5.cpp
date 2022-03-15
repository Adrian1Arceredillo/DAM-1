
#include <stdio.h>
#include <string.h>


int main(){  
          
          
		  
		  int zenb;
		  char oper;

		  
		  printf("Sartu zenbaki bat: \n");
		  scanf("%d",&zenb);
		  printf("Escribe 'p' para saber si es PAR o 'i' para saber si es IMPAR: \n");
		  scanf(" %c",&oper);

		  
		  
		  switch(oper){
		  	
		  	case 'p':
		  		if (zenb%2==0) {
				  	printf("Zenbakia bikoitia da. \n");
				  } else {
				  	printf("Zenbakia EZ da bikoitia. \n");
				  }
				  
				  break;
			case 'i':
		  		if (zenb%2!=0) {
				  	printf("Zenbakia bakoitia da. \n");
				  } else {
				  	printf("Zenbakia EZ da bakoitia. \n");
				  }
				  
				  break;
			
			
			default:
				printf("Something went wrong. Try again...");
				break; 
		  
		  }
		                              
          return 0;
          
        }

