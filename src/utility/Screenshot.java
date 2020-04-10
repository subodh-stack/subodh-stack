package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public void snap (String snap, WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destn = new File("E:\\Automation Testing\\Eclipse\\Workspace\\Assignments\\Screenshot\\"+ snap+".jpeg");
		FileHandler.copy(source, destn);
	}

}
