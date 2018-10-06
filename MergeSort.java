public class MergeSort implements SortingAlgorithm{

	public void sort(int [] a){
		int mid=a.length/2;
		if(a.length<2){
			return;
		}
		int [] L = new int [mid];
		int [] R = new int [a.length-mid];
		
		
		for (int k = 0; k < mid; k++){
			L[k] = a[k];
		}
		for (int j = mid; j <a.length; j++){
			R[j-mid]=a[j];
		}
		sort(L);
		sort(R);
		merge(a, L, R);
	
		
	}
	public void merge(int [] a, int[] l, int[] r){
		int nL = l.length;
		int nR = r.length;
		int i=0;
		int k=0;
		int index=0;
		//merge
		while(i < nL && k < nR){
			if(l[i] <= r[k]){
				a[index] = l[i];
				i++;
				
			}
			else{
				a[index] = r[k];
				k++;
			}
			index++;
		}
		
		while(i < nL){
			a[index]= l[i];
			index++;
			i++;
		}
		while(k < nR){
			a[index]= r[k];
			index++;
			k++;
		}
	}
	
}