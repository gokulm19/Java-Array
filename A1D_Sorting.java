class A1D_Sorting{
public static void main(String str[]){
int a[]={121,222,31,42,5};
int store;
for(int i=0;i<5;i++){
for(int j=0;j<5;j++){
if(a[i]<a[j]){
store=a[j];
a[j]=a[i];
a[i]=store;
}
}
}
for(int k=0;k<5;k++){
System.out.println(a[k]);
}
}
}