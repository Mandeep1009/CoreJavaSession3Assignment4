class StudentDetails
{
	public void Name()
	{
		System.out.print("Enter Your Name : ");
		String Name = System.console().readLine();
	}
	public void Class()
	{
		System.out.print("Enter Your Class : ");
		String Class = System.console().readLine();
	}
	public int Marks()
	{
		System.out.print("Enter Your Marks : ");
		int Marks = Integer.parseInt(System.console().readLine());
		return Marks;
	}
}
class StudentResult
{
	public static void main(String args[])
	{
		StudentDetails sd = new StudentDetails();
		for(int i=1;i<4;i++)
		{
			sd.Name();
			sd.Class();
			if (sd.Marks() > 40)
			{
				System.out.println ("Your Result is Pass.");
			}
			else
			{
				System.out.println ("Your Result is Fail.");
			}
		}
	}
}