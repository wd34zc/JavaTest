/*
super 
	限定对象调用它从父类继承的到的变量和方法
	super可以调用属性和方法。
	用途：
		当调用父类的属性或方法被子类的同名属性或方法覆盖时，可以用super显性的调用父类对应的方法或属性。
	注意：
		1.子类的构造器若不调用super函数，第一行默认调用父类的的无参构造器。
		2.若父类没有无参构造器，那么小心子类的构造器中默认调用父类无参构造器引发编译错误。
		3.当被调用方法为static时，不能调用super函数，因为该方法不属于对象。

*/
//父类
class Human
{
	private String name; //保护内部属性
	private int age;
	public Human() //父类的无参构造器
	{
		name = "父类";
		age = 22;
	}
	public Human(String name,int age) //父类的有参构造器
	{
		this.name = name;
		this.age = age;
	}
	public String list()
	{
		String str = name + " " + age;
		return str;
	}
	public void show()
	{
		System.out.println(list());
	}
}
//子类
class Student extends Human
{
	private char grade = 'A';
	public Student()
	{
		//若不显示调用，编译器默认在第一行调用super();
	}
	public Student(String name,int age,char grade)
	{
		super(name,age); //显示调用父类有参构造器
		this.grade = grade;
	}
	public String list()
	{
		String str = super.list() + " "+ grade; //调用父类方法
		return str;
	}
	//public void show() 和父类一样，可以不用再重写
}

class TestSuper
{
	public static void main(String[] args)
	{
		Human aa = new Human();
		aa.show();
		
		Student bb = new Student("子类",18,'A');
		bb.show();
	}
}