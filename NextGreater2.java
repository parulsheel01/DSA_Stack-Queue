class NextGreater2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] nge = new int[n];
        HashMap<Integer,Integer> mpp = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int i=m-1;i>=0;i--){
            int num = nums2[i];
            while(!st.isEmpty() && st.peek() <= num){
                st.pop();
            }
            if(st.isEmpty()){
                mpp.put(num, -1);
            }
            else{
                mpp.put(num,st.peek());
            }
            st.push(num);
        }
        for(int j=0;j<n;j++){
            nge[j] = mpp.get(nums1[j]);
        }
        return nge;
    }
}
