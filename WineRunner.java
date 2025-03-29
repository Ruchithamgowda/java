class WineRunner {
    public static void main(String[] args) {
       
        Wine myWine = new Wine("Château Margaux", "Red", "France", 2015, 13.5, "Cabernet Sauvignon", true, 8, "750ml", 499.99);
        myWine.info();
    }
}