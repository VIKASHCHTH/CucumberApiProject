package PageFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Utilities {
	private Pojo objpojo;

	public Utilities(Pojo pojo) {
		this.objpojo = pojo;
	}

	public String getFutureOrBackDateInSpecifiedFormat(String dateFormat, int NoOfFutureDay) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, NoOfFutureDay);
		String futureDate = new SimpleDateFormat(dateFormat).format(c.getTime()).toString();
		return futureDate;
	}

	public String dpString(String columnHeader) {
		try {
			if (objpojo.getObjHashTable().get(columnHeader) == null)
				return "";
			else {
				return objpojo.getObjHashTable().get(columnHeader).trim();
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

public int getRandomNumbersWithinRange(int minimumlimt, int maximumLimit) {
	try {
		Random rand = new Random(); 
	
 return rand.nextInt((maximumLimit - minimumlimt) + 1) + minimumlimt; }
catch (Exception exception) {
	objpojo.setCustomException("Developer Side Issue"); 
	exception.printStackTrace(); 
	return 0; 
}
}

	public String getRandomNumbers(int length) {
		String allowedChars = "1234567890";
		String randomstring = "";
		for (int i = 0; i < length; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randomstring += allowedChars.substring(rnum, rnum + 1);
		}
		return randomstring;
	}


	
	public String getRandomNumbers(String generator) {
		int length = Integer.parseInt(generator.toLowerCase().replace("dynamic", ""));
		String allowedChars = "1234567890";
		String randomstring = "";
		for (int i = 0; i < length; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randomstring += allowedChars.substring(rnum, rnum + 1);
		}
		return randomstring;
	}

	public String getDateInSpecifiedformat(String dateFormat) {
		String current_date = "";
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
		current_date = formatter.format(today);
		return current_date;
	}

	public String getRandomString(int lenght) {
		String allowedChars = "abcdefghiklmnopqrstuvwxy";
		String randomstring = "";
		for (int i = 0; i < lenght; i++) {
			int rnum = (int) Math.floor(Math.random() * allowedChars.length());
			randomstring += allowedChars.substring(rnum, rnum + 1);
		}
		return randomstring.toUpperCase();
	}

//    @Attachment(value="Screenshot",type="image/png")
//	public byte[] fileToByte(File file) throws IOException {
//		if (file != null)
//			return Files.readAllBytes(Paths.get(file.getPath()));
//		else
//			return new byte[0];
//	}

	public boolean takeScreenShot(WebDriver webDriver, String fileWithPath) { 
					TakesScreenshot scrShot =((TakesScreenshot) webDriver);
					File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
					File destFile = new File(fileWithPath); 
					try {
						FileUtils.moveFile(srcFile, destFile);
						//this.fileToByte(destFile);
						return true;
					} catch (IOException ioException) {
						ioException.printStackTrace();
						return false; 
				}
	}
	public void logReporter(String step, String expectedValue, String actualValue, boolean resultLog) {
		String strLog = step + "|| Expected Result: " + expectedValue + "|| Actual Result : " + actualValue;
		this.addAssertTakeScreenshot(step, strLog, "", expectedValue, actualValue, resultLog);
	}

	public void addAssertTakeScreenshot(String step, String strLog, String inputValue, String expectedValue,
			String actualValue, boolean resultLog) {
	}

}
