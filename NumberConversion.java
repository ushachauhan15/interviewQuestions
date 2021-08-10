package Test2;

import java.util.Arrays;
import java.util.List;

//Convert number to word 
//input values- from 1 to 99
public class NumberConversion {

	public static void main(String[] args) {
		System.out.println(convertNumber(11));
		System.out.println(convertNumber(10));
		System.out.println(convertNumber(20));
		System.out.println(convertNumber(100));
		System.out.println(convertNumber(0));
		System.out.println(convertNumber(23));
		System.out.println(convertNumber(9));

	}
	public static String convertNumber(int num)
	{
		String s="";
		int rem=0;
		int div=0;
		List<String> firstlist=Arrays.asList("","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
				"Sixteen","Seventeen","Eighteen","Ninteen");
		List<String> secondlist=Arrays.asList("","","Twenty","thirty","fourty","fifty","Sixty","Seventy","Eighty","Ninety");
		if(num >=1 && num <=99)
		{
			if(num<=19) {
			s= firstlist.get(num);
			}
			else 
			{
				rem=num%10;
				div=num/10;
			s=	secondlist.get(div)+"  "+firstlist.get(rem);
			}
			
		}
		else {
			s="Not valid input";
		}
	return s;
	}
}
