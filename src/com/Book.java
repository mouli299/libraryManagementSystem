package com;

public class Book 
{
	private String title;
	private int id;
	private int cost;
	private  int pages;
	private String author;
	
	public Book()
	{
		
	}
	public Book(String title, int id, int cost, int pages, String author) 
	{
		if(validateTitle(title))
		{
			this.title = title;
		}
		else
		{
			throw new TitleMissMatchException();
		}
		if(validateId(id))
		{
			this.id = id;
		}
		else
		{
			throw new IdOutOfBoundException();
		}
		if(validateCost(cost))
		{
			this.cost = cost;
		}
		else
		{
			throw new CostOutofBoundException();
		}
		if(validatepages(pages))
		{
			this.pages = pages;
		}
		else
		{
			throw new PagesOutOfBoundException();
		}
		if(validateAuthor(author))
		{
			this.author = author;
		}
		else
		{
			throw new AuthorMissMatchException();
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
//	validateTitle
	
	 public boolean validateTitle(String title)
	 {
		 if(title.equalsIgnoreCase("java")|| title.equalsIgnoreCase("sql")|| title.equalsIgnoreCase("Python"))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
	 
//	 validateId
	 
	 public boolean validateId(int id)
	 {
		 if(id%2==0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
//	 validateCost
	 
	 public boolean validateCost(int cost)
	 {
		 if(cost>=2000 || cost<=300)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
//	 validateAuthor
	 
	 public boolean validateAuthor(String author)
	 {
		 if(author.equalsIgnoreCase("james")||author.equalsIgnoreCase("scott")||author.equalsIgnoreCase("alean"))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 
//	 validatepages
	 
	 public boolean validatepages(int pages)
	 {
		 if(pages<=500||pages>=3000)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	
	@Override
	public String toString() {
		return "title=" + title + "\n id=" + id + "\n cost=" + cost + "\n pages=" + pages + "\n author=" + author
				+ "\n---------------------------------------";
	}
	public void display()
	{
		System.out.println("Book Title: "+getTitle());
		System.out.println("Book Id: "+getId());
		System.out.println("Book Cost: "+getCost());
		System.out.println("Book Pages: "+getPages());
		System.out.println("Book Author: "+getAuthor());
	}
	

}
