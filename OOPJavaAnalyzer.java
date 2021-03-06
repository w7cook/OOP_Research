/*
* Program that will analyze java code to see how pure 
* OOP of a language it is.
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class OOPJavaAnalyzer{
    public static void main(String[] args){
	    
	// checks to see if there is exactly one argument passed
	if (args.length != 1){
	    System.err.println("No file detected. Exactly one file required");
	    System.exit(1);
	}
	
	File inputFile  = new File(args[0]);

	ReadFiles file = new ReadFiles();
	System.out.println(file.checkIsFile(inputFile));	
	System.out.println(file.countClassType(inputFile));
	//System.out.println(file.countCastToClass(inputFile)); (Still needs some work)
    }

}


