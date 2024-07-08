class PureitEco{
	public static void main(String[] purifier){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		int price = 12998;
		String brand = "HUL Pureit";
		String feature = "RO,RO+";
		String material = "Plastic";
		String capacity = "10L";
		String dimension = "36L-29W-48H";
		
		System.out.println("The Brand of the water purifier is "+brand);
		System.out.println("The price is "+ price);
		System.out.println("The special feature are "+feature);
		System.out.println("The material used in manufacture is "+material);
		System.out.println("The capacity  of the purifieris "+ capacity);
		System.out.println("The dimension is "+ dimension);
		
		System.out.println("Product Features method ended");
	return;
	}
}