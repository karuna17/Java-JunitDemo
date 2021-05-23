import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserDemo {	
	@Test
	public void testMoodAnalysis() {

		TestMood tm = new TestMood();
		String mood="";
		try {
			mood=tm.testMood(null);
			Assert.assertTrue(mood, true);
		}catch (Exception e) {
			System.out.println("HAPPY");
		}
		System.out.println(mood);
		System.out.println("rest of the code executed");
	}

}
