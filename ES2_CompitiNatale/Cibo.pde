public class Cibo{
    private float dim;
    private static final float DIM_DEFAULT = 10;
    private float cordX;
    private float cordY;
    private color colore;
    private color bordo;
    
public Cibo(){
  dim = DIM_DEFAULT;
  cordX = (int)random(0, width);
  cordY = (int)random(0, height);
  colore = color(255,0,0);
  bordo = color(255,0,0);
}
public void show(){
  strokeWeight(3);
  stroke(bordo);
  fill(colore);
  circle(cordX, cordY, dim);
}

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
}
