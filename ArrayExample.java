class ArrayExample {
    public static void main(String[] args) {
        String[] items1 = {"Shirt", "Clip", "Paint"};
        String[] items2 = {"Wire", "Wall", "Paper", "Poster"};
        String[] wallets = {"Leather Wallet", "Fabric Wallet", "Card Holder", "Travel Wallet", "Digital Wallet"};
        String[] coins = {"Penny", "Nickel", "Dime", "Quarter", "Half Dollar"};
        String[] notes = {"One Dollar", "Five Dollars", "Ten Dollars", "Fifty Dollars", "Hundred Dollars"};
        String[] watches = {"Analog", "Digital", "Smartwatch", "Hybrid", "Luxury"};
        String[] cameras = {"DSLR", "Mirrorless", "Point and Shoot", "Action Camera", "Instant Camera"};
        String[] games = {"Chess", "Football", "Cricket", "Basketball", "Tennis"};
        String[] bags = {"Backpack", "Tote", "Duffel", "Messenger", "Handbag"};
        String[] pots = {"Clay Pot", "Steel Pot", "Plastic Pot", "Ceramic Pot", "Glass Pot"};
        String[] routers = {"WiFi Router", "Mesh Router", "Wired Router", "4G Router", "5G Router"};

        // Print elements using for-each loops
        printArray("Items1", items1);
        printArray("Items2", items2);
        printArray("Wallets", wallets);
        printArray("Coins", coins);
        printArray("Notes", notes);
        printArray("Watches", watches);
        printArray("Cameras", cameras);
        printArray("Games", games);
        printArray("Bags", bags);
        printArray("Pots", pots);
        printArray("Routers", routers);
    }

    public static void printArray(String category, String[] array) {
        System.out.println("Category: " + category);
        for (String item : array) {
            System.out.println("Item: " + item);
        }
        System.out.println("----------------------------");
    }
}