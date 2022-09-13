package ImmortalFighter;

public class Fighter {
 
    private Punches punch;
    private Kicks kick;


    public Fighter(Punches punch, Kicks kick) {
        this.punch = punch;
        this.kick = kick;
    }

    public void setPunch(Punches punch) {
        this.punch = punch;
    }

    public void setKick(Kicks kick) {
        this.kick = kick;
    }

    public void performanceKicks(){
        kick.Kick();
    }
    
    public void performancePunches(){
    punch.Punch();
    }
    
    public void performanceRoll(){
        
    }
    
     public void performanceJumb(){
        
    }
       
    
}
