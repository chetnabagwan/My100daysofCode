class Solution{
  public static void printSubarrays(int nums[]){
    for(int i=0;i<nums.length;i++){
      for(int j=i;j<nums.length;j++){
        for (int k=i;k<=j;k++){
          System.out.print(nums [k] +" ");
        }
        System.out.println();
     }
      System.out.println();
    }
  }
  
  public static void main(String args[]){
    int nums = {2,4,1,6,8,5};
    printSubarrays(nums);
  }
}
