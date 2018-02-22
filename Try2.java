package test2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Try2
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ta;
		int i = 0;
		for(;i < 100; )
		{
			String str = br.readLine();
			parseinteger
			i++;
			if(i % str == 0)
			{
				ta = ta + str;

				System.out.println(i);

			}
		}
	}

}
