class JamoonRunner{
    public static void main(String[] args)
	{
        Jamoon jamoon = new Jamoon();

        System.out.println("The default value for flavor is \t" + jamoon.flavor);
        System.out.println("The default value for size is \t" + jamoon.size);
        System.out.println("The default value for isSweet is \t" + jamoon.isSweet);
        System.out.println("The default value for price is \t" + jamoon.price);

        jamoon.flavor = "Rose";
        jamoon.size = 5;
        jamoon.isSweet = true;
        jamoon.price = 20.99;

        System.out.println("The values after initialization:");
        System.out.println("The jamoon flavor: " + jamoon.flavor);
        System.out.println("The jamoon size: " + jamoon.size);
        System.out.println("Is sweet? " + jamoon.isSweet);
        System.out.println("The jamoon price is: " + jamoon.price);
    }
}
