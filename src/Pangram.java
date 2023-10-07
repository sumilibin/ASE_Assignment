
	 public class Pangram 
	 {  
	 static int size = 26;  	 
	 static boolean isLetter(char ch)  
	 {  
	 if (!Character.isLetter(ch))  	 
	 return false;  	 
	 return true;  
	 }  	 
	 static boolean HasAllLetters(String str, int len)  
	 {  
	 str = str.toLowerCase();  
	 boolean[] present = new boolean[size];   
	 for (int i = 0; i < len; i++)   
	 {  	 
	 if (isLetter(str.charAt(i)))   
	 {  
	 int letter = str.charAt(i) - 'a';  	 
	 present[letter] = true;  
	 }  
	 }  	  
	 for (int i = 0; i < size; i++)   
	 {  
	 if (!present[i])  	 
	 return false;  
	 }  	   
	 return true;  
	 }  	 
	 public static void main(String args[])  
	 {  	 
	 String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  	 
	 int len = str.length();  	
	 if (HasAllLetters(str, len))  
	 System.out.println("The string is pangram.");  
	 else  
	 System.out.println("The string is not pangram.");  
	 }  
	 }  
	

	


