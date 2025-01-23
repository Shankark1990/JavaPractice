package techelliptica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ResourceHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (InputStream inputStream = new FileInputStream("input.txt");
				OutputStream outputStream = new FileOutputStream("output.txt");) {
			byte[] data = new byte[1024];

			int byteRead = inputStream.read(data);
			if (byteRead != -1) {
				outputStream.write(data, 0, byteRead);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An I/O error occured: " + e.getMessage());
		}

	}

}
