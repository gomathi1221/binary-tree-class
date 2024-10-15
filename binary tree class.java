class Tree {
   int d;
   Tree left;
   Tree right;

   Tree(int val) {
       d = val;
       left = null;  // Initialize left child
       right = null; // Initialize right child
   }
}

class main {
   public static void main(String[] args) {
       Tree root = new Tree(80);
       root.left = new Tree(100);
       root.right = new Tree(120);
       
       // Example output to verify the structure
       System.out.println("Root: " + root.d);
       System.out.println("Left Child: " + root.left.d);
       System.out.println("Right Child: " + root.right.d);
   }
}
