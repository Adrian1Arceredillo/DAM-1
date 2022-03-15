
#include <stdio.h>
#include <string.h>


int main(){  
          
          
		  
		  int zenb1;
		  int zenb2;
		  char oper;

		  
		  printf("Sartu zenbaki bat: \n");
		  scanf("%d",&zenb1);
		  printf("Sartu beste zenbaki bat: \n");
		  scanf("%d",&zenb2);
		  printf("Escribe '<' para ver el menor y '>' para ver el mayor: \n");
		  scanf(" %c",&oper);
		  
		  
		  switch(oper){
		  	
		  	case '>':
		  		if (zenb1 > zenb2) {
				  	printf("%d es mayor que %d \n",zenb1,zenb2);
				  } else if (zenb2 > zenb1) {
				  	printf("%d es mayor que %d \n",zenb2,zenb1);
				  }
				  break;
			case '<':
				if (zenb1 < zenb2) {
					printf("%d es menor que %d \n",zenb1,zenb2);
				} else if (zenb2 < zenb1) {
					printf("%d es menor que %d \n",zenb2,zenb1);
				}
				break;
			default:
				printf("Something went wrong. Try again...");
				break; 
		  
		  }
		                              
          return 0;
          
        }


