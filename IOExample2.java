package collections2;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fs=new FileInputStream("C:/Sathyabama/input.txt");
			int x=0;
			String str=null;
			x=fs.read();
			while(x != -1 ) {
				str = str + (char)x;
				x=fs.read();
			}
			
			fs.close();
			byte[] b=str.getBytes();  // getBytes(): byte[]
			ByteArrayInputStream ba=new ByteArrayInputStream(b);
			x=ba.read();
			while(x != -1) {
				System.out.print((char) x);
				x= ba.read();
			}
			System.out.println();
			ba.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
