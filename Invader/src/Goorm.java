import org.openqa.selenium.By;

public class Goorm extends Onlineclass {
    Goorm() {
        super();
    }

    public void start() {
        driver.get("https://accounts.goorm.io/login?host=c3VucmludC1ocy5nb29ybS5pbw==&channel_index=sunrint-hs&return_url=aHR0cHM6Ly9zdW5yaW50LWhzLmdvb3JtLmlvLw==");
        driver.findElement(By.id("emailInput")).sendKeys("dolphine0019@gmail.com");
        driver.findElement(By.id("passwordInput")).sendKeys("dlgusdn103!");
        driver.findElement(By.xpath("//*[@id=\"app\"]/section/div[4]/button")).click();
        driver.get("https://sunrint-hs.goorm.io/learn/my");
    }

}
