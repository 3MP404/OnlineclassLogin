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
    public WebDriver driver; //웹 크롤링 도구
    public JavascriptExecutor js; //javascript 코드 실행기
    String path = System.getProperty("user.dir");

    public Onlineclass() {
        path.replaceAll("\\\\", "/");
        System.setProperty("webdriver.chrome.driver", path + "/src/chromedriver.exe"); //웹 크롤링 도구를 지정
        this.driver = new ChromeDriver();
        this.js = (JavascriptExecutor) driver;
    }
    public void go(String link) {
    	String script="window.open(\""+link+"\",'_blank');"; //내가 원하는 주소를 새 탭으로 열어주는 javascript 코드
		js.executeScript(script); //javascript 코드를 실행
    }
    public ArrayList<String> readconfig() {
    	File file = new File(path + "/src/config.txt");
    	ArrayList<String> shadow=new ArrayList<String>(); //계정을 적어둔 파일을 읽어올 arraylist
    	try (BufferedReader br = new BufferedReader(new FileReader(file))) { 
    	    String line;
    	    while ((line = br.readLine()) != null) { //readline은 내가 읽을 파일을 한 줄씩 읽음. 만약 읽을 줄이 없다면 null울 리턴
    	    	shadow.add(line); //읽은 줄을 arraylist에 저장
    	    }
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    	return shadow; //읽어온 파일을 리턴

    }
}
