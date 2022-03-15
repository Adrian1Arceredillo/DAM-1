
#include <stdio.h>
#include <string.h>






int main(){  
          
          char oper;
          float num1, num2;
          
          printf("Select an operator between + or - or * or / \n");
          scanf("%c",&oper);
          
          printf("Enter two operands: ");
          scanf("%f %f",&num1,&num2);
          
          float sum = num1 + num2;
          float kenke = num1 - num2;
          float bider = num1 * num2;
          float zati = num1 / num2;
          
          switch(oper){
          	case'+':
          		printf("%.1f + %.1f = %.1f", num1, num2, sum);
          		break;
          	case'-':
          		printf("%.1f - %.1f = %.1f", num1, num2, kenke);
          		break;
          	case'*':
          		printf("%.1f * %.1f = %.1f", num1, num2, bider);
          		break;
          	case'/':
          		printf("%.1f / %.1f = %.1f", num1, num2, zati);
          		break;
		  }
        

}
