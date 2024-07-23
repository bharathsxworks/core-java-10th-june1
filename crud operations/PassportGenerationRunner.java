class PassportGenerationRunner{

	public static void main(String[] passport){
	
		boolean createPassport = PassportGrneration.createUserPassport("PO", "Bengaluru", "Dileep", "Kumar", "08/01/2003", "dileep@gmail.com", true, "dil2020", "Dileep", "Dileep", "School", "ST. Anne's", "123wedw");
	
		if(createPassport == true)
		PassportGrneration.readUserPassportDetails();
	}
}