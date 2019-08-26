package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2751_merge {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(rd.readLine());

		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = (Integer.parseInt(rd.readLine()));
		}
		rd.close();
		divide(arr, 0,N - 1);

		for(int value: arr)
			System.out.println(value);
	}

	//분할(재귀)
	public static void divide(int[] arr, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			divide(arr, start, middle); //middle 앞
			divide(arr, middle + 1, end); //middle 뒤
			merge(arr, start, end, middle);
		}
	}

	//정렬 + 병합
	public static void merge(int[] arr, int start, int end, int middle) {
		//합병정렬은 임시 배열 하나가 더 필요
		int temp[] = new int[arr.length];
		int arrIndex = start, tempIndex = start, nextMiddle = middle + 1;

		while(arrIndex <= middle && nextMiddle <= end) {
			//index i가 i+1보다 작은 경우(case 1)
			if(arr[arrIndex] < arr[nextMiddle]) {
				temp[tempIndex++] = arr[arrIndex++];
			} else { //index i가 i+1보다 큰 경우(case 2)
				temp[tempIndex++] = arr[nextMiddle++];
			}
		}
		//case 1, 나머지 배열 채우기
		while(arrIndex <= middle) {
			temp[tempIndex++] = arr[arrIndex++];
		}
		//case 2, 나머지 배열 채우기
		while(nextMiddle <= end) {
			temp[tempIndex++] = arr[nextMiddle++];
		}
		//정렬된 temp 배열 arr에 복사
		for(int i=start; i<tempIndex; i++) {
			arr[i] = temp[i];
		}
	}
}
