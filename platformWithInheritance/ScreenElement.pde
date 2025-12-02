class ScreenElement {
  float xPos;
  float yPos;
  float xPrev;
  float yPrev;
  float xVelo;
  float yVelo;
  float gravity;
  float top;
  float bottom;
  float left;
  float right;
  boolean hidden;

  ScreenElement() {
    xPos = 0;
    yPos = 0;
    xVelo = 0;
    yVelo = 0;
    gravity = 0;
    hidden = true;
  }

  void display() {
    if (hidden) {
      return;
    }
    push();
    translate(xPos, yPos);
    render();
    pop();
  }

  void render() {
  }

  void update() {
    xPrev = xPos;
    yPrev = yPos;
    xPos += xVelo;
    yPos += yVelo;
    yVelo += gravity;
  }

  float top() {
    return 0;
  }

  float bottom() {
    return 0;
  }

  float left() {
    return 0;
  }

  float right() {
    return 0;
  }

  boolean collide(float t, float b, float l, float r) {
    //return r >= left && l <= right && b >= top && t <= bottom;

    return
      r >= left() &&
      l <= right() &&
      b >= top &&
      t < bottom();
  }

  void handleCollisions() {
  }
}
