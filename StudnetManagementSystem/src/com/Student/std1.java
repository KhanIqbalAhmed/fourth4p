package com.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class std1 {
	public static void main(String[] args) {

		System.out.println("Hello Everyone");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to exit ");
			try {
				int c = Integer.parseInt(br.readLine());
				if (c == 1) {
					System.out.println("Enter user name");
					String n = br.readLine();

					System.out.println("Enter user phoneno");
					String p = br.readLine();
					System.out.println("Enter user city");
					String ct = br.readLine();
					std2 s = new std2(n, p, ct);
					boolean answer = StudentDAO.insertStudentToDB1(s);
					if (answer) {
						System.out.println("Update successfully");
					} else
						System.out.println("" + "Something Went wrong try again ....!");
					System.out.println(s);
				 
				}

				else if (c == 4) {
					break;
				}

			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
