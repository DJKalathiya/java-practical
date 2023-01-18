class strBufferDemo{
	public static void main(String [] args){
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1 capcity = " + sb1.capacity());
		StringBuffer sb2 = new StringBuffer("Test String");
		System.out.println("sb2 capacity = " +sb2.capacity());
		StringBuffer sb3 = new StringBuffer(11);
		System.out.println("Sb3 capacity = " +sb3.capacity());

		sb1.append("Another string");
		System.out.println("sb1 = " +sb1);
		System.out.println("sb2 = " +sb2.append(sb1));
		System.out.println("sb1 length = "+sb1.length());
		System.out.println("sb2 length = "+sb2.length());
		System.out.println("sb1 insert at index 3 = " +sb1.insert(3,false));
		System.out.println("sb1 capacity = " +sb1.capacity());
		System.out.println("sb1 reverse = " +sb1.reverse());
		sb1.setCharAt(3,'z');
		System.out.println("sb1 set char at index 3 = "+sb1);
		sb3.setLength(27);
		System.out.println("sb3 capacity = " +sb3.capacity());

	}
}