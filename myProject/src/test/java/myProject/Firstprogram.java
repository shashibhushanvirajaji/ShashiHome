package myProject;

class parent
{
	parent()
	{
	 String st = "shashi";
	 	System.out.println("constructor on parent");
	}
	int num =100;
	
}

class child extends parent
{
	child()
	{
		System.out.println("constructor on child");
	}
	int num = 110;
	void printnumber()
	{
		System.out.println(num);
		System.out.println(super.num);
	}
	
	
}

public class Firstprogram {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("first program");
	//superclass sc = new superclass();
	
		child ch = new child();
		ch.printnumber();
	
		}
}
