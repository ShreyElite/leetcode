class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
         ArrayList<Integer> list=new ArrayList<>();
 int n=arr.length-1;
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                list.add(arr[i]);
            }
            return list;
        }
        if(x>arr[n]){
            for(int i=n-k+1;i<=n;i++){
                list.add(arr[i]);
            }
            Collections.sort(list);
            return list;
        }
             int low=0,high=arr.length-1;
             int lb=n;
             while(low<=high){
               int mid=low+(high-low)/2;
                   if(arr[mid]>=x){
                        lb=mid;
                        high=mid-1;
                   }
                  else low=mid+1;
           }
           int j=lb,i=lb-1;
           while(i>=0 && k>0 && j<=n){
                 int l=Math.abs(arr[i]-x);
                 int r=Math.abs(arr[j]-x);
                 if(l<=r){
                    list.add(arr[i]);
                    i--;
                 }
                 else{
                     list.add(arr[j]);
                     j++;
                 }
                 k--;
           }
           while(i>=0 && k>0 ){
           
            list.add(arr[i]);
            i--;
            k--;

           }
           while(j<=n && k>0 ){
            list.add(arr[j]);
            j++;
            k--;
           }
           Collections.sort(list);
           return list;
    }
}