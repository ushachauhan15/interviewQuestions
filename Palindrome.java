package Test2;
//Check if given number is palindrome or not
public class Palindrome {
	public static void main(String[] args) {
		System.out.println(checkPalindrome(121));
	}
	public static boolean checkPalindrome(int num)
	{
		int rem=num;
		int sum=0;int n=0;
		while(num > 0)
		{
			n=num%10;
			sum=sum*10+n;
			num=num/10;
		}
		if(sum==rem)
		return true;
		else
		return false;
	}
}
