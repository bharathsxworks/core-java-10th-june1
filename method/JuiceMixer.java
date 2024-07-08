class JuiceMixer{
	public static void main(String[] mixer){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		int price = 1897;
		String brand = "Nutripro";
		String colour = "Silver";
		String material = "Copper";
		String capacity = "500ML";
		String dimensions = "21D-12W-26H";
		
		System.out.println("The Brand of the mixer is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The colour is "+colour);
		System.out.println("The material used is "+material);
		System.out.println("The capacity is "+capacity);
		System.out.println("The product dimensions are "+dimensions);
		
		System.out.println("Product Features method ended");
	return;
	}
}