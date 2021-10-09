package Java_Gromming;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class filter_inputStream2 {
	public static void main(String[] args) throws IOException {
		FilterInputStream filter_input_stream = null;
		InputStream input_stream = null;

		try {
			char c;
			int a;

			// declaring byte array to read the byte
			byte[] buffer = new byte[5];

			// intializing the filterinputStream and inputStream
			input_stream = new FileInputStream("./input_Stream_data_file/cde.txt");
			// filtering the data by passing input stream to filterinput stream
			filter_input_stream = new BufferedInputStream(input_stream);

			// using offset and maxlen read method to read
			a = filter_input_stream.read(buffer, 2, 5);

			
			for (byte byte_read : buffer) 
			{
				c = (char) byte_read;
				
				if(byte_read == 0)
					c = '*';
				
				System.out.println(c);
			}
		} catch (Exception e) {

		} finally {
			if (filter_input_stream != null) {
				filter_input_stream.close();
			}

			if (input_stream != null) {
				input_stream.close();
			}
		}
	}
}
