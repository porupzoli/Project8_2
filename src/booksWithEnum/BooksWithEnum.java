package booksWithEnum;

import mybooks.Book.Book;

public class BooksWithEnum extends Book {
	
	public enum Style
	{
		SCIFI,ROMANCE,COOK,OTHER
	}
	Style style;
	public BooksWithEnum(String writerName, String bookName, int yearOfRelease,
			int price, Style style) {
		super(writerName, bookName, yearOfRelease, price);
		this.style = style;
	}
	
	@Override
	public String toString() {
		return "BooksWithEnum [style=" + style + "]";
	}
	
	public Style getStyle() {
		return style;
	}

	

}
