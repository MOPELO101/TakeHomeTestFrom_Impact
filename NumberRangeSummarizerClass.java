package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberRangeSummarizerClass implements NumberRangeSummarizer {

	@Override
	public Collection<Integer> collect(String input) {
		List<Integer> intList = new ArrayList<>();
		String[] strArray = input.split(",");
		for (String str : strArray) {
			intList.add(Integer.parseInt(str));
		}
		return intList;
	}

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		List<Integer> numbers = new ArrayList<>(input);
		Collections.sort(numbers);
		StringBuilder result = new StringBuilder();
		int start = numbers.get(0);
		int end = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			int current = numbers.get(i);
			if (current == end + 1) {
				end = current;
			} else {
				if (start == end) {
					result.append(start).append(", ");
				} else {
					result.append(start).append("-").append(end).append(", ");
				}
				start = current;
				end = current;
			}
		}
		if (start == end) {
			result.append(start);
		} else {
			result.append(start).append("-").append(end);
		}
		return result.toString();
	}

}
