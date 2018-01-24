class StringSeven 
{
	public static void main(String[] args) 
	{
		//String class equals() executed
		String s1 = "Vamshi";
		String s2 = "Akram";
		String s3 = "Vamshi";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println("TYSON".equals("tyson"));
		System.out.println("TYSON".equalsIgnoreCase("tyson"));

		//compareTo()
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		System.out.println("CHINNI".compareTo("chinni"));
		System.out.println("CHINNI".compareToIgnoreCase("chinni"));


	}
}
