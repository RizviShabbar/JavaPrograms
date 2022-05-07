package Assignment_01;

public class Q8 {
	public static void main(String[] args) {
			System.out.println("Shabbar Rizvi_G_20011875");
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("array before deletion is");
		display(arr);
		delete(arr);
		System.out.println("array after deletion is ");
		display(arr);
		
	}
	public static void delete(int arr[]) {
	int n = arr.length;
	for(int i = 3;i<n-1;i++) {
		arr[i]=arr[i+1];
	}
	arr[n-1] = 0;
	}
	public static void display(int arr[]) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			System.out.println("resulted array is "+arr[i]);
		}
	}
}
