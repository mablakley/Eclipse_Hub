//1. declaration of variables
float xPos;
float yPos;
float xVelo; 
float yVelo;

void setup() {
  size(800, 600);
  //2. initialization of variables
  xPos = 0;
  yPos = 40;
  xVelo = 69;
  yVelo = 2;
}

void draw() {
  background(#118811);
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
  fill(#881111);
  ellipse(0, 0, 60, 60);
  pop();
}
