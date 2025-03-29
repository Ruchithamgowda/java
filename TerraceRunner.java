class TerraceRunner{
    public static void main(String[] args)
	{
        Terrace terrace = new Terrace();

        System.out.println("The default value for area is \t" + terrace.area);
        System.out.println("The default value for type is \t" + terrace.type);
        System.out.println("Is it open? \t" + terrace.isOpen);
        System.out.println("The default value for height is \t" + terrace.height);

        terrace.area = 500;
        terrace.type = "Open";
        terrace.isOpen = true;
        terrace.height = 15;

        System.out.println("The values after initialization:");
        System.out.println("Terrace area: " + terrace.area);
        System.out.println("Terrace type: " + terrace.type);
        System.out.println("Is it open? " + terrace.isOpen);
        System.out.println("Terrace height: " + terrace.height);
    }
}