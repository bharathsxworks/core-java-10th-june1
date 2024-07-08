class BulbHolder{
	public static void main(String[] holder){
		System.out.println("Start of Main");
		
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		String brand = "Hiffin";
		int price = 800;
		String finishType = "Polished";
		String bulbBase = "E27";
		String switchType = "Toggle";
		String material = "Metal";
		
		System.out.println("The Brand of the Bulb Holder is "+brand);
		System.out.println("The price is "+ price);
		System.out.println("The finish type is "+finishType);
		System.out.println("The bulb base is "+ bulbBase);
		System.out.println("The switch type is "+switchType);
		System.out.println("The material used is "+ material);
		
		System.out.println("Product Features method ended");
	return;
	}
}