#include<stdio.h>
int main()
{
  int n,a,sum;
  scanf("%d",&n);
  while(n!=0)
  {
  a=n%10;
  sum=a+n-1;
  n=n/100;
  }
  printf("%d",sum);
  return 0;
}