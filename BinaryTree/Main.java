package com.company.BinaryTree;

public class Main {
    public static void main(String[] args) {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(15);
        binaryTree.add(5);
        binaryTree.add(20);
        binaryTree.add(8);
        binaryTree.add(12);
        binaryTree.add(18);
        binaryTree.add(21);
        binaryTree.add(10);
        System.out.println(binaryTree.contains(21));
        boolean b =binaryTree.contains(400);
        System.out.println(b);
    }

}
