class LinkedlnRunner{

public static void main(String[]job){
	
	System.out.println("Main started");
	boolean account = Linkedln.createLinkedlnAccount("Dileep","Kumar","Dileep@gmail.com","dileep2020","dileep2020","India",577129,"Microsoft","SDE","IT","BE in CSE");
	
	if(account == true)
	Linkedln.readLinkedlnAccount();
	
	
	System.out.println("Main ended");
}
}