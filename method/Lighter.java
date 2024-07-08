class Lighter{
	public static void main(String[] lighter){
		System.out.println("Start of Main");
		
		System.out.println("The Product Details are");
		ProductFeatures();
		
		System.out.println("End of Main");
	}
	
	public static void ProductFeatures(){
		System.out.println("Product Features method started");
		
		int price = 3080;
		String brand = "Zippo";
		String colour = "Black";
		String material = "Metal";
		String weight = "0.05Kg";
		String dimensions = "35L-10W-55Th";
		
		System.out.println("The brand of Induction is "+brand);
		System.out.println("The price is "+price);
		System.out.println("The colour is "+colour);
		System.out.println("The material used is "+material);
		System.out.println("The product weight is "+weight);
		System.out.println("The product dimensions are "+dimensions);
		
		System.out.println("Product Features method ended");
	return;	
	}
}