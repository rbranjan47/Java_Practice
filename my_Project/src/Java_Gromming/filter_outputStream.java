package Java_Gromming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class filter_outputStream {

	public static void main(String[] args) throws IOException 
	{
		OutputStream output_stream = null;
		FilterOutputStream filter_output_stream = null;
		
		//file input stream using here
		FileInputStream file_input_stream = null;
		
		
		char c;
		int a;
		
		try {
			output_stream = new FileOutputStream("./input_Stream_data_file/efg.txt");
			filter_output_stream = new FilterOutputStream(output_stream);
			
			//writing bytes into file
			filter_output_stream.write(90);
			
			//flushing the remaining bytes of output stream
			filter_output_stream.flush();
			
			//creating input stream to read again
			file_input_stream = new FileInputStream("efg.txt");
			
			//reading the bytes and conveting it into int
			a = file_input_stream.read();
			
			//converting int to char for our program output
			c = (char) a;
			System.out.println(c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally {
			if (output_stream != null)
			{
				output_stream.close();
			}
			
			if (filter_output_stream != null)
			{
				filter_output_stream.close();
			}
		}

	}

}
