package com;

import java.util.Scanner;

public class LibarayMainClass
{
	public static void main(String[] args) 
	{
		Library l=new Library();
		Scanner sc=new Scanner(System.in);
		boolean isStart=true;
		while(isStart)
		{
			System.out.println("Enter The Choice: \n 1.AddBook  \n 2.displayBook  \n 3.SearchBookBasedOnId  \n 4.SearchBookBasedOnAuthor \n 5.UpdateBookCostBasedOnTitle \n 6.RemoveBookById \n 7.Exit");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter The BookTitle");
					String title=sc.next();
					System.out.println("Enter the BookId");
					int id=sc.nextInt();
					System.out.println("Enter the BookCost");
					int cost=sc.nextInt();
					System.out.println("Enter Number Of Pages");
					int pages=sc.nextInt();
					System.out.println("Enter Author Name");
					String author=sc.nextLine();
					l.addBook(new Book(title,id,cost,pages,author));
					
				}
				break;
				case 2:
				{
					l.displayBook();
				}
				break;
				case 3:
				{
					System.out.println("Enter Id To SearchBook");
					int id=sc.nextInt();
					l.searchBookBasedOnId(id);
				}
				break;
				case 4:
				{
					System.out.println("Enter The Author Name To Search Book");
					String s=sc.next();
					l.searchBookBasedOnAuthor(s);
				}
				break;
				case 5:
				{
					System.out.println("Enter The Title to Update cost");
					String title=sc.next();
					l.updateBookCostBasedOnTitle(title);
				}
				break;
				case 6:
				{
					System.out.println("Enter Id to Remove Book");
					int id=sc.nextInt();
					l.removeBookBasedOnId(id);
				}
				break;
				case 7:
				{
					isStart=false;
					System.out.println("Thank You...........");
				}
				break;
				default:System.out.println("Enter Valid Choice...");
			}
		}

	}
}
