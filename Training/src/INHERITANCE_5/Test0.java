package INHERITANCE_5;


class A
{
	int a = 3;
	public void show()
	{
		System.out.println("Show from A.");
	}
}

class B extends A
{
	//a = a + 3;
	public void show()
	{
		System.out.println("Show from B.");
	}
}


public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
