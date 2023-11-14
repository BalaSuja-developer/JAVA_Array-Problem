package zohoprepare;
import java.util.*;
import java.util.Random;

public class spiderpattern {

	public static void main(String[] args) {
		int arr[][]=new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j || j==i+1) {
					arr[i][j]=0;
				}else {
					arr[i][j]=1;
				}
			}
		}
		System.out.println("Array value ");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		spider_web sb=new spider_web();
		boolean ans=sb.spider_reach(arr, 5);
		System.out.println(ans);
	}
}

class spider_web{
	boolean spider_reach(int web_arr[][],int length) {
		int val,last_right=0,last_down=0,flag=0;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				if(i+1==j || i-j==1) {
					val=web_arr[i][j];
					if(val==0) {
						last_right=i;
						last_down=j;
					}
				}
			}
		}
		if(last_right==last_down+1 && last_right==length-1) {
			val=web_arr[length-1][length-1];
			if(val==0) {
				flag=1;
			}
		}else if(last_down==last_right+1 && last_down==length-1) {
			val=web_arr[length-1][length-1];
			if(val==0) {
				flag=1;
			}
		}else {
			flag=0;
		}
		if(flag==1) {
			return true;
		}else {
			return false;
		}
	}
}