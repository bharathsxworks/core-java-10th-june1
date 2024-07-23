class XworkzRunner{
	
	public static void main(String[] register){
		
		
		
	System.out.println("Main started");
	
	boolean registration = Xworkz.createTraineeRegistration("Dileep",9676523656L,9986321560L,"Dileep@gmai.com","2ai20is016","ise","BE",2024);
	
	
	if(registration == true)
	Xworkz.readTraineeRegistration();
	
	System.out.println("Main ended");
	}

}