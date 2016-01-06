package com.vygutis;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "5 8 4 7 9 6 1 2 3";
        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());
    }
}
