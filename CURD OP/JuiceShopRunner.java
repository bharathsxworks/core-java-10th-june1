class JuiceShopRunner{
 public static void main(String[] juices){

   boolean addedJuice = JuiceShop.addJuiceName("Mango");
   JuiceShop.addJuiceName("Mango");

   addedJuice =JuiceShop.addJuiceName("Apple");
   JuiceShop.addJuiceName("Apple");

   addedJuice =JuiceShop.addJuiceName("Mosambi");
   JuiceShop.addJuiceName("Mosambi");

   addedJuice =JuiceShop.addJuiceName("Watermelon");
   JuiceShop.addJuiceName("Watermelon");

   addedJuice =JuiceShop.addJuiceName("chikku");
   JuiceShop.addJuiceName("chikku");

   addedJuice =JuiceShop.addJuiceName("Cold Coffee");
   JuiceShop.addJuiceName("Cold Coffee");

   addedJuice =JuiceShop.addJuiceName("Milkshake");
   JuiceShop.addJuiceName("Milkshake");

   JuiceShop.showJuiceNames();

   JuiceShop.updateJuiceName("Orange", "Mosambi");

   JuiceShop.showJuiceNames();

   JuiceShop.deleteJuiceName("chikku");

   JuiceShop.showJuiceNames();

 }
