package raBi;

public class StringBuffer_cap {

	public static void main(String[] args) {
		
		/*StringBuffer sb=new StringBuffer();
		sb.append("qwertyuioplkjhgfdsamnbvcxzqwert");//34
		sb.append("a");  //72
		sb.append(12);
		System.out.println(sb.capacity());*/
		
		StringBuffer sb=new StringBuffer("rabi");  
		sb=new StringBuffer("durga");   //assigned new value of sb
		System.out.println(sb.capacity());   //ouput 21 w.r.t "durga" 
		                                     // we know normal capacity is 16 and +5(durga)=21

	}

}
