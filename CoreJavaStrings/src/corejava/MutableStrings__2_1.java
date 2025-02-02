
//there is no difference between string buffer and string builder output wise ..... but the difference is there at multithreading level.

// String Buffer------------------------------------------.

package corejava;

public class MutableStrings__2_1 {
 public static void main(String []args)
 {
	 StringBuffer st=new StringBuffer();
	 System.out.println(st.capacity());
	 st.append("java");
	 System.out.println(st); //for immutable Strings we use concate or + to attach new String ... in mutable Strings we have to use append.
	 st.append(false);
	 System.out.println(st);
	 st.append(" jamesgosling");
	 System.out.println(st);
	 System.out.println(st.capacity());   // capaticy increses by current "capcity *2+2"
	 System.out.println(st.delete(1, 8)); // 8 will not get deleted because it is excluded.
 }
}
