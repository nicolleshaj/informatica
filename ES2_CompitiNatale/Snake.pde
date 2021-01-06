public class Snake{
    private int cordinataY = 320;
    private int cordinataX = 320;
    
    private float dim;
    private static final float DIM_DEFAULT = 10;
    private float cordX;
    private float cordY;
    private color colore;
    private color bordo;
    
    
  public Snake(){
    dim = DIM_DEFAULT;
    cordX = 320;
    cordY = 320;
    colore = color(0,0,0);
    bordo = color(0,0,0);
  }
  
  public void show(){
  strokeWeight(3);
  stroke(bordo);
  fill(colore);
  circle(cordX, cordY, dim);
}
  
  public void Sinistra() {this.cordinataX += 15;}
  public void Destra() {this.cordinataX -=15;}
  public void Alto() {this.cordinataY +=15;}
  public void Basso() {this.cordinataY -=15;}
  


  public void setDim(float dim){
    if (dim >= 0) this.dim = dim;
  }
  public float getDim() {return dim;}

  public void setCordX(float x){cordX = x;}
  public float getCordX(){return cordX;}

  public void setCordY(float y){cordY = y;}
  public float getCordY(){return cordY;}

  public void setColore(color colore){this.colore = color(colore);}
  public color getColore(){return colore;}

  public color getBordo(){return bordo;}
  public void setBordo(color colore){bordo = colore;}
  
  public int getCordinataX(){return this.cordinataX;}
  public int getCordinataY(){return this.cordinataY;}
}
