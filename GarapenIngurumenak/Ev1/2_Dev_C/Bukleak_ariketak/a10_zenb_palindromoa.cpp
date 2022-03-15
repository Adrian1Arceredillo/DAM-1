#include <stdio.h>
#include <string.h>

int main() {  
          
        int zenbaki;
        int resto;
        int reverse_zenbaki = 0;
        
        printf("Sartu zenbaki bat: ");
        scanf("%d",&zenbaki);
        
        
        
        int number = zenbaki;
        
        while (number > 0) {
            resto = number % 10;
            number = number / 10;
            reverse_zenbaki = reverse_zenbaki*10 + resto;
        }
        
        if (reverse_zenbaki == zenbaki) {
        	printf("%d zenbakia KAPIKUA da. ", zenbaki);
		} else {
			printf("%d zenbakia EZ da KAPIKUA. ", zenbaki);
		}
		
}
/*
https://ghjf3.blogspot.com/2016/12/numero-capicua.html
*/
