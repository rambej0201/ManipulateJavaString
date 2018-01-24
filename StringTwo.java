class StringTwo 
{
	public static void main(String[] args) 
	{
		//We can not perform modifications to existed String object. This nature is called immutable nature
		String s1 = "Ramu";
		s1.concat("Bej");
		System.out.println(s1);

		//We can perform modifications to existed StringBuffer object. This nature is called mutable nature
		StringBuffer s2 = new StringBuffer ("Ram");
		s2.append("Bej");
		System.out.println(s2);
	}
}
