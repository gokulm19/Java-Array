class A2D_Store_To_Another_2D{
public static void main(String str[]){
int a[][]={{1,2},{3,4}};
int b[][]={{10,20},{30,40}};
int c[][]=new int[2][2];
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
c[i][j]=a[i][j]+b[i][j];
System.out.println(c[i][j]);
}
}
}
}