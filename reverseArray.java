class Solution{
  public static void reverse(int numbers[]){
    int start=0,last=numbers.length-1;
    while(start < last){
      int temp=numbers[last];
      numbers[last]=numbers[first];
      numbers[first]=temp;

      start++;
      last--;
    }
  }
  public static void main(String args[]){
    int numbers = {2,4,1,6,8,5};
    int ans[]=reverse(numbers);
    System.out.print(ans);
  }
}
