class Pattern2
{
public static void main(String args[])
{
int a=5,b,c;
for(b=1;b<=a;b++)
{
for(c=1;c<=a;c++)
{
if((c==1||c==a) || (b==1||b==a))
System.out.print("*");
else
System.out.print("#");

}
System.out.print("\n");

}
}


}