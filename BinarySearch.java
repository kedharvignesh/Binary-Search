import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter x : ");
		int x= scanner.nextInt();
		
		int[] arr= {23,45,54,65,63,2,45,75,76};
		///// normal search
//		for(int i=0;i<arr.length;i++) {
//			if(x==arr[i]) {
//				System.out.println(i);
//			}
//		}
		
		///////binary search
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int min=0,max=arr.length-1;
		
		while(min<=max) {
			int mid=(min+max)/2;
			System.out.println("aa");
			if(x==arr[mid]) {
				System.out.println("bb");
				System.out.println(" present at = "+ mid);
				break;
			}else if (x<arr[mid]) {
				System.out.println("cc");
				max=mid-1;
			}else   {
				System.out.println("dd");
				min=mid+1;
			}
			System.out.println("ee");
		}
		if(min>max) {
			System.out.println("not found");
		}

	}

}
