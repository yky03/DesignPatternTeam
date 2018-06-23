
public class Client {
	
	public static void main(String[] args) throws Exception{
		String str = "";
		Writer writer = null;
		
		writer = new SimpleWriter("data.txt");
		
		while( (str = writer.readLine() ) != null) {
			System.out.println(str);
		}
		
		writer = new LineNumWriter( new SimpleWriter("data.txt"));
		while( (str = writer.readLine() ) != null) {
			System.out.println(str);
		}
		
		writer = new UpperClassWriter( new SimpleWriter("data.txt"));
		while( (str = writer.readLine() ) != null) {
			System.out.println(str);
		}
		
		writer = new LineNumWriter( new UpperClassWriter( new SimpleWriter("data.txt")));
		while( (str = writer.readLine() ) != null) {
			System.out.println(str);
		}
	}
}
