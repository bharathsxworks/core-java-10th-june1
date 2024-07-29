class MRPStoreRunner{
 public static void main(String[] items){

   boolean addedProduct = MRPStore.addAlcoholName("Blenders Pipe");
   MRPStore.addAlcoholName("Blenders Pride");


   addedProduct = MRPStore.addAlcoholName("IB");
   MRPStore.addAlcoholName("IB");


   addedProduct = MRPStore.addAlcoholName("Royal Stag");
   MRPStore.addAlcoholName("Royal Stag");


   addedProduct = MRPStore.addAlcoholName("Old Monk");
   MRPStore.addAlcoholName("Old Monk");


   addedProduct = MRPStore.addAlcoholName("Grey Moose");
   MRPStore.addAlcoholName("Grey Moose");


   addedProduct = MRPStore.addAlcoholName("Budwiser");
   MRPStore.addAlcoholName("Budwiser");


   addedProduct = MRPStore.addAlcoholName("Pure Tonic");
   MRPStore.addAlcoholName("Pure Tonic");


   addedProduct = MRPStore.addAlcoholName("Aggermister");
   MRPStore.addAlcoholName("Aggermister");


   addedProduct = MRPStore.addAlcoholName("Bombay Supire");
   MRPStore.addAlcoholName("Bombay Supire");


   addedProduct = MRPStore.addAlcoholName("Ballitine");
   MRPStore.addAlcoholName("Ballitine");


   addedProduct = MRPStore.addAlcoholName("LIT");
   MRPStore.addAlcoholName("LIT");

   MRPStore.getAlcoholNames();



   MRPStore.updateAlcoholName("OMR", "Ballitine");

   MRPStore.getAlcoholNames();

   MRPStore.deleteAlcoholName("LIT");

   MRPStore.getAlcoholNames();

 }
}