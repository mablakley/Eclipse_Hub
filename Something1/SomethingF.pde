class SomethingF{
  float xPos;
  float yPos;
  float xVelo;
  float yVelo;
  
  SomethingF(){
    xPos = 0;
    yPos = 50;
    xVelo = 7;
    yVelo = 7;
    
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
  if (yPos > height) {
    yPos = 0;
  }
  if(yPos < 0){
    yPos = height;
  }
  
  push();
  //4. using our variables
  translate(xPos, yPos);
  //put your shape here
  fill(#881111);
  ellipse(0, 0, 40, 40);
  pop();
    
  }
  
  
}
