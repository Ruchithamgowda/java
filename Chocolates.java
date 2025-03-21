class Chocolates{
    public static void main(String[] args) {
        String chocolate1 = "Dairy Milk";
        String chocolate2 = "Five Star";
        String chocolate3 = "Kit Kat";
        String chocolate4 = "Galaxy";

        String[] chocolates = {chocolate1, chocolate2,"Milky Bar"};

        String ref = chocolates[1];
        System.out.println("Chocolate @ index 1: " + ref);

        chocolates[2] = "Eclairs";
    }
}