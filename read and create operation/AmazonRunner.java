class AmazonRunner{

    public static void main(String[] amazon){
	
	    System.out.println("Main Started");
		boolean accountCreate =CreateAmazonAccount.createUserAccount("Dileep", "Kumar", 9746751870L, "dileep@gmail.com", "dileep2020", "dileep2020");
		
		if(accountCreate == true)
		CreateAmazonAccount.readAccountDetails();
		
		System.out.println("Main Ended");
	
	}
}