
package PaSkCode;

public class Object {

private int radius;
private int px;
private int py;
private int velx;
private int vely;

public Object(){
	this.radius=0;
	this.px =0;
	this.py =0;
	this.velx =0;
	this.vely=0;
}
	
public Object(int radius,int px, int py, int velx, int vely){
		
	this.radius=radius;
	this.px =px;
	this.py =py;
	this.velx =velx;
	this.vely=vely;
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
	return velx;
}
public int getvy(){
	return vely;
}

public int setvely(int vely){
	return this.vely = vely;
}
	
public int setvelx(int velx){
	return this.velx=velx;
}
	
public int setpx(int px){
	return this.px = px;
}

public int setpy(int py){
	return this.py=py;
}
	
}
