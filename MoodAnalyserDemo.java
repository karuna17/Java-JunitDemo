import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserDemo {	
	@Test
	public void testMoodAnalysis() throws Exception {
		
		TestMood tm = new TestMood();
		String mood=tm.testMood("Happy");
		Assert.assertTrue(mood, true);
		System.out.println(mood);
	}

}
