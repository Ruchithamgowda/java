class ProductSearchRunner {
    public static void main(String[] args) {
        String product = "Laptop";
        double price = ProductSearch.getPriceByProduct(product);
        System.out.println("Price: " + price);

        product = "Smartphone";
        price = ProductSearch.getPriceByProduct(product);
        System.out.println("Price: " + price);

        product = "Unknown Product";
        price = ProductSearch.getPriceByProduct(product);
        System.out.println("Price: " + price);

        String[] brands = ProductSearch.getBrandsByProduct("Laptop");
        System.out.println("Laptop Brands:");
        for (String brand : brands)
			{
            System.out.println(brand);
        }

        brands = ProductSearch.getBrandsByProduct("Smartwatch");
        System.out.println("Smartwatch Brands:");
        for (String brand : brands) 
		{
            System.out.println(brand);
        }

        brands = ProductSearch.getBrandsByProduct("Unknown Product");
        System.out.println("Unknown Product Brands:");
        for (String brand : brands) 
		{
            System.out.println(brand);
        }

        ProductSearch.searchProductAvailability("Laptop");
        ProductSearch.searchProductAvailability("Smartwatch");
        ProductSearch.searchProductAvailability("Unknown Product");
    }
}
