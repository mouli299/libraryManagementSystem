package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
private int libId;
private String location;

private Book b;

private ArrayList<Book> book=new ArrayList<Book>();

//addBooks

	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Book Added Successfully..");
	}
	
	//displayBook
	
	public void displayBook()
	{
		if(book.isEmpty())
		{
			System.out.println("Books Are Not Yet Added");
		}
		else
		{
			for(Book b:book)
			{
				b.display();
			}
		}
	}
	
//	SearchBookBasedOnId
	
	public void searchBookBasedOnId(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books Are Not Yet Added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getId()==id)
				{
					System.out.println("Book Founded :"+b.getTitle());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new BookOutofBoundException();
		}
	}
//	searchBookBasedOnAuthor

	public void searchBookBasedOnAuthor(String author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books Are Not Yet Added");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getAuthor()==author)
				{
					System.out.println("Book Founded :"+b.getTitle());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new BookOutofBoundException();
		}
	}
//	updateBookCostBasedOnTitle
	public void updateBookCostBasedOnTitle(String title)
	{
		boolean isUpdate=false;
		if(book.isEmpty())
		{
			System.out.println("Books Are Not Yet Added...");
		}
		else
		{
			for(Book b:book)
			{
				if(b.getTitle()==title)
				{
					b.setCost(1000);
					System.out.println("Book Cost Is Updated....");
					isUpdate=true;
				}
			}
		}
		if(isUpdate==false)
		{
			throw new BookOutofBoundException();
		}
	}
//	removeBookBasedOnId
	
	public void removeBookBasedOnId(int id)
	{
		Iterator<Book> itr=book.iterator();
		boolean isRemoved=false;
		if(book.isEmpty())
		{
			System.out.println("Books Are Not Yet Added");
		}
		else
		{
			while(itr.hasNext())
			{
				Book b=itr.next();
				if(b.getId()==id)
				{
					itr.remove();
					System.out.println("Book Is Removed....");
					isRemoved=true;
				}
			}
		}
		if(isRemoved==false)
		{
			throw new BookOutofBoundException();
		}
	}
}
