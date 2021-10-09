package Java_Gromming;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class filter_inputStream {
	public static void main(String[] args) throws IOException {
		FilterInputStream filter_input_stream = null;
		InputStream input_stream = null;
		
		try {
			char c;
			// read() method will return Bytes of Input Stream as integer
			// '-1' indicates ead till last of the stream		
			int a;
			
			byte[] buffer = new byte[6];
		//new Input Stream
			input_stream = new FileInputStream("./input_Stream_data_file/cde.txt");
			
			//passing input stream into filter input stream
			filter_input_stream = new BufferedInputStream(input_stream);
			
			//checking it is reading till last of the stream 
			a = input_stream.read(buffer);
			
			int length = 1;
			
			for(byte read_bytes : buffer)
			{
				//read method retun integer value
				//so, we convert each integer value to char
				c = (char) read_bytes;    
				
				System.out.println(length+" "+c);
				length++;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			//closing once it reached the input stream
			if (input_stream != null)
				input_stream.close();
			
			if(filter_input_stream != null)
				filter_input_stream.close();
		}
	}
}
