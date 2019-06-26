package com.ipartek.formacion.uf2216;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.ipartek.formacion.uf2216.Revistas;

public class Kiosko implements Leible, Comparator {

	static final int LIST_OPTION = 1;
	static final int CREATE_OPTION = 2;
	static final int EXIT_OPTION = 0;

	static final int MIN_ISBN = 10;
	static final int MIN_CHAR = 3;
	static final int MAX_CHAR = 150;
	static final int MIN_PAGES = 1;

	Revistas rev;  
	static int optionSelected;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Revistas> listMagazine = new ArrayList<Revistas>();

	public static void main(String[] args) {

		do {

			menu();

			switch (optionSelected) {
			case 1:
				createMagazine();

				break;

			case 2:
				magazineList();
				break;
			}
		} while (optionSelected != EXIT_OPTION);
		System.out.println("Finish");
	}

	public static void menu() {

		System.out.println("********************");
		System.out.println("Please, choose an option:");
		System.out.println("*********************");
		System.out.println("1.- Magazine list.");
		System.out.println("2.- Create magazine");
		System.out.println("**********************");

		try {

			optionSelected = Integer.parseInt(sc.nextLine());

		} catch (Exception e) {

			System.out.println("Invalid option. Repeat again");

			menu();

		}
	}

	public static void createMagazine() {

		System.out.println("Please, write a title...");

		try {
			String title = sc.nextLine();
			if (title.length() >= MIN_CHAR && title.length() <= MAX_CHAR) {
				System.out.println("Good");

			} else {
				System.out.println("Incorrect data. It must be between 3 and 150 char.");
				createMagazine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


			
				System.out.println("Please, write the isbn...");
				String isbn = sc.nextLine();
				do {
				if (isbn.length() == MIN_ISBN) {
					System.out.println("Good");
				} else {
					System.out.println("The isbn data must have 10 digits");

				}

			
		} while (isbn.length() == MIN_ISBN);
				

		System.out.println("Please, write the number of pages...");

		int nPages = Integer.parseInt(sc.nextLine());
		do {
			if (nPages >= MIN_PAGES) {
				System.out.println("Good");
			} else {
				System.out.println("The magazine must have at least 1 page");

			}
		} while (nPages != 0);

		System.out.println("Please, tell me the format (true = digital, false = paper)");
		try {
			boolean format = Boolean.parseBoolean(sc.nextLine());
			if (format == true || format == false) {
				System.out.println("good");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * Revistas magazine = new Revistas(title, isbn, nPages, format); //
		 * System.out.println("TITLE || ISBN || PAGES || FORMAT");
		 * System.out.println(" TITLE: " + magazine.getTitle() + "\n ISBN: " +
		 * magazine.getIsbn() + " \n PAGES: " + magazine.getPages() + " \n FORMAT: " +
		 * magazine.isFormat());
		 */

	}

	public static void magazineList() {

		for (Revistas magazine : listMagazine) {
			System.out.println(magazine.getTitle() + magazine.getIsbn() + magazine.getPages() + magazine.isFormat());
		}

	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean compareTo(Revistas r) {
		// TODO Auto-generated method stub
		return false;
	}

}
