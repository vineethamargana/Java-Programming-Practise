
//String builder-------------------------------------------------------------

package corejava;

public class MutableStrings__2_2 {
	public static void main(String []args)
	 {
		 StringBuilder st=new StringBuilder();
		 System.out.println(st.capacity());
		 st.append("java");
		 System.out.println(st.append(" ")); //for immutable Strings we use concate or + to attach new String ... in mutable Strings we have to use append.
		 System.out.println(st.length());
		 st.append(false);
		 System.out.println(st);
		 st.append(" jamesgosling");
		 System.out.println(st);
		 System.out.println(st.capacity());   // capaticy increses by current "capcity *2+2"
		 System.out.println(st.delete(1, 8)); // 8 will not get deleted because it is excluded.
	 }

}
