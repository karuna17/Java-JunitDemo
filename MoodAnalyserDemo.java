import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserDemo {	
	@Test
	public String testMood(String msg)  {
		if(msg.contains("Happy")) {
			return "HAPPY";
		}else if(msg.contains("NULL")|| msg.contains("")) {
			try {
			throw new InvalidMoodException();
			}catch (InvalidMoodException e) {
               e.printStackTrace();
			}

		}else {
			return "SAD";		
		}
		return msg;		
	}

	@Test
	public void mmoodAnalyse()
	{
		MoodAnalyserDemo m = new MoodAnalyserDemo();
		String mood="";
		try {
			mood = m.testMood("NULL");
			Assert.assertTrue(mood, true);	
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(mood);
		System.out.println("rest of the code executed");

	}

}

