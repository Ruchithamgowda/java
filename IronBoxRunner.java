class IronBoxRunner{
    public static void main(String[] args) 
	{
        IronBox ironBox = new IronBox();

        System.out.println("The default value for brand is \t" + ironBox.brand);
        System.out.println("The default value for wattage is \t" + ironBox.wattage);
        System.out.println("The default value for hasSteam is \t" + ironBox.hasSteam);
        System.out.println("The default value for price is \t" + ironBox.price);

        ironBox.brand = "Philips";
        ironBox.wattage = 2000;
        ironBox.hasSteam = true;
        ironBox.price = 2999.99;

        System.out.println("The values after initialization:");
        System.out.println("The iron box brand: " + ironBox.brand);
        System.out.println("The wattage: " + ironBox.wattage);
        System.out.println("Has steam? " + ironBox.hasSteam);
        System.out.println("The price is: " + ironBox.price);
    }
}