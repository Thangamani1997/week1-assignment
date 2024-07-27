package automationw1.d1;

public class Library {
	
	public String addbook(String bookname)
	{
		System.out.println(bookname+" book added successfully");
		return bookname;
		
	}
    public void issueBook()
    {
    	System.out.println("book issued successfully");
    }
	
public static void main(String[] args)
{
	Library lbk = new Library();
	lbk.addbook("automation testing");
	lbk.issueBook();
}
}
