import java.util.Random;
import java.util.Set;
import java.util.Hashset;
import java.io.Filewriter;
import java.io.Ioexception;
public class simultedDS
{
    public static String generateuniqueinstance(int id,random.random)
	{
	    int a1=random.nextint(100);
		int a2=random.nextint(1000);
		int a3=random.nextdouble()*100;
		String a"Class"+(id %3);
		return a1+","+a2","+a3","+a4;
	}
	public static void main(String args[])
	    {
		int totalinstances=100;
		random random=new random();
		set<String>instances=new Hashes<> ();
		for(int i=0;i<totalinstances;i++)
		    {
			string instance=generateuniqueinstance(i,random);
			instances.add(instance);
			}
	try(Filewriter write=new Filewriter("simultedDS.csv"));
	    {
		write.write("A1"+","+"A2"+","+"A3"+","+"A4"+\n");
		for(String s:instances)
		  {
		    write.write(s+"\n");
	System.out.println("File generated successfully");
	      }
	Catch(Ioexception e)
	{
	e.printStackTrace ();
	}
		}
}