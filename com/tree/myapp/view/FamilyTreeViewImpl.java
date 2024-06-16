package com.tree.myapp.view;

import com.tree.myapp.entity.Human;
import com.tree.myapp.presenter.FamilyTreePresenter;

public class FamilyTreeViewImpl implements FamilyTreeView {

    private FamilyTreePresenter presenter;

    @Override
    public void showMember(Human member) {
        System.out.println(member);
    }

    @Override
    public void showError(String errorMessage) {
        System.err.println("Error: " + errorMessage);
    }

    @Override
    public void printFamilyTree() {
        presenter.printFamilyTree();
    }

}
