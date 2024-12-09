class demo
{
String a;
demo()
{
a="prathi";
System.out.println("constructor is called");
}
public static void main(String args[])
{
demo myobj=new demo();
System.out.println("value of a:"+myobj.a);
}
}