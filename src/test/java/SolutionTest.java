import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void isValidBSTExample1() {
    assertTrue(sol.isValidBST(sol.createBinaryTree(new String[]{"2", "1", "3"})));
  }
  @Test
  void isValidBSTExample2() {
    assertFalse(sol.isValidBST(sol.createBinaryTree(new String[]{"5", "1", "4", "null", "null", "3", "6"})));
  }
}