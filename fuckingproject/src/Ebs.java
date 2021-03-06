import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ebs extends Onlineclass implements ClassInterface{
    Ebs() {
        super();
        ArrayList<String> shadow=super.readconfig();
		driver.get("https://hoc22.ebssw.kr/onlineClass/search/onlineClassSearchView.do?schulCcode=00285&schCssTyp=online_high"); 
		driver.get("https://hoc22.ebssw.kr/sso/loginView.do?loginType=onlineClass"); //ebs 로그인 주소
		driver.findElement(By.className("lg_sns03")).click();
		driver.findElement(By.id("id_email_2")).sendKeys(shadow.get(0));
		driver.findElement(By.id("id_password_3")).sendKeys(shadow.get(1));
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[8]/button[1]")).click();
		WebDriverWait wait3 = new WebDriverWait(driver, 7000);
		wait3.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	public void go(String link) {
		String script="window.open(\""+link+"\",'_blank');";
		System.out.println(script);
		js.executeScript(script);
	}
	
}
