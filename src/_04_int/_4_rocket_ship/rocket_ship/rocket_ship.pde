int x = 400; 
int y = 600; 

void setup() {

    background(0, 0, 40); size(800, 800);

}

void draw() {

    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    fill(137, 137, 137);
    ellipse(100, 100, 150, 150);
    fill(85, 82, 82);
    ellipse(90, 110, 50, 50);
    ellipse(150, 60, 25, 25);
    fill(250, 250, 250);
    ellipse(250, 30, 20, 20);
    ellipse(300, 400, 20, 20);
    ellipse(200, 100, 30, 30);
    ellipse(30, 240, 25, 25);
    ellipse(700, 350, 20, 20);
    ellipse(650, 650, 10, 10);
    ellipse(500, 100, 25, 25);
    

}

void keyPressed() {
  y-=10;
}
