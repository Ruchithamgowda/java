class PalletRunner {
    public static void main(String[] args) {
        Pallet pallet = new Pallet("Wood", 500, "120x100 cm", true, "Euro Pallet", "XYZ Corp", 25.5, true, "Brown", "Shipping");
        pallet.info();
    }
}
