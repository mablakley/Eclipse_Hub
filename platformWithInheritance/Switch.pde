class Switch extends ScreenElement{
  boolean switchOn;

  Switch(float x, float y) {
    super();
    xPos = x;
    yPos = y;
    switchOn = false;
  }

  void render() {

    rectMode(CENTER);
    if (!switchOn) {
      rotate(PI/2);
    }
    strokeWeight(1);
    stroke(255);
    fill(#ff0000);
    rect(0, 0, 30, 4);
 
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
