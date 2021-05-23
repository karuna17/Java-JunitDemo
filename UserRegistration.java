import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;

public class UserRegistration {
	
	@Test
	public boolean emailTest(String email){
		String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";	
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher m = pattern.matcher(email);
		System.out.println("Is this email valid? "+m.matches());
		return m.matches();
	}

	@Test
	public boolean passTest(String pass) {
		String passRegex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";	
		Pattern pattern = Pattern.compile(passRegex);
		Matcher m = pattern.matcher(pass);
		System.out.println("Is this password valid? "+m.matches());
		return m.matches();		
	}

	@Test
	public boolean mobTest(String mobile) {	
		String mobRegex = "(0/91)?[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(mobRegex);
		Matcher m = pattern.matcher(mobile);
		System.out.println("Is this mobile valid? "+m.matches());
		return m.matches();			
	}
}