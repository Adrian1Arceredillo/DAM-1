#include <stdio.h>
#include <string.h>
bool lehenaDenKonprobatu(int numero) {
	
	for (int i = 2; i <= numero / 2; ++i) {
		if (numero % i == 0) {
			return false;
		} 
	}
}

int main() {
	
	int zenbakia;
	int lim1;
    int lim2;
        
    printf("Sartu tartearen limite txikiena: ");
    scanf("%d",&lim1);
    printf("Sartu tartearen limite handiena: ");
    scanf("%d",&lim2);
    
    for (int i = lim1; i <= lim2; ++i) {
    	if(lehenaDenKonprobatu(i)) {
    		printf("%d ", i);
		}
	}
		
}


/*
7.-C programa zenbaki oso baten zenbaki kopurua zenbatzeko
*/

