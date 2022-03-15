
#include <stdio.h>
#include <string.h>

int main() {  
          
        int urtea;
        
        printf("Sartu urtea: ");
		scanf("%d",&urtea);
		
		if ((urtea % 4 == 0 && urtea % 100 != 0) || (urtea % 400 == 0))   {
			printf("Sarturiko urtea (%d), BISIESTOA da. ", urtea);
		} else {
			printf("Sarturiko urtea (%d), EZ da bisiestoa. ", urtea);
		}
}

/*
4.	Idatzi C programa bat zeinek sartutako urtea bisiestoa den edo ez egiaztatzen duen.
*/
