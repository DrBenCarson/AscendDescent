import java.util.Arrays;


public class AscendDescend {

	public static void main(String[] args) {
		String zz[]={"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman" };
		Arrays.sort(zz);
		
		System.out.println("Ascend: ");
		for (int i=0;i<zz.length;i++)
		{
			System.out.println(zz[i]);
		}
	
		System.out.println("Descend: ");
		for(int q=zz.length-1;q>=0;q--)
		{
			System.out.println(zz[q]);
		}
	
	}




	}


