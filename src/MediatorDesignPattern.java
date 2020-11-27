public class MediatorDesignPattern  
{ 
    public static void main(String args[])  
    { 
  
        IATCMediator atcMediator = new ATCMediator(); 
        Flight sparrow101 = new Flight("sparrow101",atcMediator); 
        Flight sparrow102 = new Flight("sparrow102",atcMediator); 
        Runway mainRunway = new Runway(atcMediator); 
        atcMediator.registerFlight(sparrow101); 
        atcMediator.registerRunway(mainRunway); 
        sparrow101.getReady(); 
        mainRunway.land(); 
        sparrow101.land(); 
        sparrow102.getReady(); 
        sparrow102.land(); 
          
    } 
}