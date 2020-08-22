import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Onlineclass {
    public WebDriver driver; //�� ũ�Ѹ� ����
    public JavascriptExecutor js; //javascript �ڵ� �����
    String path = System.getProperty("user.dir");

    public Onlineclass() {
        path.replaceAll("\\\\", "/");
        System.setProperty("webdriver.chrome.driver", path + "/src/chromedriver.exe"); //�� ũ�Ѹ� ������ ����
        this.driver = new ChromeDriver();
        this.js = (JavascriptExecutor) driver;
    }
    public void go(String link) {
    	String script="window.open(\""+link+"\",'_blank');"; //���� ���ϴ� �ּҸ� �� ������ �����ִ� javascript �ڵ�
		js.executeScript(script); //javascript �ڵ带 ����
    }
    public ArrayList<String> readconfig() {
    	File file = new File(path + "/src/config.txt");
    	ArrayList<String> shadow=new ArrayList<String>(); //������ ����� ������ �о�� arraylist
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) { 
    	    String line;
    	    while ((line = br.readLine()) != null) { //readline�� ���� ���� ������ �� �پ� ����. ���� ���� ���� ���ٸ� null�� ����
    	    	shadow.add(line); //���� ���� arraylist�� ����
    	    }
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    	return shadow; //�о�� ������ ����

    }
}
