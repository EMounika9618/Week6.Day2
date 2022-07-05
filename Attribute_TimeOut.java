package week6.Day2;

import org.testng.annotations.Test;

public class Attribute_TimeOut {

@Test(timeOut=600)  
//if it is bellow of thead sleep then that particular method will get fail
//timeout == sleep then results come but resulted as failed
//timout<sleep then it will not give output and fail

public void testcase1() throws InterruptedException  
{  
Thread.sleep(500);  
System.out.println("ABCD");  
}  
@Test    
public void testcaes2() throws InterruptedException  
{  
	Thread.sleep(500);  
System.out.println("EFGH");  
    }  
@Test  
public void testcase3() throws InterruptedException  
{  Thread.sleep(100);  

System.out.println("IJKL");  
}  
}
