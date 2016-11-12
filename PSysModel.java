package PaSkCode;


import java.awt.List;
import java.util.ArrayList;


public class PSysModel {

	static ArrayList <Object> pList;
   
	private int radius;

    private int px;
    private int py;

    private int velX;
    private int velY;

	// ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius

    PSysModel() {
	// instantiate list of particles
    	
    	pList = new ArrayList <Object>();
    }


    public int getRadius(){ 	
    	return radius;
    }
    public int getpx(){
    	return px;
    }
    public int getpy(){
    	return py;
    }
    public int getvx(){
    	return velX;
    }
    public int getvy(){
    	return velY;
    }
    
    
    
    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy){
        
		radius = rad;
		px = x;
		py = y;
		velX = vx;
		velY = vy;
		pList.add(new Object(rad,x,y,vx,vy));
	    System.out.println("Added: " + rad + " " + px + " " + py);
        
    }


    // update state of each particle in list
    void update(int bw, int bh) {
        for (int i =0; i < pList.size();i++){
    	
        	
        px = pList.get(i).getvx()+pList.get(i).getpx();
        py = pList.get(i).getvy()+pList.get(i).getpy();
        	pList.get(i).setpx(px);
        	pList.get(i).setpy(py);
        
        	velX =pList.get(i).getvx();
        	velY =pList.get(i).getvy();
        	radius =pList.get(i).getRadius();
        if (px >= bw-radius && velX > 0) {
            velX = -velX;
            pList.get(i).setvelx(velX);
        }
        else if (px < radius && velX < 0) {
            velX = -velX;
            pList.get(i).setvelx(velX);
        }
        
        if (py >= bh-radius && velY > 0) {
            velY = -velY;
            pList.get(i).setvely(velY);
        }
        else if (py < radius && velY < 0) {
            velY = -velY;
            pList.get(i).setvely(velY);
        }
    
        }
    
   
    }   
}
