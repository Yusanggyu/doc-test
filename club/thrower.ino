#include<Servo.h>
Servo servo;
Servo servo2;

void setup(){
  servo.attach(2);
  servo2.attach(3);
  Serial.begin(9600);
}


void loop(){
    int ga = analogRead(A1);
    int ga2 = analogRead(A4);
    int sub = map(ga,0,1023,150,30);
    int sub2 = map(ga2,0,1023,0,180);
    Serial.println(sub);
    servo.write(sub);
    servo2.write(sub2);
    delay(100);
}