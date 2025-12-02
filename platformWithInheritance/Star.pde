class Star extends ScreenElement{

  Star(float x, float y) {
    super();
    xPos = x;
    yPos = y;
    hidden = true;
  }

  void render() {
    
    
    rectMode(CENTER);
    rotate(PI/4);
    strokeWeight(1);
    stroke(255);
    fill(#00ffff);
    rect(0, 0, 40, 40);
  }

  boolean inStar(float x, float y) {
    if (dist(xPos, yPos, x, y) < 40 && !hidden) {
      hidden = true;
      return true;
    } else {
      return false;
    }
  }
}
