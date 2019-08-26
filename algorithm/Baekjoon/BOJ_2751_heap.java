package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2751_heap {
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(rd.readLine());

		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = (Integer.parseInt(rd.readLine()));
		}
		
		heapSort(arr, N);

		for(int value : arr)
			System.out.println(value);
	}
	
	//최대힙 만들기
	public static void heapify(int[] arr, int N) {
		//0번 노드는 부모 노드가 없으므로 고려하지 않아도 됨
		for(int i=1; i<N; i++) {
			int child = i;
			//부모노드가 아닐 때까지 검사
			while(child > 0) {
				int parent = (child-1)/2;
				if(arr[child] > arr[parent])
					swap(arr, parent, child);
				//swap 후 root 노드로 올라가며 재귀적 호출하기
				child = parent;
			}
		}
	}
	
	public static void heapSort(int arr[], int N) {
		heapify(arr, N);
		//다운힙
		for(int i=N-1; i>0; i--) {
			//root 노드와 마지막 노드 swap
			swap(arr, i, 0);
			//다시 최대힙 만들기
			heapify(arr, i);
		}
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	//최대 힙
	/* public static void heapify(int arr[], int length, int i) {
		int parent = i;
		int left = i*2+1; //왼쪽 자식
		int right = i*2+2; //오른쪽 자식
		
		//left, right가 부모보다 큰 경우
		if (left < length && arr[parent] < arr[left]) {
			parent = left;
		}
		if (right < length && arr[parent] < arr[right]) {
			parent = right;
		}
		if (i != parent) {
	        swap(arr, parent, i);
	        //하위 노드 최대힙 만들기
	        heapify(arr, length, parent);
	    }
	}
	
	//다운힙
	public static void heapSort(int arr[], int length) {
		//마지막 부분노드부터 시작
		for(int i=length/2; i>=0; i--) {
			heapify(arr, length, i);
		}
		for (int i=length; i>0; i--) {
			//마지막 노드와 root(노드의 최대값) 바꾸기
	        swap(arr, 0, i);
	        //root 노드부터 최대힙 만들기
	        heapify(arr, i, 0);
	    }
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	} */
}

