class Flight implements Command  
{ 
    private String name ;
    private IATCMediator atcMediator; 
  
    public Flight(String name , IATCMediator atcMediator)  
    {   
        this.name = name;
        this.atcMediator = atcMediator; 
    } 
  
    public void land()  
    { 
        if (atcMediator.isLandingOk())  
        { 
            System.out.println(name + " Successfully Landed."); 
            atcMediator.setLandingStatus(true); 
        } 
        else
            System.out.println(name + " Waiting for landing."); 
    } 
  
    public void getReady()  
    { 
        System.out.println(name + " is Ready for landing."); 
    } 
    public String getName(){return this.name;}
}