package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void screen(WebDriver driver) throws IOException{
		int i=0;
		Date obj =  new Date();
		int d = obj.getDate();
		String dt = Integer.toString(d);
		int m = obj.getMonth();
		String mon = Integer.toString(m+1);
		int y = obj.getYear();
		String yy = Integer.toString(y-100);
		int h = obj.getHours();
		String hr = Integer.toString(h);
		int m1 = obj.getMinutes();
		String min = Integer.toString(m1);
		int s = obj.getSeconds();
		String sec = Integer.toString(s);
		String timestamp = dt+mon+yy+hr+min+sec;
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\Admin\\Desktop\\seleniumjars\\screenshot\\scr_"+i+".png");
		i=i+1;
		FileUtils.copyFile(SrcFile,DestFile);
			
	}
}
