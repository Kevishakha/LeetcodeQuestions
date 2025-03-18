class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
         if(l<r) {
            int mid=l + (r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            conquer(arr,l,mid,r);
         }
        
    }
     void conquer(int arr[], int si,int mid,int ei){
            int[] merged=new int[ei-si+1];
            int indx1=si;
            int indx2=mid+1;
            int x=0;
            while(indx1<=mid && indx2<=ei){
                if(arr[indx1]<=arr[indx2]){
                    merged[x++]=arr[indx1++];
                }else{
                    merged[x++]=arr[indx2++];
                }
            }
            while(indx1<=mid){
                merged[x++]=arr[indx1++];
            }
            while(indx2<=ei){
                merged[x++]=arr[indx2++];
            }
            
            
            for(int i=0;i<merged.length;i++){
                arr[si+i]=merged[i];
            }
        }
       
}
