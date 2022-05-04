package com.company;

// I Visitor

public interface Visitor {
    void visit(Stuff things);
    void visit(Human human);
}
