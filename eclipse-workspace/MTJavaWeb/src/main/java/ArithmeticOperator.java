public class ArithmeticOperator{
	//编写一个main
	public static void main(String[]agrs) {
		System.out.println(10/4);//数学2.5，计算机2
		System.out.println(10.0/4);//数学2.5，计算机2
		double d =10/4; //结果2.0  2.0double 
		System.out.println(d);//
		System.out.println(10%3);//余数是1
		System.out.println(-10%3);//
		System.out.println(10%-3);
		System.out.println(-10%-3);
		//++
		int  i=10;
		i++;
		++i;
		System.out.println("i="+i);
		
		//表达
		int  j =8;
		int  k=++j;//j=j+1  k=j
		System.out.println("k=" +k +"j=" +j);
		int  o=8;
		int  g=o++;
		System.out.println("g="+g+"o="+o);
		
		 
	}
	
}