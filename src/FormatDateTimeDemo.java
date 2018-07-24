import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatDateTimeDemo {
	
	public static void main(String args[]) {
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
		System.out.println(df.format(date));
		
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
		System.out.println(tf.format(currentTime));
		
		LocalDateTime currentDT = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dtf.format(currentDT));
		
		DateTimeFormatter fLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter fShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		System.out.println(fLong.format(currentDT));
		System.out.println(fShort.format(currentDT));
		
		String frLong = fLong.withLocale(Locale.FRENCH).format(currentDT);
		String frShort = fShort.withLocale(Locale.FRENCH).format(currentDT);
		
		System.out.println(frLong);
		System.out.println(frShort);
		
		DateTimeFormatterBuilder fb = new DateTimeFormatterBuilder()
				.appendValue(ChronoField.MONTH_OF_YEAR)
				.appendLiteral("-")
				.appendValue(ChronoField.DAY_OF_MONTH)
				.appendLiteral("-")
				.appendValue(ChronoField.DAY_OF_WEEK);
		
		DateTimeFormatter f = fb.toFormatter();
		System.out.println(f.format(currentDT));
	}
}
