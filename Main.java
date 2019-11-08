import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		DateTime dt = new DateTime();
		Extensions ex = new Extensions();
		String x = "C:\\test\\" + dt.getDate();
		ex.fileCreate(x);
		ex.fileRead(x);
		ex.fileWrite(x);
	}
}
