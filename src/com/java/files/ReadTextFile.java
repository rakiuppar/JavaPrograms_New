package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
	
		String path="Data/SampleTextFile.txt";
		File file = new File(path);
		Scanner scanner = new Scanner(file);

		while(scanner.hasNext())
		{
			System.out.println(scanner.nextLine());
		}
	}
}
