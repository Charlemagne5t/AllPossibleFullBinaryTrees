import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void allPossibleFBTTest1(){
        int n = 7;
        List<TreeNode> expected = new ArrayList<>();
        TreeNode root1 = new TreeNode(0);
        root1.left = new TreeNode(0);
        root1.right = new TreeNode(0);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(0);
        root1.right.right.left = new TreeNode(0);
        root1.right.right.right = new TreeNode(0);

        expected.add(root1);

        TreeNode root2 = new TreeNode(0);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(0);
        root2.right.left = new TreeNode(0);
        root2.right.right = new TreeNode(0);
        root2.right.left.left = new TreeNode(0);
        root2.right.left.right = new TreeNode(0);

        expected.add(root2);

        TreeNode root3 = new TreeNode(0);
        root3.left = new TreeNode(0);
        root3.right = new TreeNode(0);
        root3.left.left = new TreeNode(0);
        root3.left.right = new TreeNode(0);
        root3.right.right = new TreeNode(0);
        root3.right.left = new TreeNode(0);

        expected.add(root3);

        TreeNode root4 = new TreeNode(0);
        root4.left = new TreeNode(0);
        root4.right = new TreeNode(0);
        root4.left.left = new TreeNode(0);
        root4.left.right = new TreeNode(0);
        root4.left.right.left = new TreeNode(0);
        root4.left.right.right = new TreeNode(0);

        expected.add(root4);

        TreeNode root5 = new TreeNode(0);
        root5.left = new TreeNode(0);
        root5.right = new TreeNode(0);
        root5.left.left = new TreeNode(0);
        root5.left.right = new TreeNode(0);
        root5.left.left.left = new TreeNode(0);
        root5.left.left.right = new TreeNode(0);

        expected.add(root5);

        List<TreeNode> actual = new Solution().allPossibleFBT(n);

        Assert.assertEquals(expected.size(), actual.size());

    }


}
