package day_33_pattern_and_matcher_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
	public static void main(String[] args) {
		String regex = "^[789]\\d{9}";
		String text = "9538283928 8912345678";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.print("$");
			System.out.print(matcher.group() + " " + matcher.start());
		}

	}
}
