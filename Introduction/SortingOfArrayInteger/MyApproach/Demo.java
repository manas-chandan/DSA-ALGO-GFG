public class Demo{
	public static void main(String args[])
	{
	int[] arr=new int[]{7,6,49,90,3,21,1};
	for(int a:arr){
	System.out.print(a+",");
	}
	System.out.println();
	boolean isFinish=false;
	while(!isFinish){
		isFinish=true;
		for(int i=0;i<(arr.length-1);i++){
			if(arr[i]>arr[i+1]){
				isFinish =false;
				int tempVariable =arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=tempVariable;
			}
		}
	}
	for(int a:arr){
	System.out.print(a+",");
	}
	}
}