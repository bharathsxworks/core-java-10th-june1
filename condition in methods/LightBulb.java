 class LightBulb {

    static boolean isLightOn = false;

    public static void turnOn() {
        System.out.println("Start of turnOn method");

        if (isLightOn==false) {
            isLightOn = true;
            System.out.println("Light bulb is turned on");
        }

        System.out.println("End of turnOn method");
		return;
    }

    public static void turnOff() {
        System.out.println("Start of turnOff method");

        if (isLightOn==true) {
            isLightOn = false;
            System.out.println("Light bulb is turned off");
        }

        System.out.println("End of turnOff method");
		return;
    }

   
}
