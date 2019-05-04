public class Hay
{
  
	public static boolean contains(String haystack, String needle)
	{

		if(haystack.length() < needle.length())
		{
			return false;
		}
		else
		{
			boolean inside=false;
			for(int x = 0; x < needle.length(); x++)
			{
				if(haystack.charAt(x) != needle.charAt(x))
				if((x + 1) == needle.length())
				{
					inside = false;
					break;
				}
				else
				{
					break;
				}

				else
				if((x + 1) == needle.length())
				{	
					inside = true;
				}
				else
				{
					continue;
				}
				}

			char[] item = new char[(haystack.length()-1)];
			for(int y = 1; y < item .length; y++)
			{
				item [y - 1] = haystack.charAt(y);
			}	

			String hay = new String(item);

			if(inside == false)
			{
				return contains(hay, needle);
			}
			else
			{
				return true;

			}
			}
			}

public static void main(String args[])
{
	System.out.println("Contains ogr is "+contains("Java programming", "ogr"));
	System.out.println("Contains grammy is "+contains("Java programming", "grammy"));
}
  
}