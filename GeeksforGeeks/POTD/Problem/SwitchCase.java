// User function Template for Java

class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
       
        switch(choice){
            case 1:
              // calculate area circle 22/7 * R^2
              return Math.PI*arr.get(0)*arr.get(0);
            case 2:    
              // calculate the area rect L*B
              return arr.get(0)*arr.get(1);
              
            default:
              return 0.0; 
        }
        
       
    }
}
