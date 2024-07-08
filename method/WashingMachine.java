class WashingMachine{
	public static void main(String[] washing){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		int price =25300;
		String brand = "LG";
		String capacity = "8 KG";
		String modelNo = "FHM1408BDM";
		String efficiency = "5 Star";
		String maximumRPM = "1400 RPM";
		
		System.out.println("The brand of the Washing Machine is "+price);
		System.out.println("The price is "+price);
		System.out.println("The capacity it can hold is "+capacity);
		System.out.println("The Model number is "+modelNo);
		System.out.println("The Energy efficiency is "+efficiency);
		System.out.println("The maximum RPM is "+maximumRPM);
		
		System.out.println("Product Features method ended");
	return;
	}
}