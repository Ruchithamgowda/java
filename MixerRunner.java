class MixerRunner{
	public static void main(String[] args) {  
	String brand1="LongWay";
	int discount1=Mixer.getDiscountByBrand(brand1);
	System.out.println("discount:"+discount1);
	
	String brand2="bajaj";
	int discount2=Mixer.getDiscountByBrand(brand2);
	System.out.println("discount:"+discount2);
	System.out.println("=========");
	 Mixer.checkAvailability("Philips");
        Mixer.checkAvailability("Bajaj");
    }
	
}