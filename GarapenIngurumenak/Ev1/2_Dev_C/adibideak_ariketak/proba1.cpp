#include <stdio.h>
#include <string.h>






main()
{
	char* testua; //aldagaiaren definizioa
	testua= "Izena";  // balio bat esleitu
	printf( "Kaixo %s\n", testua);
	
	testua="Adrian";
	printf("Kaixo %s\n", testua);   // %s = cuando son variables de tipo texto
	
	int adina;
	adina = 23;
	printf("Adina %d da \n",adina);   // %d = cuando son variables de números enteros
	
	
	float altuera = 1.75;  //zenbaki hamartarrak
	printf("Altuera %f da \n", altuera);    // %f = cuando son variables de números decimales
	
	printf("%s ren altuera %f da.", testua, adina);
	
}

