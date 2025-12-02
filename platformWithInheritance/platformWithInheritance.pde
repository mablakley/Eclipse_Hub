boolean gameOver;
Player thePlayer;
Platform platforms[];
Demon demons[];
Star theStar;
Switch theSwitch;

void setup() {
  size(1600, 900);
  theStar = new Star(width * 0.8, height * 0.2);
  theSwitch = new Switch(width * 0.85, height * 0.8);
  thePlayer = new Player(width * .8, height * .5);
  platforms = new Platform[4];
  platforms[0] = new Platform(width * 0.6, height, width * 0.6);
  platforms[1] = new Platform(width * 0.2, height * .8, width * 0.2);
  platforms[2] = new Platform(width * 0.5, height * .6, width * 0.2);
  platforms[3] = new Platform(width * 0.75, height * .4, width * 0.2);
  demons = new Demon[20];
  for (int i = 0; i < 20; i++) {
    demons[i] = new Demon();
  }
}

void draw() { 
  background(#111111);
  theStar.display();
  theSwitch.display();
  thePlayer.update();
  thePlayer.display();

  for (Platform p : platforms) {
    p.display();
  }
  for (Demon d : demons) {
    d.update();
    for (Demon e : demons) {
      if (d != e && dist(d.xPos, d.yPos, e.xPos, e.yPos) < 30) {
        if (d.yVelo > 8) {
          if (d.xPos > e.xPos) {
            e.xVelo = -6;
          } else {
            e.xVelo = 6;
          }
        } else {
          e.xVelo = d.xVelo;
        }
      }
    }
    d.display();
  }
}

void keyPressed() {
  thePlayer.keyPressed();
}

void keyReleased() {
  thePlayer.keyReleased();
}
