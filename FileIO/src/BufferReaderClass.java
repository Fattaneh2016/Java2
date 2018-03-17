import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class BufferReaderClass {


	public static void main(String[] args)
	{
		System.out.println("got here");
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(new File("sample-file.dat")));
			System.out.println("File open successful!");

			int line = 0;
			for (String x = in.readLine(); x != null; x = in.readLine())
			{
				line++;
				System.out.println(x);
				if (line <= 3)
				{
					String[] tokens = x.split(" ");
					System.out.println("Number of tokens in line " + line + ": " + tokens.length);
					System.out.println("The tokens are:");
					for (String token : tokens)
					{
						System.out.println(token);
					}
				}
				else
				{
					String[] tokens = x.split("\\|");
					System.out.println("Number of tokens in line " + line + ": " + tokens.length);
					System.out.println("The tokens are:");
					for (String token : tokens)
					{
						System.out.println(token);
					}
					Integer[] values = new Integer[tokens.length];
					Integer sum = 0;
					for (int i = 0; i < tokens.length; i++)
					{
						sum += Integer.parseInt(tokens[i]);
					}
					System.out.println("Sum: " + sum);
				}
			}
		} catch (IOException e)
		{
			System.out.println("File I/O error!");
		}
	}
}





