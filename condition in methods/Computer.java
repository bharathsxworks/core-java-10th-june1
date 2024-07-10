 class Computer {

    static boolean isComputerOn = false;

    public static void turnOn() {
        System.out.println("Start of turnOn method");

        if (!isComputerOn==false) {
            isComputerOn = true;
            System.out.println("Computer is turned on");
        }

        System.out.println("End of turnOn method");
		
		return;
    }

    public static void turnOff() {
        System.out.println("Start of turnOff method");

        if (isComputerOn==true) {
            isComputerOn = false;
            System.out.println("Computer is turned off");
        }

        System.out.println("End of turnOff method");
		return;
    }

   
}
