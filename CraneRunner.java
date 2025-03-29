class CraneRunner{
    public static void main(String[] args) 
	{
        Crane crane = new Crane();

        System.out.println("The default value for type is \t" + crane.type);
        System.out.println("The default value for capacity is \t" + crane.capacity);
        System.out.println("The default value for isElectric is \t" + crane.isElectric);
        System.out.println("The default value for height is \t" + crane.height);

        crane.type = "Tower Crane";
        crane.capacity = 5000;
        crane.isElectric = true;
        crane.height = 50.5;

        System.out.println("The values after initialization:");
        System.out.println("The crane type: " + crane.type);
        System.out.println("The crane capacity: " + crane.capacity);
        System.out.println("Is electric? " + crane.isElectric);
        System.out.println("The crane height: " + crane.height);
    }
}