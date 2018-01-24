class StringEight 
{
	public static void main(String[] args) 
	{
		int[] a = new int[100];
		System.out.println(a.length);
		String b = new String("Ranjith");
		System.out.println(b.length());
		System.out.println(b.charAt(3));
		String c = "65Ram17";
		System.out.println(c.contains("65R"));
		System.out.println(c.startsWith("65R"));
		System.out.println(c.endsWith("17"));
		System.out.println("neellu".toUpperCase());
		System.out.println("Hello World!".toLowerCase());
		
		String d = "  Ramarao  ";
		System.out.println(d.length());
		System.out.println(d.trim().length());

		String e = "Nagarjuna";
		System.out.println(e.substring(3));
		System.out.println(e.substring(3,8));
		System.out.println(e.substring(3,8).length());

	}
}
