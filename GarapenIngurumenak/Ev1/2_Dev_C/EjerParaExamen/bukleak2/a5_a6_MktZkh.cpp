#include <stdio.h>
#include <string.h>

int main() {  
          
        int zenb1, zenb2;
        int txikiena;
        int zkh = 0;
        int mkt = 0;
        
        printf("Lehenengo zenbakia: ");
        scanf("%d",&zenb1);
        printf("Bigarren zenbakia: ");
        scanf("%d",&zenb2);
        
        if (zenb1 > zenb2) {
        	txikiena = zenb2;
		} else if (zenb2 > zenb1) {
			txikiena = zenb1;
		}
		
		while (zkh == 0) {
			if (zenb1 % txikiena == 0 && zenb2 % txikiena == 0) {
				zkh = txikiena;
			} else {
				--txikiena;
			}
		}
		
		mkt = (zenb1 * zenb2) / zkh;
		
		printf("Zkh -> %d \n", zkh);
		printf("Mkt -> %d", mkt);
		
        
}


