
#include <stdio.h>
#include <string.h>

int main(){  
          
          
		  
		  int urtea;
		  
		  
		  printf("SARTU URTEA: \n");
		  scanf("%d",&urtea);
		  
		  
		  if ((urtea %4 == 0 && urtea %100 != 0) || (urtea %400 == 0)) {
		  	printf("%d urtea, bisiestoa.", urtea);
		  } else {
		  	printf("%d urtea, ez da bisiestoa.", urtea);
		  }
		  	

		                              
          return 0;
        

}
