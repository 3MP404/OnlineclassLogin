import java.util.ArrayList;

import org.openqa.selenium.By;

public class Goorm extends Onlineclass implements ClassInterface{
    Goorm() {
        super();
        
        ArrayList<String> shadow=super.readconfig();
        driver.get("https://accounts.goorm.io/login?host=c3VucmludC1ocy5nb29ybS5pbw==&channel_index=sunrint-hs&return_url=aHR0cHM6Ly9zdW5yaW50LWhzLmdvb3JtLmlvLw==");
        driver.findElement(By.id("emailInput")).sendKeys(shadow.get(4));
        driver.findElement(By.id("passwordInput")).sendKeys(shadow.get(5));
        driver.findElement(By.xpath("//*[@id=\"app\"]/section/div[4]/button")).click();
        driver.get("https://sunrint-hs.goorm.io/learn/my");
    }
    public void go(String link) {
    	String script="window.open(\""+link+"\",'_blank');";
		System.out.println(script);
		js.executeScript(script);
    }

}
