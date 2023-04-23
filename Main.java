package numberrangesummarizer;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		NumberRangeSummarizerClass numberRange = new NumberRangeSummarizerClass();
		Collection<Integer> output = numberRange.collect(input);
		System.out.print(numberRange.summarizeCollection(output));

	}

}
