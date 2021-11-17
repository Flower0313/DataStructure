package demo01;

/**
 * @ClassName DataStructure-Test01
 * @Author Holden_—__——___———____————_____Xiao
 * @Create 2021年8月24日21:58 - 周二
 * @Theme 二叉排序树
 */
public class NodeTest {
    public static void main(String[] args) {
        int[] nums = {4, 3, 6, 5, 7, 8};
        BinarySortTree BSTree = new BinarySortTree();
        for (int num : nums) {
            BSTree.add(new Node(num));
        }
        // BSTree.searchParent(10);
        BSTree.infixOrder();
        BSTree.delNode(19);
        System.out.println("-----------");
        BSTree.infixOrder();
    }
}

class BinarySortTree {
    /**
     * 根节点
     */
    private Node root;


    /**
     * 添加结点的方法
     *
     * @param node
     */
    public void add(Node node) {
        //如果没有根节点，则将新进来的当新结点
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    /**
     * 遍历
     */
    public void infixOrder() {
        if (root != null) {
            root.infixOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    /**
     * @param value 结点的值
     * @return 返回目标结点
     */
    public Node search(int value) {
        if (root == null) {
            return null;
        } else {
            //从根结点开始寻找
            return root.search(value);
        }
    }

    /**
     * @param value 结点的值
     * @return 返回父类结点
     */
    public Node searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            //从根结点开始寻找
            return root.searchParent(value);
        }
    }

    /**
     * 当需要被删除的节点在父结点的左边时
     * <p>
     * 删除结点分三种情况：
     * (1):删除叶子节点
     * (2):删除只有一颗子树的节点
     * (3):删除两颗子树的节点
     *
     * @param node 传入的节点(当作二叉排序树的根结点)
     * @return 返回以node为根节点的二叉排序树的最小结的值
     */
    public int delRightTreeMin(Node node) {
        Node target = node;
        //循环的查找左结点，就会找到最小值
        while (target.left != null) {
            target = target.left;
        }
        //这时target就指向了最小的节点并删除
        delNode(target.value);
        return target.value;
    }

    public void delNode(int value) {
        if (root == null) {
            return;
        } else {
            //1.先去找要删除的节点 targetNode,返回的是目标值的节点
            Node targetNode = search(value);
            if (targetNode == null) {
                return;
            }
            //如果这个二叉树只有一个结点，根结点
            if (root.left == null && root.right == null) {
                System.out.println("被执行");
                root = null;
                return;
            }
            //2.去找到targetNode的父节点
            Node parent = searchParent(value);

            //情况一：如果要删除的是叶子结点
            if (targetNode.left == null && targetNode.right == null) {
                //3.判断targetNode是parent的左结点还是右结点
                if (parent.left != null && parent.left.value == targetNode.value) {
                    //左子结点
                    parent.left = null;
                } else if (parent.right != null && parent.right.value == targetNode.value) {
                    //右子结点
                    parent.right = null;
                }
            }//情况二：删除有两颗子树的节点
            else if (targetNode.left != null && targetNode.right != null) {
                int minVal = delRightTreeMin(targetNode.right);
                targetNode.value = minVal;
            }//情况三：删除只有一颗子树的节点
            else {
                //如果要删除的节点有左子结点
                if (targetNode.left != null) {
                    if (parent != null) {
                        //如果targetNode是parent的左子结点
                        if (parent.left.value == value) {
                            parent.left = targetNode.left;
                        } else {
                            parent.right = targetNode.left;
                        }
                    } else {
                        root = targetNode.left;
                    }

                } else {//如果要删除的节点有右子结点
                    if (parent != null) {
                        //如果targetNode是parent的左子结点
                        if (parent.left != null && parent.left.value == value) {
                            parent.left = targetNode.right;
                        } else {//如果targetNode是parent的右子结点
                            parent.right = targetNode.right;
                        }
                    } else {
                        root = targetNode.right;
                    }

                }
            }
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    /**
     * 递归的形式添加结点，需要满足二叉排序树的要求
     *
     * @param node
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }
        /*
         * 判断传入的结点的值，和当前子树的根结点的值的关系
         * this就相当于当前子树的根节点，因为一般是root.add(Node node)
         * */
        if (node.value < this.value) {
            //如果当前结点左子结点为空，直接挂在下面
            if (this.left == null) {
                this.left = node;
            } else {
                //递归去左子树中去找
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }

    }


    /**
     * 此递归有返回值，所以每个递归都要有return
     *
     * @param value 希望删除的节点的值
     * @return 如果找到返回该结点，否则返回null
     */
    public Node search(int value) {
        if (value == this.value) {
            return this;
            //如果查找的值小于当前结点，向左子树递归查找
        } else if (value < this.value) {
            if (this.left != null) {
                /*
                 * Q:为什么加return？
                 * A:因为他的下一个递归return过来的是一个Node，所以他也直接return Node
                 * */
                return this.left.search(value);
            }
            return null;
        } else {
            if (this.right != null) {
                return this.right.search(value);
            }
            return null;
        }
    }

    /**
     * @param value 要查找的节点的值
     * @return 返回的是要删除的节点的父节点，如果没有就返回null
     */
    public Node searchParent(int value) {
        //如果是查找的就是根结点
        if (this.value == value) {
            return null;
        }
        //如果此节点的左子结点不为空，且与要找的数相等，则此节点就是传入数的父节点
        boolean leftFeasible = this.left != null && this.left.value == value;
        //与上同理
        boolean rightFeasible = this.right != null && this.right.value == value;
        if (leftFeasible || rightFeasible) {
            return this;
        } else {
            //如果查找的值小于当前结点的值，并且当前结点的左子结点不为空
            if (value < this.value && this.left != null) {
                return this.left.searchParent(value);
            } else if (value >= this.value && this.right != null) {
                return this.right.searchParent(value);
            } else {
                return null;
            }
        }
    }

    public void infixOrder() {
        //向左子树递归
        if (this.left != null) {
            this.left.infixOrder();
        }
        //左子树没有了输出
        System.out.println(this);

        //向右子树递归
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    @Override
    public String toString() {
        return "Node[" +
                "value=" + value +
                ']';
    }
}
