import java.util.ArrayList;


class ATCMediator implements IATCMediator  
{ 
    private ArrayList<Flight> flights = new ArrayList<Flight>(); 
    private ArrayList<Runway> runways = new ArrayList<Runway>(); 
    public boolean land; 
  
    public void registerRunway(Runway runway)  
    { 
        this.runways.add(runway); 
    } 
  
    public void registerFlight(Flight flight)  
    { 
        this.flights.add(flight); 
    } 
  
    public boolean isLandingOk()  
    { 
        return land; 
    } 
  
    @Override
    public void setLandingStatus(boolean status)  
    { 
        land = status; 
    } 
} 
