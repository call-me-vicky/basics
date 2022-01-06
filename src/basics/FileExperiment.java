package basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExperiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader f;
		try {
		
			f = new FileReader("data.txt");
			BufferedReader br = new BufferedReader(f);

			String s;
			while ( (s = br.readLine()) != null)
			{
				System.out.println(s);
			}
		
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("The file data.txt is not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

}
