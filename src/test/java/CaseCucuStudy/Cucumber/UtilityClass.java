package CaseCucuStudy.Cucumber;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	//import org.openqa.selenium.ie.InternetExplorerDriver;

	public class UtilityClass {

		static WebDriver driver;

		public static WebDriver openBrowser(String browserName)
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\\\POLO\\\\chromedriver_win32\\\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\\\POLO\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe");
				driver = new FirefoxDriver();

			}
			
//			else if(browserName.equalsIgnoreCase("ie"))
//			{
//				System.setProperty("webdriver.ie.driver",
//						"C:\\Users\\lekha.k.nair\\Desktop\\NewChromeDriver\\IEDriverServer.exe");
//				driver = new InternetExplorerDriver();
//			}

			else
				System.out.println("Invalid Browser !!");
			return driver;
		}

		public static WebDriver getDriver(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		
	}

