package exam_trials;

public class CountVolwels {
	
		static int countVowels(String str) {
		char ch[]=str.toCharArray();
		int count=0;
		for(char c:ch) {
//			if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
//				count++;
//				
//			}
			if((c+"").matches("[aeiouAEIOU]")) {
				count++;
			}
			
		}
		return count;}
		
		static String removeVowels(String str) {
			char ch[]=str.toCharArray();
			int count=0;
			String str1="";
			for(char c:ch) {
				if((c+"").matches("[aeiouAEIOU]")) {
					continue;
				}
				else {
					str1=str1+c;
					
				}
				
			}
			return str1;
			
		}


public static void main(String[] args) {
String a="lets have a break";
System.out.println("the count of vowels are: "+countVowels(a));
System.out.println("new string is: "+removeVowels(a));

}}