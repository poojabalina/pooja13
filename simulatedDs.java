import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.io.FileWriter;
import java.io.IOException;
public class simulatedDS
{
    public static String generateUniqueInstance(int id,Random random)
	{
	    int a1=random.nextInt(100);
		int a2=random.nextInt(1000);
		double a3=random.nextDouble()*100;
		String a4="Class"+(id%3);
		return a1+","+a2+","+a3+","+a4;
	}
	public static void main(String args[])
	    {
		int totalinstances=100;
		Random random=new Random();
		Set<String>instances=new HashSet<> ();
		for(int i=0;i<totalinstances;i++)
		    {
			String instance=generateUniqueInstance(i,random);
			instances.add(instance);
			}
	try(FileWriter writer=new FileWriter("SimultedDS.csv"))
	    {
		writer.write("A1"+","+"A2"+","+"A3"+","+"A4"+"\n");
		for(String s:instances)
		 {
		 writer.write(s+"\n");
		 }
	System.out.println("File generated successfully");
	    }
	catch(IOException e)
	{
	e.printStackTrace();
	}
	}
}