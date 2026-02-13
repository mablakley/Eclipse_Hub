State s;
Player players[];
Ball balls[];
int ballCount;


void setup() {
  size(1000, 800);
  s = new State(1);
  ballCount = 1;
  players = new Player[2];
  balls = new Ball[ballCount];
  for (int i = 0; i < 2; i++) {
    players[i] = new Player(i);
  }

  for (int i = 0; i < ballCount; i++) {
    balls[i] = new Ball();
  }
}

void draw() {
  background(#000000);

  for (Player p : players) {
    p.display();
    p.getX();
    p.loseH();

  }
  
  for (Ball b : balls) {
      b.display();
      b.handleC();
    }
       
}





void keyPressed() {
  for (Player p : players) {
    p.keyPressed();
  }
}

void keyReleased() {
  for (Player p : players) {
    p.keyReleased();
  }
}
