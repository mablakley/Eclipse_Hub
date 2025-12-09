class Player extends ScreenElement{
  float health;
  float xAcc;
  int lives;

  Player(float x, float y) {
    super();
    this.xPos = x;
    this.yPos = y;
    xVelo = 0;
    yVelo = 0;
    xAcc = 0;
    lives = 3;
    health = 1;
    gravity = 0.8; //added gravity
  }
  

  void update() {
    float xPrev = xPos;
    float yPrev = yPos;
    boolean onTop = false;
    xPos += xVelo;
    yPos += yVelo;

    top = yPos - 31;
    bottom = yPos + 31;
    left = xPos - 31;
    right = xPos + 31;

    for (Platform p : platforms) {
      if (p.inPlatform(top, bottom, left, right)) {
        if (p.onTop(top, bottom, left, right)) {
          //xPos = xPrev;
          yPos = p.top() - 31;
          top = yPos - 31;
          bottom = yPos + 31;
          left = xPos - 31;
          right = xPos + 31;
          onTop = true;
        } else if (yVelo >= 0) {
          xPos = xPrev;
          yPos = yPrev;
          xVelo = -xVelo;
        } else {
          xPos = xPrev;
          yPos = yPrev;
          yVelo = 0;
        }
      }
    }

    if (onTop) {
      yVelo = 0;
      xVelo *= 0.9;
      xVelo += xAcc;
    } else {
      yVelo += gravity; //velocity changes over time due to accelleration
      xAcc = 0;
    }

    for (Demon d : demons) {
      if (d.collide(top, bottom, left, right)) {
        if (yVelo > 4) {
          if (xPos > d.xPos) {
            d.xVelo -= 8;
          } else {
            d.xVelo += 8;
          }
        } else {
          health -= 0.2;
          if (xPos > d.xPos) {
            xVelo += 8;
          } else {
            xVelo -= 8;
          }          
        }
      }
    }
    if (yPos > height) {
      respawn();
      lives--;
    }
  }

  void render() {
   
    rectMode(CENTER);
    strokeWeight(2);
    stroke(255);
    fill(#123460);
    rect(0, 0, 60, 60, 4);
    fill(#ff0000);
    for (int i = 0; i < lives; i++){
      ellipse (i * 12 - 25,-45,10,10);
    }
    
  }

  void keyPressed() {
    if (key == 'd' && onPlatform()) {
      xAcc = 0.6;
    }
    if (key == 'a' && onPlatform()) {
      xAcc = -0.6;
    }
    if (key == 'w' && onPlatform()) {
      yVelo = -20;
      xAcc = 0;
    }
  }

  void keyReleased() {
    if (key == 'd' && onPlatform()) {
      xAcc = 0;
    }
    if (key == 'a' && onPlatform()) {
      xAcc = 0;
    }
  }

  boolean onPlatform() {
    for (Platform p : platforms) {
      if (p.onTop(top, bottom, left, right)) {
        return true;
      }
    }
    return false;
  }
}
