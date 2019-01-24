package assign02;

import java.util.GregorianCalendar;

/**
 * This class represents a library book, in which the ISBN, author, and title cannot
 * change once the book is created.  Note that ISBNs are unique.
 * 
 * @author Sheldon Jensen
 * @version January 16, 2019
 */

public class LibraryBook extends Book {

	private String holder;
	
	private GregorianCalendar dueDate;
	
	private boolean checkedOut;
	
	/**
	 * Creates a book from the given ISBN, author, and title.
	 * 
	 * @param isbn
	 * @param author
	 * @param title
	 */
	public LibraryBook(long isbn, String author, String title) {
		super (isbn, author, title);
		holder = null;
		dueDate = null;
		checkedOut = false;
	}
	
	/**
	 * Returns the current holder of the book
	 */
	public String getHolder() {
		return this.holder;
	}
	
	/**
	 * Returns the due date by which the holder must return the book
	 */
	public GregorianCalendar getDueDate() {
		return this.dueDate;
	}
	
	/**
	 * Checks the book into the library
	 */
	public void checkIn() {
		checkedOut = false;
		holder = null;
		dueDate = null;
	}
	
	/**
	 * Checks the book out of the library
	 */
	public void checkOut(String holder, int month, int day, int year) {
		checkedOut = true;
		this.holder = holder;
		dueDate = new GregorianCalendar(year, month, day);
	}
	
	/**
	 * Returns whether the book is checked out or not
	 */
	public boolean isCheckedOut() {
		return this.checkedOut;
	}
}
