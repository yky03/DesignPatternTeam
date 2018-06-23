
public class LineNumWriter implements Writer {
	Writer writer;
	int lineNum;

	public LineNumWriter(Writer writer) {
		lineNum = 1;
		this.writer = writer;
	}

	public String readLine() throws Exception {
		String str = "";
		if ( (str = writer.readLine()) == null) {
			return null;
		} else {
			return (lineNum++) + "\t" + str;
		}
	}

}
