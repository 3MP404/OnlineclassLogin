import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleClassroom extends Onlineclass implements ClassInterface{
    GoogleClassroom() {
        super();
        ArrayList<String> shadow=super.readconfig(); //���� ���� �о��
        driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=classroom&passive=1209600&continue=https%3A%2F%2Fclassroom.google.com%2Fu%2F0%2Fh&followup=https%3A%2F%2Fclassroom.google.com%2Fu%2F0%2Fh&flowName=GlifWebSignIn&flowEntry=ServiceLogin"); //���� Ŭ������ �ּ�
        driver.findElement(By.id("identifierId")).sendKeys(shadow.get(2)); //���̵� �Է�
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 7000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))); //��й�ȣ �Է� â ���ö����� ���
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(shadow.get(3)); //��й�ȣ �Է�
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
    }
    
	public void go(String link) {
		String script="window.open(\""+link+"\",'_blank');";
		System.out.println(script);
		js.executeScript(script);
	}
}
