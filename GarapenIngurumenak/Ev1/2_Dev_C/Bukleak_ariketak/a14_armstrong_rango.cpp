#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	
	int lim1;
	int lim2;
	int numLen;
	int cadaNum;
	int digit;
	int sumaTodo = 0;
	int berreketa;
	
	char numStr[50];
	
	printf("Sartu tartearen limite txikiena: ");
    scanf("%d",&lim1);
    
    printf("Sartu tartearen limite handiena: ");
    scanf("%d",&lim2);
	
	for(int i = lim1; i < lim2; i++){
		itoa(i,numStr,10);
		numLen = strlen(numStr);
		
		cadaNum = i;
		while(cadaNum > 0){
			digit = cadaNum % 10;
			berreketa = digit;
			for(int j = 0;j < numLen - 1;j++){
				berreketa = berreketa * digit;
			}
			sumaTodo = sumaTodo + berreketa;
			cadaNum = cadaNum / 10;
		}
		
		if(sumaTodo == i){
			printf("\n%d armstrong zenbakia da", i);
		}
		
		sumaTodo = 0;
	}
}

/*
Buscar info sobre la función/expresión "itoa".
*/
