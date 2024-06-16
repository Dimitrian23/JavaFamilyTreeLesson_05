package com.tree.myapp.view;

import com.tree.myapp.entity.Human;

public interface FamilyTreeView {
    void showMember(Human member);
    void showError(String errorMessage);
   void printFamilyTree();
}