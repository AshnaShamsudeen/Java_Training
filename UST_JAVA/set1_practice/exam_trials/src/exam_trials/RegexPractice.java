package exam_trials;

import java.util.regex.Pattern;

public class RegexPractice {
	public static boolean emailValidator(String email) {
		String regex=("[A-Za-z0-9]{3,}@[a-zA-Z0-9]{5}\\.com");
		boolean check=Pattern.matches(regex,email);
				return check;
		
	}

	public static void main(String[] args) {
		String a="anshik@@gmail.com";
		System.out.println(emailValidator(a));
		// TODO Auto-generated method stub
//		@ & . should be present;
//		@ & . should not be repeated;
//		there should be five charcters between @ and .;
//		there should be atleast 3 characters before @ ;
//		the end of mail id should be .com;
	}

}
