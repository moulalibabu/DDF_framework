package config;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class AppUtil {
public static Properties conpro;
public static WebDriver driver;
@ BeforeTest
public static void setup()
{
	conpro= new properties();
	conpro.load(new );
}
}
