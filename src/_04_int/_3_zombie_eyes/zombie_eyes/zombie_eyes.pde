
void setup() {
  PImage face = loadImage("face.png");
  size(500, 500);
  face.resize(500, 500);
  image(face, 0, 0);
  
}
void draw() {
  fill(mouseX+147,mouseX+22, mouseY+22);
  ellipse(140, 160, 100, 80);
  ellipse(345, 160, 100, 80);
  fill(0, 0, 0);
  ellipse(140, 160, 20, 20);
  ellipse(345, 160, 20, 20);
  
  
}
