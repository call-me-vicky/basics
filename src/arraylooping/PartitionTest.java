package arraylooping;

public class PartitionTest {
	
	
	public static void test_1()
	{
		System.out.println("partition test started");
		int res;
		int[] arr = {};
		res = Partitioning.partition(arr);
		if(res!=0)
			System.out.println("failed: expected:0, result:"+res);
		
		arr = new int[]{1};
		res = Partitioning.partition(arr);
		if(res!=0)
			System.out.println("failed: expected:1, result:"+res);
		
		arr = new int[]{2,1};
		res = Partitioning.partition(arr);
		if(res!=0)
			System.out.println("failed: expected:0, result:"+res);
		
		arr = new int[]{3,5,1,2,7};
		res = Partitioning.partition(arr);
		if(res!=4)
			System.out.println("failed: expected:4, result:"+res);
		
		arr = new int[]{1,3,2,7,8,9,5};
		res = Partitioning.partition(arr);
		if(res!=3)
			System.out.println("failed: expected:3, result:"+res);
		
		System.out.println("partition test sucessfull");
	}

	public static void main(String[] args) {
		test_1();
	}

}
