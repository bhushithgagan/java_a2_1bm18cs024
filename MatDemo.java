import java.util.*;
class Mat {
double m[][] = new double[2][2];
double in[][] = new double[2][2];
double d;
double inv;

void input(){
 System.out.println("Enter the matrix elements\n");
 Scanner sc = new Scanner (System.in);
 for(int i = 0;i<2;i++){
  for (int j = 0;j<2;j++){
   m[i][j] = sc.nextDouble();
  }
 System.out.println(" ");
 }
}

void det(){
 d = (m[1][1]*m[0][0]-m[1][0]*m[0][1]);
 }

void adj(){
 in[0][0] = m[1][1];
 in[1][1] = m[0][0];
 in[0][1] = (-m[0][1]);
 in[1][0] = (-m[1][0]); 
 } 

void inverse () {
 for (int i = 0; i<2;i++){
  for (int j = 0; j<2;j++)
   in[i][j] = (1/d)*(in[i][j]);
  System.out.println(" ");
  }
}

void print() {
 System.out.println("Inverse of the matrix is :");
 for(int i = 0;i<2;i++){
  for (int j = 0;j<2;j++){
   System.out.println(in[i][j]);
    }
}
}

}

class MatDemo{
public static void main(String args[]){

Mat ob = new Mat();
ob.input();
ob.det();
ob.adj();
ob.inverse();
ob.print();
}
}





