//1. declaration of variables

Something a;
SomethingB b;
Bouncy bouncies[];
Static statics[];
SomethingE e[];
SomethingF f[];


void setup() {
  size(800, 600);
  //2. initialization of variables
  a = new Something(#ffffff);
  b = new SomethingB();
  bouncies = new Bouncy[6];
  for (int i=0; i < 6; i++) {
    bouncies[i] = new Bouncy();
  }

  statics = new Static[6];
  for (int i=0; i < 6; i++) {
    statics[i] = new Static(#ffffff);
  }
  e = new SomethingE[6];
  for (int i=0; i < 6; i++) {
    e[i] = new SomethingE();
  }

  f = new SomethingF[6];
  for (int i=0; i < 6; i++) {
    f[i] = new SomethingF();
  }
}

void draw() {
  background(#118811);
  a.display();
  b.display();
  for (Bouncy b : bouncies) {
    b.display();
  }
  for (Static b : statics) {
    b.display();
  }
  for (SomethingE e : e) {
    e.display();
  }
  for (SomethingF f : f) {
    f.display();
  }
}
