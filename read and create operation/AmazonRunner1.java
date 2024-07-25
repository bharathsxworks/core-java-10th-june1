class AmazonRunner1{
	
	public static void main(String[] item){
		System.out.println("Main started");
	
		boolean addProduct = Amazon.addProductName("laptop");
		 
		addProduct = Amazon.addProductName("smartwatches");
		 
		addProduct = Amazon.addProductName("headphones");
		 
		addProduct = Amazon.addProductName("cameras");
		 
		addProduct = Amazon.addProductName("tablets");
		 
		addProduct = Amazon.addProductName("speakers");
		 
		addProduct = Amazon.addProductName(" washing machine");
		 
		addProduct = Amazon.addProductName("projectors");
		 
		addProduct = Amazon.addProductName("tv");
		 
		addProduct = Amazon.addProductName("DVD players");
		 
		addProduct = Amazon.addProductName("chargers");
		 
		Amazon.readProductNames();
		
		System.out.println("Main ended");
	}
}