PImage creeper;

int x_;

int y_;

public void setup(){
  size(1200, 800);   
 
 PImage background = loadImage("background.jpg");        
 
 background = (background);

  creeper=loadImage("creeper.png");
  creeper.resize(5,5);
}

void draw(){

  image(creeper, 350, 289);
  
  fill(210, 10, 10);
  ellipse (x_, y_, 3,3);
  
  if (mousePressed) {
    x_ = mouseX;
    y_ = mouseY;
  }
  
  if(isNear(x_, mouseX)&&isNear(y_, mouseY)){
    
  }
 
}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}