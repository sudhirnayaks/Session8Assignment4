package session8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream in_stream = null;
		FileOutputStream out_stream = null;
	    	try{
	    	    File infile =new File("D:\\Acadgild\\MyInput.txt");
	    	    File outfile =new File("D:\\Acadgild\\MyOutput.txt");
	 
	    	    in_stream = new FileInputStream(infile);
	    	    out_stream = new FileOutputStream(outfile);
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	   //Copying the contents from input file to output file
	    	    while ((length = in_stream.read(buffer)) > 0){
	    	    	out_stream.write(buffer, 0, length);
	    	    }

	    	    //Closing the input/output file streams
	    	    in_stream.close();
	    	    out_stream.close();

	    	    System.out.println("****File copied successfully******");
	 
	    	}catch(IOException ioException){
	    		System.out.println(ioException);
	    	 }

	}

}
