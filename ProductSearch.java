class ProductSearch {
    static double getPriceByProduct(String productName) { 
        System.out.println("Running getPriceByProduct: " + productName);

        if (productName == "Laptop")
			{
            return 55000.0;
        } 
		else if (productName == "Smartphone") 
		{
            return 25000.0;
        } 
		else if (productName == "Headphones") 
		{
            return 2000.0;
        } 
		else if (productName == "Smartwatch")
			{
            return 5000.0;
        } 
		else if (productName == "Tablet") 
		{
            return 30000.0;
        } 
		
		else if (productName == "Camera") {
            return 40000.0;
        } 
		else if (productName == "Television") 
		{
            return 60000.0;
        } 
		else if (productName == "Refrigerator")
			{
            return 45000.0;
        }
		else if (productName == "Washing Machine") 
		{
            return 35000.0;
        } 
		else if (productName == "Microwave Oven")
			{
            return 15000.0;
        } 
		else if (productName == "Air Conditioner")
			{
            return 50000.0;
        } 
		else if (productName == "Speakers")
			{
            return 8000.0;
        }
		else if (productName == "Gaming Console")
			{
            return 30000.0;
        }
		else if (productName == "Monitor") 
		{
            return 18000.0;
        } 
		else if (productName == "Keyboard") 
		{
            return 1500.0;
        } else if (productName == "Mouse")
			{
            return 1000.0;
        } 
		else if (productName == "Router") 
		{
            return 2500.0;
        }
		else if (productName == "Printer") 
		{
            return 12000.0;
        } 
		else if (productName == "Hard Drive")
			{
            return 7000.0;
        }
		else if (productName == "SSD") 
		{
            return 10000.0;
        } 
		else if (productName == "Graphics Card") 
		{
            return 50000.0;
        }
		else 
		{
            System.out.println("No price found");
            return 0;
        }
    }

    static String[] getBrandsByProduct(String productName) { 
        System.out.println("Running getBrandsByProduct: " + productName);

        if (productName == "Laptop") 
		{
            return new String[]{"Dell", "HP", "Lenovo", "Asus", "Acer"};
        }
		else if (productName == "Smartphone") 
		{
            return new String[]{"Samsung", "Apple", "OnePlus", "Xiaomi", "Oppo"};
        } 
		else if (productName == "Headphones") 
		{
            return new String[]{"Sony", "JBL", "Boat", "Bose", "Sennheiser"};
        }
		else if (productName == "Smartwatch") 
		{
            return new String[]{"Apple", "Samsung", "Garmin", "Fossil", "Fitbit"};
        } else if (productName == "Tablet") 
		{
            return new String[]{"Apple", "Samsung", "Lenovo", "Huawei", "Microsoft"};
        } 
		
		else {
            System.out.println("No brands found");
            return new String[0];
        }
    }

    static void searchProductAvailability(String productName) { 
        System.out.println("Running searchProductAvailability: " + productName);

        if (productName == "Laptop" || productName == "Smartphone" || productName == "Headphones")
			{
            System.out.println("Product is available in stock.");
        } 
		else if (productName == "Smartwatch" || productName == "Tablet" || productName == "Camera")
			{
            System.out.println("Product is available but in limited stock.");
        } 
		else 
		{
            System.out.println("Product is out of stock.");
        }
    }
}
