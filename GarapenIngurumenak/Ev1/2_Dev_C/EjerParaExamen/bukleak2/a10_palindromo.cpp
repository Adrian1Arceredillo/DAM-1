#include <stdio.h>
#include <string.h>

int main() {
	
	int zenbakia;
	int ultDigit;
	int alderantzizkoa = 0;
	
	printf("Sartu zenbaki bat: ");
	scanf("%d", &zenbakia);
	
	int number = zenbakia;
	
	while(number > 0) {
		ultDigit = number % 10;
		alderantzizkoa = alderantzizkoa*10 + ultDigit;
		number = number / 10;
	}
	
	if (alderantzizkoa == zenbakia) {
		printf("Sarturiko (%d) zenbakia, PALINDROMOA da. ", zenbakia);
	} else {
		printf("Sarturiko (%d) zenbakia, EZ da palindromoa. ", zenbakia);
	}
	
}
