import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleClassroom extends Onlineclass {
    GoogleClassroom() {
        super();
    }

    public void start() {
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=classroom&passive=1209600&continue=https%3A%2F%2Fclassroom.google.com%2Fu%2F0%2Fh&followup=https%3A%2F%2Fclassroom.google.com%2Fu%2F0%2Fh&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        driver.findElement(By.id("identifierId")).sendKeys("19sunrin073@sunrint.hs.kr");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();

        //driver.findElement(By.id(""));
        WebDriverWait wait = new WebDriverWait(driver, 7000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")));
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("dlgusdn0019");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();


    }
}
