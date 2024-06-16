package com.tree.myapp;

import com.tree.myapp.tree.FamilyTree;

public interface Writable<T extends CombinedInterfaceCSN<T>> {

     void save(FamilyTree<T> tree, String filename);

     FamilyTree<T> load(String filename);
}
