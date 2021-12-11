public static void main(String args[])
{
 int n = 2;
 int m = 4;
 answer(n,m);
}
public static void answer(int n, int m)
{
  int print = 1;
for(int i = 1; i <= m;i++)
{
print = print *i;
}
System.out.println(print);
}
