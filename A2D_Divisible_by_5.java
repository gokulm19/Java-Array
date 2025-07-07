class A2D_Divisible_by_5{
public static void main(String str[]){
int a[][]={{5,2},{3,4}};
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
if(a[i][j]%5==0){
System.out.println(a[i][j]);
}
}
}
}
}