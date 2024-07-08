class SmartTV{
	public static void main(String[] tv){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "Samsung";
		int size = 32;
		int price = 15000;
		String display = "LED";
		String resolution = "768p";
		String refreshRate = "60 Hz";

		System.out.println("The Brand of the TV is "+brand);
		System.out.println("The Size of the TV is "+size);
		System.out.println("The Prize of the TV is "+price);
		System.out.println("The Display Technology of the TV is "+display);
		System.out.println("The Resolution of the TV is "+resolution);
		System.out.println("The Refresh Rate of the TV is "+refreshRate);
		
		System.out.println("Product Features method ended");
	return;
	}
}