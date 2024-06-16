package com.tree.myapp.handler;

import com.tree.myapp.CombinedInterfaceCSN;
import com.tree.myapp.tree.FamilyTree;
import com.tree.myapp.Writable;

import java.io.*;
import java.util.List;

public class FileHandler<T extends CombinedInterfaceCSN<T>> implements Writable {
    @Override
    public void save(FamilyTree tree, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(tree.getFamilyMembers());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public FamilyTree<T> load(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<T> familyMembers = (List<T>) ois.readObject();
            FamilyTree<T> loadedTree = new FamilyTree<>();
            loadedTree.getFamilyMembers().addAll(familyMembers);
            return loadedTree;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
