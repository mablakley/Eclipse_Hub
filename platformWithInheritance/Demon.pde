class Demon {
  float xPos;
  float yPos;
  float xVelo;
  float yVelo;
  float gravity;
  float top;
  float bottom;
  float left;
  float right;

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
    float xPrev = xPos;
    float yPrev = yPos;
    boolean onTop = false;
    xPos += xVelo;
    yPos += yVelo;

    top = yPos - 16;
    bottom = yPos + 16;
    left = xPos - 16;
    right = xPos + 16;

    for (Platform p : platforms) {
      if (p.inPlatform(top, bottom, left, right)) {
        if (p.onTop(top, bottom, left, right)) {
          yPos = p.top() - 16;
          top = yPos - 16;
          bottom = yPos + 16;
          left = xPos - 16;
          right = xPos + 16;
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

  void display() {
    push();
    translate(xPos, yPos);
    rectMode(CENTER);
    strokeWeight(2);
    stroke(255);
    fill(#ff0022);
    ellipse(0, 0, 30, 30);
    pop();
  }

  boolean inDemon(float t, float b, float l, float r) {
    float top = yPos - 20;
    float bottom = yPos + 20;
    float left = xPos - 20;
    float right = xPos + 20;

    return r >= left && l <= right && b >= top && t <= bottom;
  }
}
