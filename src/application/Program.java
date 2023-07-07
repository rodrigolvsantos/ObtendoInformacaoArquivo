package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); /*Function getName() - Only name of file*/
		System.out.println("getParent: " + path.getParent()); /*Function getParent() - Only name of path*/
		System.out.println("getPath: " + path.getPath()); /*Function getPath() - Show all path of file*/
		
		
		sc.close();

	}

}
