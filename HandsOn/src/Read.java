import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File fr=new File("C:\\Users\\Lenovo\\Desktop\\text.txt");
		Scanner scan = new Scanner(fr);
		String st;
		while(scan.hasNextLine()) {
			st=scan.nextLine();
			System.out.println(st);
		}
	}

}
