
package PaSkCode;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class PSysView {
    int counter =1;
    PSysView() {
        
    }

    // draw all particles in psm
    void draw(PSysModel psm, Graphics g) {
    	for (int i =0; i<psm.pList.size();i++){ 
    	Graphics2D g2d = (Graphics2D) g;
    		g2d.setColor(Color.RED);
    		g2d.fillOval(psm.pList.get(i).getpx()-psm.pList.get(i).getRadius(), psm.pList.get(i).getpy()-psm.pList.get(i).getRadius(), psm.pList.get(i).getRadius()*2, psm.pList.get(i).getRadius()*2);
    }
    }
    // dump information on all particles in psm
    
    
    void dump(PSysModel psm, int lc) {
        
        for (int i = 0; i<psm.pList.size(); i++){
        System.out.println("Frame " + lc * counter);
        System.out.println(psm.pList.get(i).getRadius() + " " + psm.pList.get(i).getpx() + " " + psm.pList.get(i).getpy() + " " + psm.pList.get(i).getvx() + " " + psm.pList.get(i).getvy());
    
        }
    }
}
