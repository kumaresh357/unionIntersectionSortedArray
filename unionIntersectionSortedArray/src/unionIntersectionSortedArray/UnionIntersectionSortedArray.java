package unionIntersectionSortedArray;

public class UnionIntersectionSortedArray {
	
	public static void union(int a[], int m, int b[], int n) {
		int i = 0;
		int j = 0;
		while(i<m && j<n) {
			while((i<m-1) && (a[i]==a[i+1])){
				i++;
			}
			while((j<n-1) && (b[j]==b[j+1])){
				j++;
			}
			if(a[i]<b[j]) {
				System.out.print(a[i] + " ");
				i++;
			}
			else if(a[i]>b[j]) {
				System.out.print(b[j] + " ");
				j++;
			}
			else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
		while(i<m) {
			if((i<m-1) && (a[i]==a[i+1])) {
				i++;
			}
			else {
				System.out.print(a[i] + " ");
				i++;
			}
		}
		while(j<n) {
			if((j<n-1) && (b[j]==b[j+1])) {
				j++;
			}
			else {
				System.out.print(b[j] + " ");
				j++;
			}
		}
	}
	
	public static void intersection(int a[],int m, int b[], int n) {
		int i = 0;
		int j = 0;
		while(i<m && j<n) {
			while((i<m-1) && (a[i]==a[i+1])) {
				i++;
			}
			while((j<n-1) && (b[j]==b[j+1])) {
				j++;
			}
			if(a[i]<b[j]) {
				i++;
			}
			else if(a[i]>b[j]) {
				j++;
			}
			else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int a[] = {1,2,2,3,4,5,5,6,9,9,9,12,15,17,17};
		System.out.println("array a is");
		for(int one:a) {
			System.out.print(one +" ");
		}
		System.out.println();
		int b[] = {0,3,3,4,5,6,6,7,9,9,10};
		System.out.println("array b is");
		for(int two:b) {
			System.out.print(two +" ");
		}
		System.out.println();
		int m = a.length;
		int n = b.length;
		System.out.println("the union array is");
		UnionIntersectionSortedArray.union(a,m,b,n);
		System.out.println();
		System.out.println("the intersection array is");
		UnionIntersectionSortedArray.intersection(a,m,b,n);
	}
}
