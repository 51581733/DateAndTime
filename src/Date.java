import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		Month month = now.getMonth();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getMinute();
		String snewFilename1 = year + "/" + month + "/" + day + " " + hour + ":" + minute + ":" + second;
		System.out.println(snewFilename1);
		
		
		
		
		
	}

}
