package assign02;

import java.util.*;

public class LibraryBook extends Book {

	private String holder;
	private GregorianCalendar dueDate;

	public LibraryBook(long isbn, String author, String title) {
		super(isbn, author, title);
		// TODO Auto-generated constructor stub
	}

	public String getHolder() {
		return holder;
	}

	public GregorianCalendar getDueDate() {
		return dueDate;
	}
}
