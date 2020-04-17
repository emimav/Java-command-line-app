// name: Emima Vaipan
// student number: 1743324

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Encrypt {
	public static void main(String[] args) {
		try {
			byte[] b = new byte[128];
			DataInputStream in = new DataInputStream(new FileInputStream("Secret.txt")); 
			while(true) {
				int read = in.read(b, 0, 128);
				// reading 128 bytes from the file and converting them into String
				String s = new String(b);
				for(int i = 0 ; i < s.length() ; i ++) {
					//  and then processing  one character at the time
					char c = s.charAt(i);
					if(Character.isAlphabetic(c) && Character.isLowerCase(c)) {
						 if(c == 'a') {
							c = 'z';
						}
						else {
							c = (char)(c -1);
						}
					}
					System.out.print(c);
				}
				if(read < 128) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
