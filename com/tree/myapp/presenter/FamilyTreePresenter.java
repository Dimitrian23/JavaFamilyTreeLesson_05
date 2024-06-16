package com.tree.myapp.presenter;

import com.tree.myapp.entity.Human;
import com.tree.myapp.tree.FamilyTree;
import com.tree.myapp.model.FamilyTreeModel;
import com.tree.myapp.view.FamilyTreeView;

public class FamilyTreePresenter {
    private FamilyTreeModel model;
    private FamilyTreeView view;

    public FamilyTreePresenter(FamilyTreeModel model, FamilyTreeView view) {
        this.model = model;
        this.view = view;
    }

    public void addMember(Human member) {
        model.addMember(member);
    }

    public void findMember(String name) {
        Human member = model.findMember(name);
        if (member != null) {
            view.showMember(member);
        } else {
            view.showError("Member not found");
        }
    }

    public void printFamilyTree() {
        model.printFamilyTree();
    }

    public void save(String filename) {
        model.save(filename);
    }

    public void load(String filename) {
        FamilyTree tree = model.load(filename);
        if (tree == null) {
            view.showError("Failed to load family tree");
        }
    }

    public void sortByName() {
        model.sortByName();
    }

    public void sortByBirthDate() {
        model.sortByBirthDate();
    }
}
