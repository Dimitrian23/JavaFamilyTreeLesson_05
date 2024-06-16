package com.tree.myapp.model;

import com.tree.myapp.entity.Human;
import com.tree.myapp.tree.FamilyTree;

public interface FamilyTreeModel {
    void addMember(Human member);
    Human findMember(String name);
    void printFamilyTree();
    void save(String filename);
    FamilyTree load(String filename);
    void sortByName();
    void sortByBirthDate();
}