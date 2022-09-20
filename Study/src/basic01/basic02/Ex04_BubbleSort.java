package basic02;

public class Ex04_BubbleSort {

	public static void main(String[] args) {
		int [] arr = {12,5,6,39,1,8,55};
		
		// -i를 하는 이유 : 제일 큰 수가 맨 마지막으로 정력이 됨 (맨 마지막은 비교를 안 해도 된다는 것)
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		// 1,5,6,8,12,39,55 << 출력하기
		
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
	}

}
