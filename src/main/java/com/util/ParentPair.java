package com.util;

public class ParentPair {
    private int node;
    private int parentNode;

    public ParentPair(int node, int parentNode) {
        this.parentNode = parentNode;
        this.node = node;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public int getParentNode() {
        return parentNode;
    }

    public void setParentNode(int parentNode) {
        this.parentNode = parentNode;
    }
}
