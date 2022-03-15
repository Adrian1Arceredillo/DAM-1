#include <stdio.h>
#include <string.h>

int main() {
	
	int zenbakia;
	
	printf("Sartu zenbaki bat: ");
	scanf("%d", &zenbakia);
	
	
	if (zenbakia % 2 == 0) {
		printf("Sarturiko zenbakia (%d), BIKOITIA da. ", zenbakia);
	} else if (zenbakia % 2 != 0) {
		printf("Sarturiko zenbakia (%d), BAKOITIA da. ", zenbakia);
	}
	
	
}

/*
1.	Idatzi C programa bat zeinek zenbaki bat bikoitia edo bakoitia den egiaztatzen duen.
*/
