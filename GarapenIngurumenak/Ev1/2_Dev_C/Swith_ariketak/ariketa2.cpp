
#include <stdio.h>
#include <string.h>

int main(){  
          
          
		  
		  char eguna;
		  
		  
		  printf("Sartu asteko egun bat: ");
		  scanf("%d",&eguna);
		  
		  switch (eguna) {
		  	
		  	case 1:
		  		printf("Gaur Astelehena da.");
		  		break;
			case 2:
				printf("Gaur Asteartea da. \n");
		  		break;
			case 3:
				printf("Gaur Azteazkena da. \n");
		  		break;
			case 4:
				printf("Gaur Osteguna da. \n");
		  		break;
			case 5:
		  		printf("Gaur Ostirala da. \n");
		  		break;
		  	case 6:
		  		printf("Gaur larunbata da. \n");
		  		break;
		  	case 7:
		  		printf("Gaur igandea da. \n");
		  		break;
		  	default:
		  		printf("ERROR. \n");
		  		break;
		  	
		  }
		  
		                              
          return 0;
        

}
