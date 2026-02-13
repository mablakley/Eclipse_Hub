class Bouncy{
  float xPos;
  float yPos;
  float xVelo;
  float yVelo;
  
  Bouncy(){
    xPos = 0;
    yPos = 90;
    xVelo = random(-4,4);
    yVelo = random(-2,2);
    
  }
  
  void display(){
    //3. update of variables
  xPos += xVelo;
  yPos += yVelo;
  //teleport from right to left
  if (xPos > width || xPos < 0) {
    xVelo = -xVelo;
  }
  //teleport from bottom to top
  if (yPos > height || yPos < 0) {
    yVelo = -yVelo;
  }
  
  push();
  //4. using our variables
  translate(xPos, yPos);
  //put your shape here
  fill(#686C5E);
  ellipse(0, 0, 120, 120);
  pop();
    
  }
  
  
}
