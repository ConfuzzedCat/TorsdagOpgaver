int lightIndex = 1;
color redLight = color(255, 0,0);
color yellowLight = color(255,255,0);
color greenLight= color(0,255,0);
int radius;

void setup(){
  size(800,800);
  background(255);
  rectMode(CENTER);
  fill(175);
  rect(width/2, height/2, width*0.2, height*0.5);
  radius = (int)(width*0.12);
  noStroke();
}

void draw(){
  switch(lightIndex){
    case 1:
      fill(redLight);
      ellipse(width/2, height*0.35, radius, radius);
      fill(0);
      ellipse(width/2, height/2, radius, radius);
      fill(0);
      ellipse(width/2, height*(1-0.35), radius, radius);
      break;
     case 121:
      fill(0);
      ellipse(width/2, height*0.35, radius, radius);
      fill(yellowLight);
      ellipse(width/2, height/2, radius, radius);
      fill(0);
      ellipse(width/2, height*(1-0.35), radius, radius);
      break;
     case 241:
      fill(0);
      ellipse(width/2, height*0.35, radius, radius);
      fill(0);
      ellipse(width/2, height/2, radius, radius);
      fill(greenLight);
      ellipse(width/2, height*(1-0.35), radius, radius);
      break;
     case 361:
      lightIndex = 0;
      break;
  }
  lightIndex++;
}
