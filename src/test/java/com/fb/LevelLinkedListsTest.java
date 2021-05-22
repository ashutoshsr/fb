import static org.junit.Assert.assertTrue;
import com.fb.TreeNode;
import com.fb.LevelLinkedLists;
import com.fb.TreeFromPreInOrder;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
public class LevelLinkedListsTest {
    @Test
        public void shouldAnswerWithTrue()
    {
        int[] preorder = new int[] { 3, 9, 8, 6, 20, 15, 7, };
		int[] inorder = new int[] { 8, 9, 6, 3, 15, 20, 7 };
		TreeNode node = new TreeFromPreInOrder().buildTree(preorder, inorder);
		ArrayList<LinkedList<TreeNode>> levels = new ArrayList<>();
		 new LevelLinkedLists().levelList(node, 0, levels);
		System.out.println(levels.get(2));
    }
}