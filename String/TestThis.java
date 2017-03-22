class A
{
	public void show()
	{
		System.out.println(this);		
	}
}
public class TestThis
{
	public static void main(String[] args)
	{
		A aa = new A();
		aa.show();
	}
}