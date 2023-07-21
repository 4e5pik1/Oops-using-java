class area
{
int length;
int breath;
int height;
int area;
area(int length,int breath,int height,int area)
{
l=length;
b=breath;
h=height;
a=area;
}
void display()
{
System.out.println("area of=l*b");
}
class shapes
{
public static void main(String args[])
{
area rect=new area();
rect.display();
}
}
}
