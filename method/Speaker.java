class Speaker{
	public static void main(String[] speakers){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String Brand = "ZEBRONICS";
		int price = 24999;
		String outputPower = "625 Watts";
		String frequencyResponse = "40 Hz";
		String connectivityTechnology = "Auxiliary and USB";
		String modelNo = "DSVB1254D";

		System.out.println("The Brand of the Speaker is "+Brand);
		System.out.println("The price is "+price);
		System.out.println("The Output Power of the Speaker is "+outputPower);
		System.out.println("The Frequency Response of the Speaker is "+frequencyResponse);
		System.out.println("The Connectivity Technology is "+connectivityTechnology);
		System.out.println("The model number is "+modelNo);
		
		System.out.println("Product Features method ended");
	return;
	}
}