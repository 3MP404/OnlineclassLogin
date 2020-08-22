import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;

public class main {
	public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String path = System.getProperty("user.dir");
        path.replaceAll("\\\\", "/"); //
        

        File config = new File(path + "/src/config.txt");
        if (false) {
            System.out.println("");
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
        Calendar cal = Calendar.getInstance();
        switch(cal.get(cal.DAY_OF_WEEK)){
        case 2:
        	new Monday();
        	break;
        	
        case 3:
        	new Tuesday();
        	break;
        	
        case 4:
        	new Wednesday();
        	break;
        	
        case 5:
        	new Thursday();
        	break;
        	
        case 6:
        	new Friday();
        	break;
        }
    }
}
