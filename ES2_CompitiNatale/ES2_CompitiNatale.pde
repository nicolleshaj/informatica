Cibo c;
Snake s;

void setup(){
  size(640, 640);
  background(31, 205, 153);
  c = new Cibo();
  s = new Snake();
}

void draw(){
  c.show();
  s.show();
}

public void Movimento(){
  if(keyCode == UP){s.Alto();}
  if(keyCode == DOWN){s.Basso();}
  if(keyCode == LEFT){s.Sinistra();}
  if(keyCode == RIGHT){s.Destra();}
}
