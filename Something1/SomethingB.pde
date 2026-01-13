class SomethingB{
  float xPos;
  float yPos;
  float xVelo;
  float yVelo;
  
  SomethingB(){
    xPos = 400;
    yPos = 40;
    xVelo = 0;
    yVelo = 14;
    
  }
  
  void display(){
    //3. update of variables
  xPos += xVelo;
  yPos += yVelo;
  //teleport from right to left
  if (xPos > width) {
    xPos = 0;
  }
  //teleport from bottom to top
  if (yPos > height) {
    yPos = 0;
  }
  push();
  //4. using our variables
  translate(xPos, yPos);
  //put your shape here
  fill(#F3A505);
  ellipse(0, 0, 60, 60);
  pop();
    
  }
  
  
}
