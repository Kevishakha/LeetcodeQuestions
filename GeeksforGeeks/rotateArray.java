class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        for(int i=0;i<d;i++){
            int fir=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=fir;
        }
    }
}
