package com.ipartek.formacion.uf2216;

public class Revistas implements Leible, Comparator{

	//Variables de la revista
	static final int MIN_ISBN = 10;
	static final int MIN_CHAR = 3;
	static final int MAX_CHAR = 150;
	static final int MIN_PAGES = 1;
	
	String title = "";
	String isbn = "";
	int pages = 0;
	boolean format;

	
	//constructor
	public Revistas(String title, String isbn, int pages, boolean format) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.pages = pages;
		this.format = format;
	}


	//Getters y setters
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {

	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		if (this.isbn.length() == MIN_ISBN) {
			System.out.println("Good");
		} else {
			System.out.println("The isbn data must have 10 digits");

		}
	}


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public boolean isFormat() {
		return format;
	}


	public void setFormat(boolean format) {
		this.format = format;
	}


	//método toString para mostrar los datos.
	@Override
	public String toString() {
		return "Revistas [title=" + title + ", isbn=" + isbn + ", pages=" + pages + ", format=" + format + "]";
	}


	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return this.pages;
	}


	@Override
	public boolean compareTo(Revistas r) {
		// TODO Auto-generated method stub
		return false;
	}



	}
	
	
	
