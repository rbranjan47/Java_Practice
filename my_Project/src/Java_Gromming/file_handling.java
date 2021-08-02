package Java_Gromming;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class file_handling 
{
	//Create a new file and update info 
	public static void main(String data[]) 
	{
		try {
			//first info update
			String new_first_info = data[0];
			
			//Second info update
			long new_second_info = Long.parseLong(data[1]);
			
			String read_info;
			String first_info;
			long second_info;
			
			//file creating if not present
			File file = new File("‪E:\\Test_Data\\info.txt");
			
			if (!file.exists()) 
			{
				file.createNewFile();
			}
			
			//opening the file and setting mode read and write
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			
		boolean found = false;
		
		//checking first and second info already exists
		while(raf.getFilePointer() < raf.length())
		{
			//reading the file
			read_info = raf.readLine();
			
			//spiltting using Array, to get the values
			String[] line_spilt = read_info.split("!");
			
			//getting info
			first_info = line_spilt[0];
			second_info = Long.parseLong(line_spilt[1]);
			
			
			if (first_info == new_first_info || second_info == new_second_info)
			{
				//if match then we will vreak the conditions
				found = true;
				break;
			}
		}
		
		if (found == false)
		{
			//when record is not present then entering it
			read_info = new_first_info +"!"+ String.valueOf(new_second_info);
			
			//writebytes functions to write a string as a sequence of bytes
			//to insert next record
			raf.writeBytes(read_info);
			
			//to insert new record in new line
			raf.writeBytes(System.lineSeparator());
			
			//print the success message
			System.out.println("info added");
			
			raf.close();
		}
		
		else {
			raf.close();
			
			//print the message
			System.out.println("info data not found");
		}
		}
		catch(IOException ioe) {
			System.out.println(ioe);
		}
		
		catch(NumberFormatException nef) {
			System.out.println(nef);
		}
	}
}
