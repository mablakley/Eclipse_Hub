//1. declaration of variables

Something a;
SomethingB b;
SomethingC c;
SomethingD d;
SomethingE e;
SomethingF f;


void setup() {
  size(800, 600);
  //2. initialization of variables
  a = new Something();
  b = new SomethingB();
  c = new SomethingC();
  d = new SomethingD();
  e = new SomethingE();
  f = new SomethingF();

}

void draw() {
  background(#118811);
  a.display();
  b.display();
  c.display();
  d.display();
  e.display();
  f.display();
}
