import java.util.*;
public class Anagram1
{
    static void anagram(String s1,String s2)
    {
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length()==s2.length())
        {
            char[] AS1=s1.toCharArray();
            char[] AS2=s2.toCharArray();
            Arrays.sort(AS1);
            Arrays.sort(AS2);
            for(int i=0;i<AS1.length;i++)
            {
                if(AS1[i]!=AS2[i])
                {
                    System.out.print("False");
                    return;
                }
            }
            System.out.println("True");
        }
        else
           System.out.println("False");  
    }
	public static void main(String[] args) {
	    Scanner hs=new Scanner(System.in);
		String s1=hs.nextLine();
		String s2=hs.nextLine();
		anagram(s1,s2);
	}
}