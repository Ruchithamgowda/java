class CabSearch {
    static int getCostBySourceAndDestination(String source, String destination) { 
        System.out.println("Running getCostBySourceAndDestination: " + source + " to " + destination);

        if (source.equals("Bangalore")) 
		{
            if (destination.equals("Mysore"))
				{
                return 1200;
            }
            if (destination.equals("Chennai")) 
			{
                return 2500;
            }
            if (destination.equals("Hyderabad")) 
			{
                return 3000;
            }
        }
        if (source.equals("Mysore")) 
		{
            if (destination.equals("Ooty")) 
			{
                return 1800;
            }
        }
        if (source.equals("Hyderabad")) {
            if (destination.equals("Vijayawada")) {
                return 2000;
            }
        }
        if (source.equals("Delhi")) 
		{
            if (destination.equals("Agra")) 
			{
                return 2200;
            }
        }
        if (source.equals("Mumbai"))
			{
            if (destination.equals("Pune"))
				{
                return 1500;
            }
            if (destination.equals("Goa")) 
			{
                return 3500;
            }
        }
        if (source.equals("Pune")) 
		{
            if (destination.equals("Nagpur")) 
			{
                return 4000;
            }
        }
        if (source.equals("Kolkata") && destination.equals("Durgapur"))
			{
            if (destination.equals("Durgapur"))
				{
                return 1800;
            }
        }
        if (source.equals("Jaipur"))
			{
            if (destination.equals("Udaipur")) 
			{
                return 2700;
            }
        }
        System.out.println("No cost data available");
        return 0;
    }

    static int getDistanceBySourceAndDestination(String source, String destination) { 
        System.out.println("Running getDistanceBySourceAndDestination: " + source + " to " + destination);

        if (source.equals("Bangalore"))
			{
            if (destination.equals("Mysore"))
				{
                return 150;
            }
            if (destination.equals("Chennai")) 
			{
                return 350;
            }
            if (destination.equals("Hyderabad")) 
			{
                return 570;
            }
        }
        if (source.equals("Mysore")) 
		{
            if (destination.equals("Ooty"))
				{
                return 120;
            }
        }
        if (source.equals("Hyderabad")) 
		{
            if (destination.equals("Vijayawada")) 
			{
                return 280;
            }
        }
        if (source.equals("Delhi")) 
		{
            if (destination.equals("Agra"))
				{
                return 210;
            }
        }
        if (source.equals("Mumbai")) 
		{
            if (destination.equals("Pune"))
				{
                return 160;
            }
            if (destination.equals("Goa")) 
			{
                return 600;
            }
        }
        if (source.equals("Pune"))
			{
            if (destination.equals("Nagpur")) 
			{
                return 720;
            }
        }
        if (source.equals("Kolkata")) 
		{
            if (destination.equals("Durgapur")) 
			{
                return 170;
            }
        }
        if (source.equals("Jaipur")) 
		{
            if (destination.equals("Udaipur"))
				{
                return 400;
            }
        }
        System.out.println("No distance data available");
        return 0;
    }

    static void searchAvailability(String destination) { 
        System.out.println("Running searchAvailability for: " + destination);

        if (destination.equals("Mysore")) 
		{
            System.out.println("Cabs are available.");
        } 
		else {
            if (destination.equals("Chennai"))
				{
                System.out.println("Cabs are available.");
            } 
			else {
                if (destination.equals("Hyderabad")) 
				{
                    System.out.println("Cabs are available.");
                } 
				else {
                    if (destination.equals("Ooty")) 
					{
                        System.out.println("Cabs available but limited.");
                    } 
					else {
                        if (destination.equals("Vijayawada")) 
						{
                            System.out.println("Cabs available but limited.");
                        }
						else {
                            if (destination.equals("Agra"))
								{
                                System.out.println("Cabs available but limited.");
                            } 
							else {
                                System.out.println("Cabs not available.");
                            }
                        }
                    }
                }
            }
        }
    }
}
