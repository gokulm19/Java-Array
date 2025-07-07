class A2D_Biggest_Number{
public static void main(String str[]){
int a[][]={{10,20},{30,40}};
int big=0;
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
if(big<a[i][j]){
big=a[i][j];
}
}
}
System.out.println(big);
}
}