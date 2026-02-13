class Static{
  float xPos;
  float yPos;
  float xVelo;
  float yVelo;
  int c;
  
  Static(int c){
    xPos = 400;
    yPos = 300;
    xVelo = 0;
    yVelo = 0;
    this.c = c;
    
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
  fill(c);
  rectMode(CENTER);
  rect(-10, 10, 20, 20);
  rect(10, 10, 20, 20);
  rect(10, -10, 20, 20);
  rect(-10, -10, 20, 20);
  pop();
    
  }
  
  
}
