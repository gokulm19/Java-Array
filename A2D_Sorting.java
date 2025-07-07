class A2D_Sorting{
public static void main(String str[]){
int a[][]={{1211,222},{301,42}};
int store;
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
for(int x=0;x<2;x++){
for(int y=0;y<2;y++){
if(a[i][j]<a[x][y]){
store=a[x][y];
a[x][y]=a[i][j];
a[i][j]=store;
}
}
}
}
}
for(int k=0;k<2;k++){
for(int j=0;j<2;j++){
System.out.println(a[k][j]);
}
}
}
}