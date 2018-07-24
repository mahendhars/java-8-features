import java.time.Duration;
import java.time.Instant;

public class InstanceDurationDemo {

	public static void main(String[] args) {
		
		Instant start = Instant.now();
		System.out.println(start);
		Instant end = Instant.now();
		System.out.println(end);
		
		Duration timeElapsed = Duration.between(start, end);
		System.out.println(timeElapsed.toMillis());
	}

}
