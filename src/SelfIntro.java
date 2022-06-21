import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        //driver.get("http://www.google.com");//
        driver.get("http://hrms.crmnext.net/hrms/login.aspx?logout=1");
        System.out.println(driver.getTitle());
        driver.close();
        
	}

}
