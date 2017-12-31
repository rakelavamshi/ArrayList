import java.util.ArrayList;


public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		int sum=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(5);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.size());
		Integer[] ia=new Integer[al.size()];
		ia=al.toArray(ia);
		for(int j:ia)
		{
			sum=sum+j;
			System.out.println(sum);
		}
	}
}
