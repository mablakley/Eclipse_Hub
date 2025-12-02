class Switch {
  float xPos;
  float yPos;
  boolean switchOn;

  Switch(float x, float y) {
    xPos = x;
    yPos = y;
    switchOn = false;
  }

  void display() {
    push();
    translate(xPos, yPos);
    rectMode(CENTER);
    if (!switchOn) {
      rotate(PI/2);
    }
    strokeWeight(1);
    stroke(255);
    fill(#ff0000);
    rect(0, 0, 30, 4);
    pop();
  }

  boolean inSwitch(float x, float y) {
    if (dist(xPos, yPos, x, y) < 30 && !switchOn) {
      switchOn = true;
      return true;
    } else {
      return false;
    }
  }    
}
