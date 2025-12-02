class Platform {
  float xPos;
  float yPos;
  float pWidth;
  float yVelo;

  Platform(float xPos, float yPos, float w) {
    this.xPos = xPos;
    this.yPos = yPos;
    this.pWidth = w;
    yVelo = 0;
  }

  void display() {
    push();
    translate(xPos, yPos);
    rectMode(CENTER);
    fill(#884422);
    stroke(255);
    rect(0, 0, pWidth, 80, 12);
    pop();
  }

  boolean onTop(float t, float b, float l, float r) {
    float top = yPos - 40;
    float bottom = yPos + 40;
    float left = xPos - pWidth/2;
    float right = xPos + pWidth/2;
    return r > left && l < right && b > top - 4 && b < top + 30;
  }

  boolean inPlatform(float t, float b, float l, float r) {
    float top = yPos - 40;
    float bottom = yPos + 40;
    float left = xPos - pWidth/2;
    float right = xPos + pWidth/2;

    return r >= left && l <= right && b >= top && t <= bottom;
  }

  float top() {
    return yPos - 40;
  }
  float bottom() {
    return yPos + 40;
  }
  float left() {
    return xPos - pWidth/2;
  }
  float right() {
    return xPos + pWidth/2;
  }
}
