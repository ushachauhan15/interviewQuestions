package Test;

//Print all combination of given String
public class StringCombination {

public static void main(String[] args) {	
	String str1="abc";
	char strary[]=str1.toCharArray();
	//Approach 1
	printPermutn(str1,"");
	
	//Approach 2
	for(int i=0;i<strary.length;i++)
	{
		String starting=str1.substring(0,i+1);
		String remaining=str1.substring(i+1);
		getCombination(starting,remaining);
		
	}
	
}
public static void  getCombination(String starting,String remaining)
{
	System.out.println(remaining+starting);
}
static void printPermutn(String str, String ans)
{
    if (str.length() == 0) {
        System.out.print(ans + " ");
        return;
    }

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);
        String ros = str.substring(0, i) + 
                     str.substring(i + 1);
        printPermutn(ros, ans + ch);
    }
}
}
