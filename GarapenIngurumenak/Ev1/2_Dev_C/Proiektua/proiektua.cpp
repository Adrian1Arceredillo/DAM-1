//realizar sumas
//mirar switch ariketak

//1. Pedir un número. Hacer/dibujar cuadrados y/o figuras 
//con ese valor. Dar a elegir si las figuras estarán rellenas o no.

//2. Hacer cálculos con dos números:
//si seleccionamos esta opción, nos pedirá los valores de ambos números, y un símbolo 
//de operaciones matemáticas; dependiendo del símbolo, se efectuará una operación u otra.

#include <stdio.h>
#include <string.h>
#include <cmath>

int opcion1Suma(int num1, int num2){
	
	printf("\n\t\tSartu lehenengo zenbakia: ");
	scanf("%d", &num1);
	printf("\t\tSartu bigarren zenbakia: ");
	scanf("%d", &num2);
	printf("\t\t- - - - - - - - - - - - - -\n");
	
	int sumaNumeros = num1 + num2;
	
	return sumaNumeros;
}

int opcion1Resta(int num1, int num2){
	
	printf("\n\t\tSartu lehenengo zenbakia: ");
	scanf("%d", &num1);
	printf("\t\tSartu bigarren zenbakia: ");
	scanf("%d", &num2);
	printf("\t\t- - - - - - - - - - - - - -\n");
	
	int restaNumeros = num1 - num2;
	
	return restaNumeros;
}

int opcion1Biderketa(int num1, int num2){
	
	printf("\n\t\tSartu lehenengo zenbakia: ");
	scanf("%d", &num1);
	printf("\t\tSartu bigarren zenbakia: ");
	scanf("%d", &num2);
	printf("\t\t- - - - - - - - - - - - - -\n");
	
	int multiplicacionNumeros = num1 * num2;
	
	return multiplicacionNumeros;
}

double opcion1Zatiketa(int num1, int num2){
	
	printf("\n\t\tSartu lehenengo zenbakia: ");
	scanf("%d", &num1);
	
	printf("\t\tSartu bigarren zenbakia: ");
	scanf("%d", &num2);
	
	printf("\t\t- - - - - - - - - - - - - -\n");
	
	double divisionNumeros = (double) num1 / num2;
	
	return divisionNumeros;
}

bool primo (int number) {
	
	for (int x = 2; x <= number / 2; ++x) {
		if (number % x == 0) {
			return false;
		} 
	}
}

int biderketaTaula (int size) {
	
	printf("\n\t\t* |");
	for (int colTaula = 1; colTaula <= size; ++colTaula) {
		printf("%4d", colTaula);
	}
    printf("\n\t\t----");
    
	for (int colum = 1; colum <= size; ++colum) {
		printf("%4s", "----");
	}
	
	for (int lerroa = 1; lerroa <= 10; ++lerroa) {
		printf("\n\t\t%d |", lerroa);
		for (int zutabea = 1; zutabea <= size; ++zutabea) {
		 	printf("%4d", lerroa*zutabea);
		}	 								
	}
	printf("\n\n");		
}

bool armstrongZenbakia(int zenb) {
	
	int contDigits = 0;
	int kalkuluaDigit;
    int resultado = 0;
    int ultDigito;
    int ult;
    
    int number = zenb;
    
    while (number != 0) {
    	number = number / 10;
        ++contDigits;
	}
	
	number = zenb;
	while (number != 0) {
		//resto es el último dígito del número introducido
		ultDigito = number % 10;
			
		kalkuluaDigit = pow(ultDigito, contDigits);
		//printf("%d", kalkuluaDigit); --> muestra el valor de cada dígito elevado al número de cifras
		resultado = resultado + kalkuluaDigit;
			
        number = number / 10;
    }
    if (resultado == zenb) {
		return true;
	} else {
		return false;
	}
	
}

int main() {  
        
        int opcionMenu;
        int num1, num2;
        
		
		
		                
        do {
        	printf("\n####################\n");
        	printf("###-Menu Nagusia-###\n");
        	printf("####################\n\n");
        	printf("Zer egin nahi duzu? \n");	//pedir: Lehen. zenbakia: / Bigarren zenbakia:
        	printf("\n");
        	printf("1. Kalkuluak \n");
        	printf("2. Konprobaketak \n");
        	printf("3. Irudiak \n");
        	printf("4. Esaldiak osatu \n");
        	
        	printf("\nPrograma mota BAT aukeratzeko, sartu dagokion zenbakia (1, 2...): ");
        	printf("\nZein programa mota nahi duzu praktikatu?: ");
			scanf("%d", &opcionMenu);
			
			switch (opcionMenu) {
				
				case 1:
					char eragiketaMota;
					do {
						printf("\n\t#########-Kalkuluak-######### \n");
						printf("\n\ta) Bi zenbakiren arteko batuketa: \n");
        				printf("\tb) Bi zenbakiren arteko kenketa: \n");
        				printf("\tc) Bi zenbakiren arteko biderketa: \n");
        				printf("\td) Bi zenbakiren arteko zatiketa: \n");
        				printf("\tf) Irten eta joan menu nagusira. \n");
        				printf("\n\tAukeratu eragiketa mota BAT (a, b...): ");
        				
        				fflush(stdin);
						scanf("%c", &eragiketaMota);
        			
        				switch (eragiketaMota) {
        					case 'a':
        						printf("\t\tBatuketaren emaitza %d da.\n",opcion1Suma(num1, num2));
								printf("\n");
								break;
								
							case 'b':
								printf("\t\tKenketaren emaitza %d da.\n",opcion1Resta(num1, num2));
								printf("\n");
								break;
								
							case 'c':
								printf("\t\tBiderketaren emaitza %d da.\n",opcion1Biderketa(num1, num2));
								printf("\n");
								break;
								
							case 'd':
								printf("\t\tZatiketaren emaitza %.2f da.\n",opcion1Zatiketa(num1, num2));
								printf("\n");
								break;
								
							case 'f':
								printf("\n\t\t--> Irtetzen...\n");
								printf("\n");
								break;
								
							default:
								printf("\t\tUps....................!! \n");
								printf("\t\tEskaturiko eragiketa ez da aurkitu. \n");
								break;								
						}
						
					} while (eragiketaMota != 'f');
					break;
				case 2:
					char konprobaketaMota;
					do {
						printf("\n\t#########-Konprobaketak-######### \n");
						printf("\n\ta) Zenbaki lehenak. Sartu zenbaki bat: \n");
        				printf("\tb) Zenbaki lehenak. Tarte batean dauden guztiak: \n");
        				printf("\tc) Bakoitia edo bikoitia: \n");
        				printf("\td) Biderketa taula marraztu (1-10 bada): \n");
        				printf("\te) Armstrong zenbakia: \n");
        				printf("\tf) Irten 'Konprobaketak' multzotik. \n");
        				printf("\n\tAukeratu conprobaketa mota BAT (a, b...): ");
        				
						fflush(stdin);
        				scanf("%c", &konprobaketaMota);
        			
        				switch (konprobaketaMota) {
        					case 'a':
        						int zenbaki;
        						printf("\n\t\tSartu zenbaki bat: ");
    							scanf("%d",&zenbaki);
    							
								if (primo(zenbaki)) {
        							printf("\t\t--> Zorionak!!! Adierazitako zenbakia (%d), LEHENA da. \n", zenbaki);
        							printf("\n");
								} else {
									printf("\t\t--> Txarto... Adierazitako zenbakia (%d), EZ da LEHENA. \n", zenbaki);
									printf("\n");
								}
								break;
							case 'b':
								int lim1, lim2;
								printf("\n\t\tSartu tartearen limite txikiena: ");
        						scanf("%d",&lim1);
        						printf("\t\tSartu tartearen limite handiena: ");
        						scanf("%d",&lim2);
        						
        						printf("\t\t----------------------------------\n");
        						printf("\t\t--> Hauek dira: ");
        						
        						for (int i = lim1; i <= lim2; ++i) {
        							if (primo(i)) {
        								printf("%d ", i);
									}
								}
								printf("\n");
								break;
							case 'c':
								int num1;
        						printf("\n\t\tSartu zenbaki bat: ");
    							scanf("%d",&num1);
    							if (num1 % 2 != 0) {
    								printf("\t\t----------------------------------\n");
        							printf("\t\t--> Adierazitako %d zenbakia, BAKOITIA da. ", num1);
        							printf("\n");
								} else {
									printf("\t\t----------------------------------\n");
        							printf("\t\t--> Adierazitako %d zenbakia, BIKOITIA da. ", num1);
        							printf("\n");
								}
								break;
							case 'd':
								int numTaula;
								printf("\n\t\tSartu zenbaki bat: ");
    							scanf("%d",&numTaula);
								while (!(numTaula >= 1 && numTaula <= 10)) {
									printf("\t\t--> Mesedez, saiatu 1-10 tarteko zenbaki bat sartzen: ");
    								scanf("%d",&numTaula);
								}
								biderketaTaula(numTaula);
    							
								break;
							case 'e':
								int num;
								printf("\n\t\tSartu zenbaki bat: ");
        						scanf("%d",&num);
        						
        						if(armstrongZenbakia(num)) {
        							printf("\t\t--> Ongi! Armstrong zenbaki bat aurkitu duzu. \n");
        							printf("\n");
								} else {
									printf("\t\t--> Txarto! %d ez da Armstrong zenbaki bat. \n", num);
									printf("\n");
								}
								break;
							case 'f':
								printf("\n\t\t--> Irtetzen...\n");
								printf("\n");
								break;
							default:
								printf("\t\tUps!! \n");
								printf("\t\tEskaturiko conprobaketa ez da aurkitu. \n");
								
						}
					} while (konprobaketaMota != 'f');
					break;
        		case 3:
					char irudiMota;
					do {
						printf("\n\t#########-Irudiak-######### \n");
						printf("\n\ta) Lauki karratu bat osatu. \n");
						printf("\tb) Ezkerrera begira dagoen triangelu karratu bat sortu. Diagonala, gora begira geratuko da. \n");
        				printf("\tc) Karratu baten perimetroa eta azaleraren gainerakoa desberdindu.\n");
        				printf("\td) Hutsik dagoen karratua \n");
						printf("\te) Piramidea \n");
        				printf("\tf) Irten 'Irudiak' multzotik. \n");
        				
        				printf("\n\tPista -> zutabeak/lerroak erabili. \n");
        				printf("\n\tAukeratu irudi mota BAT (a, b...): ");
        				
						fflush(stdin);
						scanf("%c", &irudiMota);
        			
        				switch (irudiMota) {
        					
        					case 'a':
        						int size1;
        						printf("\n\t\tSartu aldearen luzera: ");
    							scanf("%d",&size1);
    							
    							for (int row = 1; row <= size1; ++row) {
        							for (int col = 1; col <= size1; ++col) {
        								printf("* ");
									}
									printf("\n");
								}
								break;
							case 'b':
								int size2;
        						printf("\n\t\tSartu neurriak: ");
    							scanf("%d",&size2);
    							
    							for (int row = 1; row <= size2; ++row) {
        							for (int col = 1; col <= row; ++col) {
        								printf("* ");
									}
									printf("\n");
								}
								break;
							case 'c':
								int size3;
								printf("\n\t\tSartu karratuaren altuera: ");
    							scanf("%d",&size3);
								for (int row = 1; row <= size3; ++row) {
        							for (int col = 1; col <= size3; ++col) {
        								if (row == 1 || row == size3 || col == 1 || col == size3) {
                    						printf("* ");
                						} else {
                    						printf("? ");
                						}
									}
									printf("\n");
								}
								break;
							case 'd':
								int size4;
								printf("\n\t\tSartu altuera bat: ");
        						scanf("%d", &size4);
        
        						for (int row = 1; row <= size4; ++row) {
        							for (int col = 1; col <= size4; ++col) {
        								if (row == 1 || row == size4 || col == 1 || col == size4) {
                    						printf("* ");
                						} else {
                    						printf("  ");
                						}
									}
									printf("\n");
								}
								break;
							case 'e':
								int size5;
								printf("\n\t\tSartu altuera bat: ");
        						scanf("%d", &size5);
        
        
        						for (int row = 1; row <= size5; ++row) {
        							for (int col = 1, numCols = 2 * size5 -1; col <= numCols; ++col) {
        								if ((row + col >= size5 + 1) && (row >= col - size5 + 1)) {
                    						printf("* ");
                						} else {
                    						printf("  ");
                						}
									}
									printf("\n");
								}
								break;
							case 'f':
								printf("\n\t\t--> Irtetzen...\n");
								printf("\n");
								break;
							default:
								printf("\t\tUps!! \n");
								printf("\t\tEskaturiko conprobaketa ez da aurkitu. \n");
								break;
								
						}
					} while (irudiMota != 'f');
					break;
				case 4:
					char hitzaZenbakia;
					printf("\n\t#########-Osatu honako esaldia-######### \n");
					
					do {
						
						printf("\n\tHow _____ ice creams _____ you eat yesterday? \n");
						printf("\n\t\ta) much/are \n");
						printf("\n\t\tb) many/did \n");
						printf("\n\t\tc) will/was \n");
						printf("\n\t\td) many/is \n");
						printf("\n\t\te) long/are \n");
					
						printf("\n\tAukeratu hitz konbinazio bat: ");
						
						fflush(stdin);
        				scanf("%s", &hitzaZenbakia);
        			
        				switch (hitzaZenbakia) {
        				
        					case 'a':
        						printf("\n\t\t--> Txarto! Saiatu berriro...\n");
								printf("\n");
								break;
							case 'b':
        						printf("\n\t\t--> Zorionak!! Asmatu duzu.\n");
								printf("\n");
								break;
							case 'c':
        						printf("\n\t\t--> Txarto! Saiatu berriro...\n");
								printf("\n");
								break;
							case 'd':
        						printf("\n\t\t--> Txarto! Saiatu berriro...\n");
								printf("\n");
								break;
							case 'e':
        						printf("\n\t\t--> Txarto! Saiatu berriro...\n");
								printf("\n");
								break;
							default:
								printf("\t\tUps!! \n");
								printf("\t\tEskaturiko aukera ez da aurkitu. \n");
								break;
						}
					
					} while (hitzaZenbakia != 'b');
					break;					
			}
        	
		} while (opcionMenu != 0);
				
}

/*bool primo (int number) {
	
	for (int x = 2; x < number / 2; ++x) {
				if (number % x == 0) {
					return false;
				} 
			}
	
}*/

/*
if (eragiketaMota == 'a') {
							printf("\t\tBatuketaren emaitza %d da.\n",opcion1Suma(num1, num2));
							printf("\n");
        					
        				} else if (eragiketaMota == 'b') {
        					printf("\t\t\Kenketaren emaitza %d da.\n",opcion1Resta(num1, num2));
							printf("\n");
        					
						} else if (eragiketaMota == 'c') {
							printf("\t\tBiderketaren emaitza %d da.\n", opcion1Biderketa(num1, num2));
							printf("\n");
							
						} else if (eragiketaMota == 'd') {
							printf("\t\tZatiketaren emaitza %d da.\n", opcion1Zatiketa(num1, num2));
							printf("\n");
							
						} else if (eragiketaMota == 'f') {
							
							break;
						} else {
							printf("\t\tUps!! \n");
							printf("\t\tEskaturiko eragiketa ez da aurkitu. \n");
							break;
						}
*/


