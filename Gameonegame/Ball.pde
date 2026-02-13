class Ball {
  float x;
  float y;
  float yVelo;
  float xVelo;
  float px;
  float py;

  Ball() {
    x = 700;
    y = height/2;
    xVelo = 14;
    yVelo = 0;
  }


  void display() {

    if (y > height - 15 || y < 15) {
      yVelo = -yVelo;
    }

    if (x > width - 15 || x < 15) {
      xVelo = -xVelo;
    }

    y = y + yVelo;
    x = x + xVelo;

    push();

    translate(x, y);
    fill(#ffffff);
    ellipse(0, 0, 30, 30);
    pop();
  }
  
  float getX(){
   return x; 
  }
  float getY(){
    return y;
  }

  void handleC() {
    boolean touch = false;

    //here
    for (Player p : players) {
      //println(touch);

      float rleft = p.getX() - p.getW()/2;
      float rright = p.getX() + p.getW()/2;
      float rtop = p.getY() - p.getH()/2;
      float rbot = p.getY() + p.getH()/2;


      float closestX = constrain(x, rleft, rright);
      float closestY = constrain(y, rtop, rbot);
      
      


      if (dist(x, y, closestX, closestY) < 25) {
        touch = true;
        xVelo = -xVelo;
        //println(xVelo);
        if (xVelo <= 15) {
          if (xVelo > 0) {
            xVelo+= .5;
          }
          if (xVelo < 0) {
            xVelo-= .5;
          }
        } else {
          xVelo = 15;
        }
      }  
    }
    
    
  }
  
  
  
  
  
}
