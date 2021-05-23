import org.junit.jupiter.api.Test;
public class TestMood {

	@Test
	public String testMood(String msg)  {
		if(msg.contains("Happy")) {
			return "HAPPY";
		}else {
			return "SAD";		
		}
	}

}
