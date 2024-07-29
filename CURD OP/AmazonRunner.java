lass AmazonRunner{
	
	public static void main(String[] item){
		System.out.println("Main started");

		boolean addProduct = Amazon.addProductName("laptop");
		Amazon.addProductName("laptop");

		addProduct = Amazon.addProductName("smartwatches");
		Amazon.addProductName("smartwatches");

		addProduct = Amazon.addProductName("headphones");
		Amazon.addProductName("headphones");

		addProduct = Amazon.addProductName("cameras");
		Amazon.addProductName("cameras");

		addProduct = Amazon.addProductName("tablets");
		Amazon.addProductName("tablets");

		addProduct = Amazon.addProductName("speakers");
		Amazon.addProductName("speakers");

		addProduct = Amazon.addProductName(" washing machine");
		Amazon.addProductName(" washing machine");

		addProduct = Amazon.addProductName("projectors");
		Amazon.addProductName("projectors");

		addProduct = Amazon.addProductName("tv");
		Amazon.addProductName("tv");

		addProduct = Amazon.addProductName("DVD players");
		Amazon.addProductName("DVD players");

		addProduct = Amazon.addProductName("chargers");
		Amazon.addProductName("chargers");

		Amazon.readProductNames();

		Amazon.updateProductName("mobile" , "tablets" );

		Amazon.readProductNames();

		Amazon.deleteProductName("tv");

		Amazon.readProductNames();

		System.out.println("Main ended");
	}
}