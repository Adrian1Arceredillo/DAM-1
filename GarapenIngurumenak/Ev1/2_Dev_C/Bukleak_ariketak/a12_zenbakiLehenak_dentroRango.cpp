#include <stdio.h>
#include <string.h>

bool primo (int number) {
	
	for (int x = 2; x <= number / 2; ++x) {
				if (number % x == 0) {
					return false;
				} 
			}
	
}

int main() {  
          
        int zenbaki;
        int resto;
        int lim1;
        int lim2;
        
        printf("Sartu tartearen limite txikiena: ");
        scanf("%d",&lim1);
        printf("Sartu tartearen limite handiena: ");
        scanf("%d",&lim2);
        //int number = zenbaki;
        
	
        for (int i = lim1; i <= lim2; ++i) {
        	if (primo(i)) {
        		printf("%d ", i);
			}
		}
				
}

/*
https://parzibyte.me/blog/2019/07/12/numero-primo-c/
https://parzibyte.me/blog/2019/09/26/cpp-numero-primo/
https://www.it-swarm-es.com/es/c%2B%2B/determinar-si-un-numero-es-primo/970123830/
*/

/*
for (int x = 2, n = lim1; x <= number / 2 && n <= lim2; ++x, ++n) {
			if (number % x == 0) {
				isValid = false;
			} else {
				printf("%d, ", number);
			}
		}
*/

