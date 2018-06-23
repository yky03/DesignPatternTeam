
public class UpperClassWriter implements Writer {
	Writer writer;

	public UpperClassWriter(Writer writer) {
		this.writer = writer;
	}

	public String readLine() throws Exception {
		String str = "";
		if ((str = writer.readLine()) != null)
			return str.toUpperCase();
		else
			return null;
	}

}
