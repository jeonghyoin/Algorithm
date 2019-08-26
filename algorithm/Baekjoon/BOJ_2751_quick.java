package algorithm.Baekjoon;

 import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2751_quick {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(rd.readLine());

		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = (Integer.parseInt(rd.readLine()));
		}
		rd.close();

		quickSort(arr, 0, N - 1);

		for(int value : arr)
			System.out.println(value);
	}

	public static void quickSort(int[] arr, int first, int end) {
		int left = first, right = end;
		//배열 중간 값으로 pivot 잡기
		int pivot = arr[(first + end) / 2];

		while(left <= right) {
			//pivot보다 큰 수 찾기
			while (arr[left] < pivot)
				left++;
			//pivot보다 작은 수 찾기
			while (arr[right] > pivot)
				right--;
			//left가 right보다 작거나 같을 때만 swap
			if (left <= right) {
				swap(arr, left, right);
				left++; right--;
			}
		}
		//left, right 엇갈림
		if(first < right) //왼쪽 partition
			quickSort(arr, first, right);
		if(end > left) //오른쪽 partition
			quickSort(arr, left, end);
	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
