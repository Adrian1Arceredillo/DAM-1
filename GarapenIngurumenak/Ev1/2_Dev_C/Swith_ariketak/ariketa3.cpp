
#include <stdio.h>
#include <string.h>

int main(){  
          
          
		  
		  int eguna;
		  
		  
		  printf("Sartu urteko hilabetearen zenbakia [1..12]: ");
		  scanf("%d",&eguna);
		  printf("El numero introducido es: %d \n",eguna);
		  switch (eguna) {
		  	
		  	case 1:
		  		printf("Urtarrilak, 31 egun ditu.");
		  		break;
		  		
			case 2:
				printf("Otsailak, 28 egun ditu.");
		  		break;
		  		
			case 3:
				printf("Martxoak, 31 egun ditu.");
		  		break;
		  		
			case 4:
				printf("Apirilak 30 egun ditu. \n");
		  		break;
		  		
			case 5:
		  		printf("Mahiatzak 31 egun ditu. \n");
		  		break;
		  		
		  	case 6:
		  		printf("Ekainak 30 egun ditu. \n");
		  		break;
		  		
		  	case 7:
		  		printf("Uztailak 31 egun ditu. \n");
		  		break;
		  		
		  	case 8:
		  		printf("Abuztuak 31 egun ditu. \n");
		  		break;
		  		
			case 9:
		  		printf("Irailak 30 egun ditu. \n");
		  		break;
		  		
		  	case 10:
		  		printf("Urriak 31 egun ditu. \n");
		  		break;
		  		
		  	case 11:
		  		printf("Azaroak 30 egun ditu. \n");
		  		break;
		  		
		  	case 12:
		  		printf("Abenduak 31 egun ditu. \n");
		  		break;
		  		
		  	default:
		  		printf("ERROR. \n");
		  		break;
		  	
		  }
		  
		                              
          return 0;
        

}
