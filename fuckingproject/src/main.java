import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;

public class main {
	public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in); 
        String path = System.getProperty("user.dir");
        path.replaceAll("\\\\", "/"); //���� ���丮�� �����ּ�
        

        File config = new File(path + "/src/config.txt"); //������ �����ص� ���� ����
        if (config.exists()==false) { 
        	FileWriter output = new FileWriter(path + "/src/config.txt");
        	System.out.println("���� ������ �������� �����Ƿ� �ʱ� ������ �����մϴ�.");
            System.out.println("Ebs ���̵� : ");
            String code=scanner.nextLine(); //�� ���� ��ü �Է�
            output.write(code+"\n"); //���Ͽ� �Է¹��� ������ ����
            System.out.println("Ebs ��й�ȣ : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            System.out.println("���� Ŭ������ ���̵� : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            System.out.println("���� Ŭ������ ��й�ȣ : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            System.out.println("���� ���̵� : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            System.out.println("���� ��й�ȣ : ");
            code=scanner.nextLine();
            output.write(code+"\n");
            
            output.close(); //���ݱ��� �Է��� ������ ����
        }
        Calendar cal = Calendar.getInstance();
        switch(cal.get(cal.DAY_OF_WEEK)){ //���� ������ ���Ѵ�.
        case 2: //������
        	new Monday();
        	break;
        	
        case 3: //ȭ����
        	new Tuesday();
        	break;
        	
        case 4: //������
        	new Wednesday();
        	break;
        	
        case 5: //�����
        	new Thursday();
        	break;
        	
        case 6: //�ݿ���
        	new Friday();
        	break;
        default: //��, ��
        	//System.out.println("������ �����Դϴ�. ������!");
        	new Friday();
        }
    }
}
