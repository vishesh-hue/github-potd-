class Solution {
    List<Integer> list1=new ArrayList<>();
   List<Integer> list2=new ArrayList<>();
   
   public void node1(TreeNode root){
     if(root==null) return;
     if(root.left==null && root.right==null){
       list1.add(root.val);
     }
     
     node1(root.left);
     node1(root.right);
   }
   
   public void node2(TreeNode root){
     if(root==null) return;
     if(root.left==null && root.right==null){
       list2.add(root.val);
     }
     
     node2(root.left);
     node2(root.right);
   }
   public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      node1(root1);
      node2(root2);
      if(list1.size() !=list2.size()){
        return false;
      }
      for(int i=0;i<list1.size();i++){
        if(list1.get(i)!=list2.get(i)){
          return false;
        }
      }
      return true;
    }
}
