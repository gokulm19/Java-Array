class A1D_Biggest_Number{
public static void main(String str[]){
int a[]={1,2,3,4,5};
int big=0;
int c[]=new int[5];
for(int i=0;i<5;i++){
if(big<a[i]){
big=a[i];
}
}
System.out.println(big);
}
}