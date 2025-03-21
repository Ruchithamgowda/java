class Mixer{

static int getDiscountByBrand(String brand)
{
System.out.println("running getdiscountByBrand: "+brand);

if (brand == "Longway")
{
int discount=10;
return discount;
}
else if(brand == "Philips")
{
int discount=30;
return discount;
}
else{
System.out.println("no discount");
return 0;
}
}
static void checkAvailability(String brand)
{
	System.out.println("running checkAvailability: "+brand);
	if (brand.equals("Longway"))
{
System.out.println("availability");
return;
}
else if(brand.equals("Philips"))
{
System.out.println("availability");
return;
}
System.out.println("after all, end");
}
}