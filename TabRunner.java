class TabRunner {

    public static void main(String[] args) 
	{
        Tab tab1 = new Tab("Samsung", "Galaxy Tab S7", 6, 128, 11.0, "Android", 8000, 50000, "Snapdragon 865", true, 2, "Black", true, 500, "Metal", 1440, 13, "Dolby", true, "WiFi & LTE");
		
        tab1.display();
        
        Tab tab2 = new Tab("Apple", "iPad Pro", 8, 256, 12.9, "iOS", 9720, 80000, "Apple M1", true, 2, "Silver", true, 600, "Aluminum", 1668, 12, "Stereo", true, "WiFi & 5G");
		
        tab2.display();
        
        Tab tab3 = new Tab("Lenovo", "Tab P11", 4, 64, 11.5, "Android", 7500, 30000, "Snapdragon 730G", false, 1, "Gray", false, 520, "Plastic", 1200, 8, "Quad Speaker", false, "WiFi");
		
        tab3.display();
    }
}

