/*
 * You have an array that contains police and a thief.
 * Your task is catching the thief. 
 * Police have capacity. You only catch minimum or equal capacity, not maximum.
 * Find the number of thieves catcher by police.
 * Constraints: Time complexity – O(n).
 */


package zohoprepare;

public class policeTheifProblem {

	public static void main(String[] args) {
		char arr[]= {'p','t','p','t','t','p','t','p'};
		int k=3;
		char x='o';
		int n=arr.length;
		int sum=0;
		int i=0;
		while(i<n) {
			if(i<n-k) {
				if(arr[i]!=arr[i+k] && arr[i]!=x && arr[i+k]!=x) {
					sum++;
					arr[i]=x;
					arr[i+k]=x;
					i++;
				}else if(k>1) {
					k--;
				}else {
					k=3;
					i++;
				}
			}else if(arr[i]!=x) {
				k--;
				if(arr[i]!=arr[i+k] && arr[i+k]!=x) {
					sum++;
					arr[i]=x;
					arr[i+k]=x;
					i++;
				}else {
					k--;
				}
			}else {
				k--;
				i++;
			}	
		}
		System.out.println(sum);
	}

}
