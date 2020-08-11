import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = System.getProperty("user.dir");
        path.replaceAll("\\\\", "/"); //현재 디렉토리


        File config = new File(path + "/src/config.txt");
        if (false) {
            System.out.println("설정 파일이 존재하지 않습니다.\n초기 설정을 진행합니다.");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            FileWriter output = new FileWriter(path + "/src/config.txt");
            output.write("test");
            output.close();
            return;
        }
        Goorm goorm = new Goorm();
        goorm.start();
    }
}

//java python c c# cotlin db brainfuck