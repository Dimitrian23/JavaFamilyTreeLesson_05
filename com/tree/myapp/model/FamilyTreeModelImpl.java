package com.tree.myapp.model;

import com.tree.myapp.entity.Human;
import com.tree.myapp.tree.FamilyTree;

public class FamilyTreeModelImpl implements FamilyTreeModel {
    private FamilyTree<Human> familyTree;

    public FamilyTreeModelImpl() {
        familyTree = new FamilyTree<>();
    }

    @Override
    public void addMember(Human member) {
        familyTree.addMember(member);
    }

    @Override
    public Human findMember(String name) {
        return familyTree.findMember(name);
    }

    @Override
    public void printFamilyTree() {
        familyTree.printFamilyTree();
    }

    @Override
    public void save(String filename) {
        familyTree.save(filename);
    }

    @Override
    public FamilyTree load(String filename) {
        return familyTree.load(filename);
    }

    @Override
    public void sortByName() {
        familyTree.sortByName();
    }

    @Override
    public void sortByBirthDate() {
        familyTree.sortByBirthDate();
    }
}


