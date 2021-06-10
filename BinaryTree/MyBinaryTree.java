package com.company.BinaryTree;

public class MyBinaryTree<T extends Comparable<T>> {
    class BinaryNode<T extends Comparable<T>> implements Comparable<T> {
        private T value;
        BinaryNode<T> right;
        BinaryNode<T> left;

        public BinaryNode<T> getRight() {
            return right;
        }

        public void setRight(BinaryNode<T> right) {
            this.right = right;
        }

        public BinaryNode<T> getLeft() {
            return left;
        }

        public void setLeft(BinaryNode<T> left) {
            this.left = left;
        }

        public BinaryNode(T value) {
            this.value = value;
        }

        @Override
        public int compareTo(T o) {
            return value.compareTo(o);
        }

        public int compareTo(BinaryNode<T> other) {
            return value.compareTo(other.value);
        }
    }

    private BinaryNode<T> head;
    private int count;

    public void add(T value) {
        if (head == null) {
            head = new BinaryNode<>(value);
        } else {
            addTo(head, value);
        }
        count++;
    }

    private void addTo(BinaryNode<T> binaryNode, T value) {
        if (binaryNode.value.compareTo(value) > 0) {
            if (binaryNode.left == null) {
                binaryNode.left = new BinaryNode<T>(value);
            } else {
                addTo(binaryNode.left, value);
            }
        } else {
            if (binaryNode.right == null) {
                binaryNode.right = new BinaryNode<T>(value);
            } else {
                addTo(binaryNode.right, value);
            }
        }
    }

    public int Count() {
        return count;
    }

    public boolean contains(T value) {
        BinaryNode<T> result = find(value).getChildNode();
        return (result != null);
    }

    public boolean remove(T value) {
        BinaryNode<T> current;
        BinaryNode<T> parent;
        current = find(value).getChildNode();
        parent = find(value).getParentNode();
        if (current == null) {
            return false;
        }
        count--;
        if (current.right == null) {
            if (parent == null) {
                head = current.left;
            } else {
                int result = parent.compareTo(current.value);
                if (result > 0) {
                    parent.left = current.left;
                } else if (result < 0) {
                    parent.right = current.left;
                }
            }
        } else if (current.right.left == null) {
            current.right.left = current.left;
            if (parent == null){
                head =current.right;
            }else {
                int result = parent.compareTo(current.value);
                if (result > 0) {
                    parent.left = current.right;
                } else if (result < 0) {
                    parent.right = current.right;
                }
            }
        }
        return true;
    }

    private BinaryTreeNodeGeneration<T> find(T value) {
        BinaryNode<T> parent = null;
        BinaryNode<T> current = head;
        BinaryTreeNodeGeneration<T> resultGeneration = new BinaryTreeNodeGeneration<T>();
        resultGeneration.setParentNode(null);
        while (current != null) {
            int result = current.compareTo(value);

            if (result > 0) {
                parent = current;
                current = current.left;
            } else if (result < 0) {
                parent = current;
                current = current.right;
            } else {
                break;
            }
        }

        resultGeneration.setChildNode(current);
        resultGeneration.setParentNode(parent);
        return resultGeneration;
    }

    public class BinaryTreeNodeGeneration<T extends Comparable<T>> {
        private BinaryNode<T> parentBinaryNode;
        private BinaryNode<T> childNode;

        public BinaryTreeNodeGeneration() {
            this.parentBinaryNode = null;
            this.childNode = null;
        }

        public BinaryNode<T> getParentNode() {
            return parentBinaryNode;
        }

        public void setParentNode(BinaryNode<T> parentNode) {
            this.parentBinaryNode = parentNode;
        }

        public BinaryNode<T> getChildNode() {
            return childNode;
        }

        public void setChildNode(BinaryNode<T> childNode) {
            this.childNode = childNode;
        }
    }
}

