import java.util.ArrayList;


class GreenAlienTransporter{
    
    private int cells[];
    ArrayList<String> passengers[];
    private String name;
    
    
    public class GreenAlien {

        public String name;
        public int eyeCount;
        public String favouriteCandy;

        public GreenAlien() {
            name = "Kloup";
            eyeCount = 6;
            favouriteCandy = "Lollypops";
        }

        public GreenAlien(String tempName, int tempEye, String tempCandy) {
            name = tempName;
            eyeCount = tempEye;
            favouriteCandy = tempCandy;
        }

        public String toString() {
            return String.format("This Alien is called %s and has %d eyes. Gross. It seems to enjoy eating %s",
                    name, eyeCount, favouriteCandy);
        }
        
        


    }
    
    GreenAlienTransporter(String name){
        this.name = name;
        this.cells = new int[5];
        for(int i=1;i<=4;++i)
            this.cells[i] = 100;
    }
    
    public boolean replaceCell(int cellNum){
        
        if(cellNum < 1 || cellNum > 4)
            return false;
            
        this.cells[cellNum] = 100;
        
        return true;
        
    }
    
    public boolean travel(int lightYears){
        if(lightYears*10 > this.cells[1]+this.cells[2]+this.cells[3]+this.cells[4]) return false;
        
        for(int i=1;i<=4;++i){
            
            int canTravel = this.cells[i]/10;
            
            System.out.println(canTravel);
            
            if(canTravel >= lightYears){
                this.cells[i] -= lightYears*10;
                return true;
            }
            else{
                this.cells[i] = 0;
                lightYears -= canTravel;
            }
        }
        return true;
    }
    
    public int getCharge(int cellNum){
        
        if(cellNum <  1 || cellNum > 4) return -1;
        
        return this.cells[cellNum];
        
    }
    
    public boolean addPassenger(GreenAlien alien) {
    	
    	if (passengers.contains(alien.name) {
    		return true;
    		
    	}
    	
    	
    }
    
    
    



        public static void main (String[] args) throws java.lang.Exception
        {
                GreenAlienTransporter gat = new GreenAlienTransporter("Fun Club");
                
                System.out.println(gat.getCharge(1));
                System.out.println(gat.getCharge(2));
                System.out.println(gat.getCharge(3));
                System.out.println(gat.getCharge(4));
                
                System.out.println(gat.travel(24));
                
               
                
            
                
                
        }
}



		
		
		


