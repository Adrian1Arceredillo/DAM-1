#include <stdio.h>      // Hau derrigorrezkoa da printf funtzioa exekutatzeko
int main(){    
    int a=9, b=4,c;
    c=a+b;
    printf("a+b=%d\n",c);  
    c=a-b;
    printf("a-b=%d\n",c);
    c=a*b;
    printf("a*b=%d\n",c);
    c=a/b;
    printf("a/b=%d\n",c); 
    c=a%b;
    printf("a eta b ren arteko hondarra =%d\n",c);       
    return 0;
} 
