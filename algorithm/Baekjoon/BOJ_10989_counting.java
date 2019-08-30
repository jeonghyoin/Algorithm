package algorithm.Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10989_counting {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		int arr[] = new int[10001];
		for(int i=0; i<N; i++) {
			int index = Integer.parseInt(br.readLine());
			arr[index]+=1;
		}

		for(int i=0; i<10001; i++) {
			if(arr[i] > 0) {
				for(int j=0; j<arr[i]; j++) {
					bw.write(String.valueOf(i));
					bw.newLine();
				}
			}
		}
		br.close();
		bw.flush();
	}

	/* 0부터, 시간 초과
	public static void main(String[] args) throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(rd.readLine());

		Integer arr[] = new Integer[N];
		for(int i=0; i<N; i++) {
			arr[i] = (Integer.parseInt(rd.readLine()));
		}

		int temp[] = new int[N];
		counting(N, arr, temp);

		for(int value: temp)
			System.out.println(value);
	}

	static void counting(int N, Integer[] arr, int[] temp) {
		//카운팅 배열 크기 구하기
		int size = Collections.max(Arrays.asList(arr)) + 1;
		int counting[] = new int[size];
		Arrays.fill(counting, 0);

		//원소 갯수 채우기
		for(int i=0; i<N; i++) {
			int index = arr[i];
			counting[index]++;
		}

		//누적합 구하기
		for(int i=1; i<size; i++) {
			counting[i] = counting[i-1] + counting[i];
		}

		//arr, counting 이용하여 temp에 정렬하기
		//안정정렬을 위해 오른쪽 -> 왼쪽 진행
		for(int i=N-1; i>=0; i--) {
			int number = arr[i];
			int index = --counting[number];
			temp[index] = number;
		}
	} */
}
