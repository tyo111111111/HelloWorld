public class FloatDetail{
	//编写一个main方法
	public static void main(String[] args) {
		
		//float n1 = 1.1;//不对
		float num2 =1.1f;//对
		double num3 =1.1;//对
		double num4 =1.1f;//对
		double num5=.123;
		System.out.println(num5);
		//5.12乘以10的平方
		System.out.println(5.12e2);
		//5.12除以10的二次方
		System.out.println(5.12e-2 );
		//通常情况下使用double更精确
		double num9  = 2.1234567851;
		float  num10 =2.1234567851F;
		System.out.println(num9);
		System.out.println(num10);
	
		double num11 = 2.7;
		double num12 =8.1 /3;// 除以3
		System.out.println(num11);
		System.out.println(num12);
		//不相等 不整除
		if( num11 == num12) {
			System.out.println("相等");
			if(Math.abs( num11 - num12 )<0.000001);{
				System.out.println("差值非常小，到我的规定精度，认为相等。。。");
			}
			System.out.println(Math.abs(num11 - num12));
		}
     }
}