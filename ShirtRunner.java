class ShirtRunner{
    public static void main(String[] args)
	{
        Shirt shirt = new Shirt();

        System.out.println("The default value for color is \t" + shirt.color);
        System.out.println("The default value for size is \t" + shirt.size);
        System.out.println("The default value for brand is \t" + shirt.brand);
        System.out.println("The default value for price is \t" + shirt.price);

        shirt.color = "Blue";
        shirt.size = "M";
        shirt.brand = "Nike";
        shirt.price = 1499.99;

        System.out.println("The values after initialization:");
        System.out.println("Shirt color: " + shirt.color);
        System.out.println("Shirt size: " + shirt.size);
        System.out.println("Shirt brand: " + shirt.brand);
        System.out.println("Shirt price: " + shirt.price);
    }
}