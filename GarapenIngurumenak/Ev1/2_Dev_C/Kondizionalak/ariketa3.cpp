
#include <stdio.h>
#include <string.h>

int main(){  
          
          
		  
		  int num1;
		  int num2;
		  int num3;
		  //char a, e, i, o, u;
		  
		  
		  printf("SARTU KARAKTEREA: \n");
		  printf("Lehenengo zenbakia: ");
		  scanf("%d",&num1);
		  printf("Bigarren zenbakia: ");
		  scanf("%d",&num2);
		  printf("Hirugarren zenbakia: ");
		  scanf("%d",&num3);
		  
		  if (num1 < num2) {
		  	if (num2 < num3) {
			  	printf("Zenbaki handiena %d da \n", num3);
			  } else {
			  		printf("Zenbaki handiena %d da \n", num2);
				}
			} else {
			  	printf("Zenbaki handiena %d da \n", num1);
			  }

		                              
          return 0;
        

}
