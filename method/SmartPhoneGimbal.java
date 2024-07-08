class SmartPhoneGimbal{
	public static void main(String[] gimbal){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "hohem ";
		String model = "iSteady M6";
		int price = 17450;
		String connectivity = "Bluetooth";
		String weight = "600g";
		String modelNo = "DSG009F";
		
		System.out.println("The brand of the Gimbal is "+brand);
		System.out.println("The model of the Gimbal is "+model);
		System.out.println("The price of the Gimbal is "+price);
		System.out.println("The connectivity of the Gimbal is "+connectivity);
		System.out.println("The weight of the Gimbal is "+weight);
		System.out.println("The model number of the Gimbal is "+modelNo);
		
		System.out.println("Product Features method ended");
	return;
	}
}