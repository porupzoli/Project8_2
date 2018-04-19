package booksWithEnum;

import java.util.Scanner;

import booksWithEnum.BooksWithEnum.Style;
import mybooks.Book.Book;

public class Main {
	 public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numberofBooks=scanner.nextInt();
		
		BooksWithEnum[] books=new BooksWithEnum[numberofBooks];
		for(int i=0; i<books.length; i++)
		{
			books[i]=new BooksWithEnum("cicva", "lhkjas", 9999, 1, Style.SCIFI);
		}
		displayBokkArrayData(books);
		BooksWithEnum[] scifiBooks=getBooksWithStyle(books, Style.SCIFI);
		for (BooksWithEnum booksWithEnum : scifiBooks) {
			System.out.println(booksWithEnum);
		}
	}
	 
	 
	public static void displayBokkArrayData(Book[] books)
	{
		for (Book book : books) 
		{
			System.out.println(book);
		}
	}
	
	public static BooksWithEnum[] getBooksWithStyle(BooksWithEnum[] books, Style style)
	{
		BooksWithEnum[] tempenumbooks=new BooksWithEnum[books.length];
		int counter=0;
		for (BooksWithEnum booksWithEnum : books) {
			if(booksWithEnum.getStyle()==style)
			{
				tempenumbooks[counter]=booksWithEnum;
				counter++;
			}
			
		}
		BooksWithEnum[] enumbooks=new BooksWithEnum[counter];
		for(int i=0; i< counter; i++)
		{
			enumbooks[i]=tempenumbooks[i];
		}
		return enumbooks;
	}
}
