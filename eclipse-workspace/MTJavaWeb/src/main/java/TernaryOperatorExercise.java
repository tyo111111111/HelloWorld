public  class TernaryOperatorExercise{
	public static void main(String[] args) {
		//三个数中最大数
		int n1 =553;
		int n2 = 33;
		int n3 = 123;
		
		int max1 =n1>n2 ? n1:n2;
		int max2 =max1>n3 ?max1:n3;
		System.out.println("最大值是"+max2);
		
	}
}