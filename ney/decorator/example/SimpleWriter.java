import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SimpleWriter implements Writer {
	BufferedReader reader;

	public SimpleWriter(String intputFile) {
		try {
			reader = new BufferedReader( new FileReader(intputFile) );
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음");
			System.exit(0);
		}
	}
	
	public String readLine() throws Exception{
		return reader.readLine();
	}
	
}
