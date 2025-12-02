class Demon extends ScreenElement {
  Demon() {
    respawn();
    gravity = 0.5;
  }

  void respawn() {
    this.xPos = random(30, width - 30);
    this.yPos = random(-3000, -1000);
    xVelo = random(-2, 2);
    yVelo = 0;
  }

  void update() {
    boolean onTop = false;
    super.update();
    if(yVelo > 8){
      yVelo = 8;
    }

    for (Platform p : platforms) {
      if (p.inPlatform(top, bottom, left, right)) {
        if (p.onTop(top, bottom, left, right)) {
          yPos = p.top() - 16;
          
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

    if (yVelo < 8) {
      yVelo += gravity;
    }

    if (yPos > height) {
      respawn();
    }
  }

  void render() {
    translate(xPos, yPos);
    rectMode(CENTER);
    strokeWeight(2);
    stroke(255);
    fill(#ff0022);
    ellipse(0, 0, 30, 30);
  }
  
   float top() {
    return yPos - 15;
  }

  float bottom() {
    return yPos + 15;
  }

  float left() {
    return xPos - 15;
  }

  float right() {
    return xPos + 15;
  }

  
}
