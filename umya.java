
public class umya 
{
	void m1()
	{
		System.out.println("Property");
	}
}
     class P extends umya
     {
    	 void m2()
    	 {
    		 System.out.println("Money");
    	 }
     }
     class C extends P
     {
    	 void m3()
    	 {
    		 System.out.println("knowledge"); 
    	 }
     
     

	public static void main(String[] args) 
	{
		C obj = new C();
		obj.m3();
		obj.m2();
		obj.m1();
		

	}

}
