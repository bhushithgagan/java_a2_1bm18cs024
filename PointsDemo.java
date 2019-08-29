import java.util.*;
import java.lang.Math;
class Points {
double x1,x2,y1,y2,x3,y3;
double d;
Points(){
x1 = 0;
x2 = 0;
y1 = 0;
y2 = 0;
}
Points (double a,double b) {
x1 = a;
y1 = b;
}
Points (Points ob) {
x2 = ob.x1;
y2 = ob.y1;
}
double Dist(){
x3 = x2 - x1;
y3 = y2 - y1;
d = Math.sqrt(Math.pow(x3,2) - Math.pow(y3,2));
return d;
}
}

class PointsDemo{
public static void main(String args[])
{
double c;
Points ob1 = new Points(6,2);
Points ob2 = new Points(ob1);
c = ob2.Dist();
System.out.println("Distance between the points is :" + " " + c);
}
}

