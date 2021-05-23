import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RegistrationTest {

	@Test
	public void testEmail() throws Exception {
		Scanner sc = new Scanner(System.in);
		UserRegistration u = new UserRegistration();
		
		System.out.println("Enter your email");
		String email = sc.next();
		boolean em = u.emailTest(email);
		Assert.assertEquals(em, true);
		
		System.out.println("Enter your password");
		String password = sc.next();
		boolean pass = u.emailTest(password);
		Assert.assertEquals(pass, true);
		
		System.out.println("Enter your mobile number");
		String mobile = sc.next();
		boolean mob = u.emailTest(mobile);
		Assert.assertEquals(mob, true);


		
	}
	
}
