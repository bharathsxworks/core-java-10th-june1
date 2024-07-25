class Amazon{

	static String productNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start;
	
	public static boolean addProductName(String name){
		
		System.out.println("addProductName method started");
		
		boolean isNameAdded = false;
		
		if(start<productNames.length){
		
			if(name != null){
				productNames[start++]=name;
				isNameAdded = true;
				System.out.println("product name added");
			}else
				System.out.println("product name is invalid");
		}else
			System.out.println("product names are full");
		
		System.out.println("addProductName method ended");
			
	return isNameAdded;
	}
	
	public static void readProductNames(){
		
		System.out.println("readProductNames method started");
		
		System.out.println("Available product names are");
		for(String product : productNames)
			System.out.println(product);
		
		System.out.println("readProductNames method ended");
	
	return;
	}
}