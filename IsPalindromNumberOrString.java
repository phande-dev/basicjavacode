
public class IsPalindromNumberOrString {
  public static void main(String[] args) {
	numberIsPalndrom(454);
	StringIsPalindrom("ABA");
}
   public static void numberIsPalndrom( int num) {
	   int temp = num;
	   int sum=0;
	   while(num!=0) {
	    int r = num%10;
	    sum = (sum*10)+r;
	    num = num/10;}
	   if(temp== sum)
		   System.out.println("number is an Palindrom");
	   else
		   System.out.println("number is not Palindrom"); 
	    
   }
   public static void StringIsPalindrom(String S) {
	   String s ="";
	   
	   for(int i =S.length()-1 ;i>=0;i--) {
		   char c =  S.charAt(i);
		   s = s+c;	 
		   
		   
	   }
	   if(S.equals(s))
		   System.out.println("String is an Palindrom");
	   else
		   System.out.println("String is not Palindrom"); 
	    
   }
}
