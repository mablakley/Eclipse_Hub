class Something {
  //variables
  float xPos;
  float yPos;
  float xVelo;
  float yVelo;
  int c;

  Something(int c) {
    //initializations from setup()
    xPos = 0;
    yPos = 300;
    xVelo = 14;
    yVelo = 0;
    this.c=c;
  }

  void display() {
    //draw()
    
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
  fill(#382C1E);
  rectMode(CENTER);
  rect(0, 0, 90, 90, 25);
  pop();
  }
}
