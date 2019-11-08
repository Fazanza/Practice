import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	
	public String getDate() {
		//syntax for getting date (the aa gives AM or PM)
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
	String date = simpleDateFormat.format(new Date());
	return date;
	}
}
