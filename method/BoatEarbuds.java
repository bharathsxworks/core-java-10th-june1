class BoatEarbuds{
	public static void main(String[] earbuds){
		System.out.println("Start of Main");
		
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "Boat";
		int price = 1500;
		String material = "Plastic";
		String uses = "Gaming";
		int range = 10;
		String itemWeight = "10g";

		System.out.println("The Brand of the Earbud is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The material used is "+material);
		System.out.println("The Earbud is used for "+uses);
		System.out.println("The range of connectivity is "+range+" Meter");
		System.out.println("The product weight is "+itemWeight);
		
		
		System.out.println("Product Features method ended");
	return;
	}
}