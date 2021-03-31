class LogicalAndBitwise{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a<c);//false && true = false      [...it returns true only when both the statements are true...in logical and operator when the first condition is false it wont check for the second condition...]
System.out.println(a<b&a<c);//false & true = false        [...single & is called bitwise operator,...it performs the same operations as logical operator perform..only the difference is it checks for both the conditions eventhough the firse condition is false...]
}}  