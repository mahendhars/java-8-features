import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

public class TimeZonesOffsetDemo {

	public static void main(String args[]) {
		
		LocalDateTime currentDT = LocalDateTime.now();
		DateTimeFormatter fShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(fShort.format(currentDT));
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("GMT+0"));
		System.out.println(zonedDateTime.format(fShort));
		
		ZonedDateTime zonedDateTimeAmerica = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(zonedDateTimeAmerica.format(fShort));
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
//		
//		zones.forEach(z -> System.out.println(z));
//		
		Predicate<String> predicate = str -> str.contains("London");
		
		zones.forEach(z -> {
			if(predicate.test(z)) {
				System.out.println(z);
			}
		});
	}
}
