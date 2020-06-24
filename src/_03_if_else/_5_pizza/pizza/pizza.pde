
void setup() {
    size(500, 500);
    fill(214, 157, 52);
    ellipse(250, 250, 300, 300);
    fill(198, 41, 36);
    ellipse(250, 250, 260, 260);
    fill(250, 208, 91);
    ellipse(250, 250, 250, 250);
}
void draw() {
    
    PImage pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(240, 240);
    image(pepperoni, 130, 130);
}
