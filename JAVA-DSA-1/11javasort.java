import java.util.*;
public class Solution
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n;
int t;
int i;
int j;
float fa;
String ts;
n=s.nextInt();
int arr[]=new int[n];
String st[]=new String[n];
float f[]=new float[n];
for( i=0;i<n;i++)
{
arr[i]=s.nextInt();
st[i]=s.next();
f[i]=s.nextFloat();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
if(f[j]==f[j+1])
{
if(st[j].compareTo(st[j+1])>0)
{
ts=st[j];
st[j]=st[j+1];
st[j+1]=ts;
}
}
if(f[j]<f[j+1])
{
fa=f[j];
f[j]=f[j+1];
f[j+1]=fa;
ts=st[j];
st[j]=st[j+1];
st[j+1]=ts;
}
}
}
for(i=0;i<n;i++)
System.out.println(st[i]);
}
}
