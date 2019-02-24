PImage donkey;
PImage tail;

int tailX;
int tailY;

boolean blackBackround = true;

void setup() {
  size(550, 405);
  
  donkey = loadImage("PinTheTail.png");
  tail = loadImage("tail.png");
  
  donkey.resize(550,405);
}

void draw() {
  background(donkey);
  tail.resize(360,360);

  rect(0, 0, 30, 30);
  rect(452, 76, 40, 40);
   
   if(blackBackround == true&&dist(0, 0, mouseX, mouseY) > 30) {
     fill(0, 0, 0);
     rect(0, 0, 550, 405);
    }
  if(mousePressed) {
    
    image(tail, mouseX-99, mouseY-75);
    
    if(dist(454, 75, mouseX, mouseY) <40){
      print("You Win!");
        
    }
   
     else{
       print("You Lose :(");
    }
    boolean blackBackround = false;
    delay(2000);
    exit();
  }
}