
import java.util.*;


public class Control_Flow1
{
	int findMax(int a,int b,int c)
{
	if(a>b)//nested if else//
	{
		if(a>c)
		{
			return a;
		}
		else
		{
			return c;
		}
	}
	else
	{
		if(b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
}
public static void main(String args[])
{
Control_Flow1 cf=new Control_Flow1();
System.out.println(cf.findMax(8,10,12));
}
}
