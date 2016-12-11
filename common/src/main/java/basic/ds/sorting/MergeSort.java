package basic.ds.sorting;


public class MergeSort extends SortClass {
	
	@Override
	public int[] Sort(int[] a) {
		int N = a.length;
		int[] auxArray = new int[N];
		//Copy Data.
		for (int i=0 ; i <= N-1;i++){
			auxArray[i]=a[i];
		}
		//_mergeSort(a, auxArray, 0, N-1);
		a = _bottonUpSort(a);
		return a;
		
	}
	private static void _mergeSort(int[] a,int[] auxArray, int low,int high){

		if(high <= low) return ;
		//Get the mid point.
		//int N = high+1;
		int mid = low + (high-low)/2;
		_mergeSort(a,auxArray, low, mid);
		_mergeSort(a,auxArray, mid+1, high);
		//Merge
		_merge(a, auxArray, low, mid, high);
	}
	private static void _merge(int[] a,int[] auxArray,int low,int mid ,int high){
		  for (int k = low; k <= high; k++)
			  auxArray[k] = a[k];
		  
		int j = mid+1;
		int i = low;
		for (int k = low ; k <= high; k++){
			if(i > mid) a[k] = auxArray[j++];
			else if(j > high) a[k] = auxArray[i++]; 
			else if(auxArray[j]< auxArray[i]) {
				a[k] = auxArray[j++];
			}
			else{
				a[k] = auxArray[i++];
			}
		}
	}
	//This is not working 
	private static int[] _bottonUpSort(int a[]){
		//Upper loop
		int N = a.length;
		int mid ;
		for (int i =1; i < N; i = i*2 ){
			mid = (i-1) + (i*2-1-i-1)/2;
			_merge(a,a,i-1,mid,i*2-1);
		}
		return a;
	}
}
