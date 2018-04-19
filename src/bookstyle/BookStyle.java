package bookstyle;

public class BookStyle extends mybooks.Book.Book{
	String style;

	public BookStyle(String writerName, String bookName, int yearOfRelease,
			int price, String style) {
		super(writerName, bookName, yearOfRelease, price);
		this.style = style;
	}

	public String getStyle()
	{
		return style;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
