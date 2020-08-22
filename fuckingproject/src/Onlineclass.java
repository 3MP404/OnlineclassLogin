import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Onlineclass {
    public WebDriver driver;
    public JavascriptExecutor js;
    String path = System.getProperty("user.dir");

    public Onlineclass() {
        path.replaceAll("\\\\", "/");
        System.setProperty("webdriver.chrome.driver", path + "/src/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.js = (JavascriptExecutor) driver;
    }
    public void go(String link) {
    	String script="window.open(\""+link+"\",'_blank');";
		System.out.println(script);
		js.executeScript(script);
    }
}
