import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;

public class main {
	public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in); 
        String path = System.getProperty("user.dir");
        path.replaceAll("\\\\", "/"); //현재 디렉토리의 절대주소
        

        File config = new File(path + "/src/config.txt"); //계정을 저장해둔 설정 파일
        if (config.exists()==false) { 
        	FileWriter output = new FileWriter(path + "/src/config.txt");
        	System.out.println("계정 파일이 존재하지 않으므로 초기 설정을 시작합니다.");
            System.out.println("Ebs 아이디 : ");
            String code=scanner.nextLine(); //한 줄을 전체 입력
            output.write(code+"\n"); //파일에 입력받은 내용을 저장
            System.out.println("Ebs 비밀번호 : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            System.out.println("구글 클래스룸 아이디 : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            System.out.println("구글 클래스룸 비밀번호 : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            System.out.println("구름 아이디 : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            System.out.println("구름 비밀번호 : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            
            output.close(); //지금까지 입력한 파일을 저장
        }
        Calendar cal = Calendar.getInstance();
        switch(cal.get(cal.DAY_OF_WEEK)){ //현재 요일을 구한다.
        case 2: //월요일
        	new Monday();
        	break;
        	
        case 3: //화요일
        	new Tuesday();
        	break;
        	
        case 4: //수요일
        	new Wednesday();
        	break;
        	
        case 5: //목요일
        	new Thursday();
        	break;
        	
        case 6: //금요일
        	new Friday();
        	break;
        default: //토, 일
        	//System.out.println("오늘은 휴일입니다. 쉬세요!");
        	new Friday();
        }
    }
}
