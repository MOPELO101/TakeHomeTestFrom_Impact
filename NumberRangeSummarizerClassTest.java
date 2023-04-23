package numberrangesummarizer;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class NumberRangeSummarizerClassTest {
	NumberRangeSummarizerClass numberRange = new NumberRangeSummarizerClass();

	@Test
	public void testCollect() {
		String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        Collection<Integer> expectedOutput = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
        Collection<Integer> actualOutput = numberRange.collect(input);
        assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testSummarizeCollection() {
		Collection<Integer> input = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
        String expectedOutput = "1, 3, 6-8, 12-15, 21-24, 31";
        String actualOutput = numberRange.summarizeCollection(input);
        assertEquals(expectedOutput, actualOutput);
	}

}
