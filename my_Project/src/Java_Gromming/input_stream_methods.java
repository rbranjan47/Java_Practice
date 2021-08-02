package Java_Gromming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class input_stream_methods 
{
	public static void main(String[] args) throws IOException 
	{
		//declaring input stream as global varibale
		InputStream data = null;
		try {
			data = new FileInputStream("./input_Stream_data_file/Abc.txt");
			
			//reading file text one by one and casting into char
			System.out.println("data: "+(char)data.read());
			System.out.println("data: "+(char)data.read());
			System.out.println("data: "+(char)data.read());
			System.out.println("data: "+(char)data.read());
			System.out.println("data: "+(char)data.read());
			System.out.println("data: "+(char)data.read());
			
			
			//marking, the read limiting of the data
			data.mark(0);
			System.out.println("data: "+(char)data.read());
			System.out.println("data: "+(char)data.read());
			
			//Skip() results skiping 1 values while reading
			data.skip(1);
			System.out.println("data: "+(char)data.read());
			System.out.println("data: "+(char)data.read());
			System.out.println("data: "+(char)data.read());
			
			boolean mark_supported_check = data.markSupported();
			
			if(data.markSupported())
			{
				data.reset();
				System.out.println("reset() method invoked ");
				System.out.println("data: "+(char)data.read());
				System.out.println("data: "+(char)data.read());
				System.out.println("data: "+(char)data.read());
			}
			
			else
				System.out.println(mark_supported_check);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally
		{
			if(data!=null)
			{
				data.close();
			}
		}
	}
}
