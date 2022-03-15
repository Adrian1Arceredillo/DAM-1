
#include <stdio.h>
#include <string.h>

int main() {  
          
        char nireKarakterea;
         
        printf("Sartu karaktere bat: ");
        scanf("%c", &nireKarakterea);
        
        if (nireKarakterea == 'a' || nireKarakterea == 'A' || nireKarakterea == 'e' || nireKarakterea == 'E' || nireKarakterea == 'i' || nireKarakterea == 'I' || nireKarakterea == 'o' || nireKarakterea == 'O' || nireKarakterea == 'u' || nireKarakterea == 'U') {
		 	printf("Sarturiko karakterea (%c), BOKALA da. ",nireKarakterea);
			
		} else if ((nireKarakterea > 'a' && nireKarakterea <= 'z') || (nireKarakterea > 'A' && nireKarakterea <= 'Z')) {
			printf("Sarturiko karakterea (%c), KONTSONANTEA da. ",nireKarakterea);
		} else {
			printf("Sarturiko karakterea (%c), EZ da letra bat. ",nireKarakterea);
		}

}

/*
2.	Idatzi C programa bat zeinek karaketere bat bokala edo kontsonantea den egiaztatzen duen.
*/
