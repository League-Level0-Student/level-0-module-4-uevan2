PImage face;

void setup() {
  face = loadImage("Reddit-alien.png");
    background(face);
  size(736, 1024);
  
}

void draw() {
  
  noStroke();
  
  background(face);
  
  fill(255, 255, 255);
  
  ellipse(257, 357.8, 103, 103);

  ellipse(479, 357.8, 103, 103);
  
  fill(#FF4800);
  
  ellipse(mouseX-111, mouseY, 102, 102);

  ellipse(mouseX+111, mouseY, 102, 102);
  
  
  
  if(mouseX > 640-111){
    mouseX = 640-111;
    
  }
  if(mouseX < 110+111){
    mouseX = 110+111;
    
  }
  if(mouseY < 240){
    mouseY = 240;
    
  }
  if(mouseY > 480){
    mouseY = 480;
    
  }
}