import java.io.File;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StringJoining {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Value1", "Value2", "Value2");

		// non of the parameters passed to the join method should be null
		System.out.println(String.join(";", list));
		
		String baseDirectory = "baseDir";
		String subFolder = "subFolder";
		String fileName = "fileName";
		
		List<String> fileList = Arrays.asList(baseDirectory, subFolder, fileName);
		System.out.println(String.join(File.separator, fileList));
	}

}
