class Player {
  float x;
  float y;
  float w;
  float h;
  float yVelo;
  float health;
  int c;
  float p;

  Player(int p) {
    y = height/2;
    yVelo = 0;
    //this.c=c;
    this.p = p;
    w = 20;
    h = 90;
    health = 150;

    if (p == 0) {
      x = 30;
      c = #ff0000;
    }
    if (p == 1) {
      x = width - 30;
      c = #0000ff;
    }
  }

  void display() {

    y = y + yVelo;

    push();

    translate(x, y);
    fill(c);
    rectMode(CENTER);

    rect(0, 0, w, h);
    pop();
    if (p == 0) {
      fill(#ffffff);
      rect(30, 10, 150, 30);

      fill(#ff0000);
      rect(30, 10, health, 30);
    }
    if (p == 1) {
      fill(#ffffff);
      rect(width - 180, 10, 150, 30);

      fill(#0000ff);
      rect(width - 180, 10, health, 30);
    }
  }

  void loseH() {
    for (Ball b : balls) {
      if (health >= 0) {
        if (p == 0) {
          if (b.getX() < 15) {
            health -= 30;
            println("hit");
          }
        }
      } else if (health <= 0) {
        health = 0;
      }
      if (health >= 0) {
        if (p == 1) {
          if (b.getX() > width - 15) {
            health -= 30;
            println("hit");
          }
        }
      } else if (health <= 0) {
        health = 0;
      }
    }
  }
  
  
  
  float health() {
    return health;
  }







  float getX() {
    return x;
  }
  float getY() {
    return y;
  }
  float getW() {
    return w;
  }
  float getH() {
    return h;
  }





  void keyPressed() {
    if (p == 0) {
      if (key == 'w') {
        yVelo = -5;
      }
      if (key == 's') {
        yVelo = 5;
      }
    }

    if (p == 1) {
      if (key == 'j') {
        yVelo = -5;
      }

      if (key == 'k') {
        yVelo = 5;
      }
    }
  }

  void keyReleased() {
    if (p == 0) {
      if (key == 'w') {
        yVelo = 0;
      }
      if (key == 's') {
        yVelo = 0;
      }
    }
    if (p == 1) {
      if (key == 'j') {
        yVelo = 0;
      }

      if (key == 'k') {
        yVelo = 0;
      }
    }
  }
}
