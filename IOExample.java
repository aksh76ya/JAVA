package collections2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream input=new FileInputStream("C:/Sathyabama/input.txt");
			OutputStream output=new FileOutputStream("C:/Sathyabama/output.txt");
			int x=0;
			while((x=input.read())!= -1) {
				//System.out.print((char)x);
				output.write(x);
			}
			output.close();
			input.close();
			System.out.println("Data written successfully...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
