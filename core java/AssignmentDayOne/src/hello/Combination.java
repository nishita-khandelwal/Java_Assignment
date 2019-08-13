package hello;

public class Combination {
	public static void main(String args[])
	{
		int[] value= { 1,2,3 };
		 
        for (int x = 0; x < 3; x++) 
        {
            for (int y = 0; y < 3; y++) 
            {
                for (int z = 0; z < 3; z++) 
                {
 
                    if (x != y && y != z && z != x) 
                    {
                        System.out.println(value[x] + "" + value[y] + ""
                                + value[z]);
                    }
                }
            }
        }
 
	}

}
