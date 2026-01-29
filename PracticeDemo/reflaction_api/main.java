package reflaction_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Student{
	
	String s;
	
	private Student(String s) {
		this.s=s;
	}
	
	Student(int i){
		
	}
	
	Student(int i,String s){
		
		
	}
}

public class main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		 
      Class<?>cl=Class.forName("reflaction_api.Student");
      
      Constructor<?>[] cs=cl.getDeclaredConstructors();
      
      for(Constructor<?> c:cs)
      {
    	  System.out.println(c);
    	  System.out.println("__________________________");
      }
      
      Constructor<?>cp=cl.getDeclaredConstructor(String.class);
      
      System.out.println(cp);
      
      cp.setAccessible(true);
      
      Student st=(Student) cp.newInstance("hello  world");
      System.out.println(st.s);
      
	}

}
