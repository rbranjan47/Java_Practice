package Java_Gromming;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class output_stream 
{
	public static void main(String args[]) throws IOException 
	{
		OutputStream os = new FileOutputStream("./input_Stream_data_file/bcd.txt");
		
		//declaring bytes array
		byte[] b = {65, 66, 67, 68, 69, 70};
		
		//writing b.length bytes from specified array
		os.write(b);
		
		//flushing the output stream and forcing the output stream to be written
		os.flush();
		
		//write(int b) method, Writes the specified byte to this output stream
		for(int i=71; i<76;i++)
		{
			os.write(i);
		}
		
		os.flush();
		
		os.close();
	}
}
