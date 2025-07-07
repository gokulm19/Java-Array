class A1D_Store_To_Another_1D{
public static void main(String str[]){
int a[]={1,2,3,4,5};
int b[]={10,20,30,40,50};
int c[]=new int[5];
for(int i=0;i<5;i++){
c[i]=a[i]+b[i];
System.out.println(c[i]);
}
}
}