package MavenTestjava.Testmaven;

import org.testng.annotations.Test;

public class test1 
{
	@Test
public void maventest()
{
	System.out.println("Maven selenium test 1");
	System.out.println("Maven selenium test 1"); //Added new line
	System.out.println("Maven selenium test 4");//Added new line again
}
	@Test
public void maventest1()
{
	System.out.println("Maven selenium test 2");
}
	
	@Test
public void maventest4() // Added new method
{
	System.out.println("Maven selenium test 2");
	System.out.println("New addition to check the status");// Adding branching 1 for branching
	System.out.println("New addition to check the status");// Adding branching 2 for branching
	System.out.println("New addition to check the status");// Adding branching 3for branching
}
	
	@Test
public void maventest5() // Added new method for branching
{
	System.out.println("Maven selenium test 2");
	System.out.println("New addition to check the status");// Adding branching 1for branching
	System.out.println("New addition to check the status");// Adding branching 2
	System.out.println("New addition to check the status");// Adding branching 3
}
	@Test
public void maventest6() // Added new method for branching
{
	System.out.println("Maven selenium test 2");
	System.out.println("New addition to check the status");// Adding branching 1
	System.out.println("New addition to check the status");// Adding branching 2
	System.out.println("New addition to check the status");// Adding branching 3
}
}
