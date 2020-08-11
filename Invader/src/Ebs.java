import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ebs extends Onlineclass {
    Ebs() {
        super();
    }

    public void start() {
        driver.get("https://hoc22.ebssw.kr/onlineClass/search/onlineClassSearchView.do?schulCcode=00285&schCssTyp=online_high");
        driver.get("https://hoc22.ebssw.kr/sso/loginView.do?loginType=onlineClass");
        driver.findElement(By.className("lg_sns03")).click();
        driver.findElement(By.id("id_email_2")).sendKeys("dolphine103@naver.com");
        driver.findElement(By.id("id_password_3")).sendKeys("dlgusdn");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[8]/button[1]")).click();
        WebDriverWait wait3 = new WebDriverWait(driver, 7000);
        wait3.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.get("https://hoc22.ebssw.kr/onlineClass/reqst/onlineClassReqstInfoView.do");
    }
}