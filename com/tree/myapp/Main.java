package com.tree.myapp;

import com.tree.myapp.entity.Gender;
import com.tree.myapp.entity.Human;
import com.tree.myapp.model.FamilyTreeModel;
import com.tree.myapp.model.FamilyTreeModelImpl;
import com.tree.myapp.presenter.FamilyTreePresenter;
import com.tree.myapp.view.FamilyTreeView;
import com.tree.myapp.view.FamilyTreeViewImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTreeModel model = new FamilyTreeModelImpl();
        FamilyTreeView view = new FamilyTreeViewImpl();
        FamilyTreePresenter presenter = new FamilyTreePresenter(model, view);

        // Добавление членов семьи
        presenter.addMember(new Human("John Doe", Gender.MALE, LocalDate.of(1980, 1, 1)));
        presenter.addMember(new Human("Jane Doe", Gender.FEMALE, LocalDate.of(1985, 1, 1)));

        // Поиск члена семьи
        presenter.findMember("John Doe");
        
        // Вывод всего дерева
        presenter.printFamilyTree();

        // Сортировка по имени
        presenter.sortByName();

        // Сортировка по дате рождения
        presenter.sortByBirthDate();

        // Сохранение дерева в файл
        presenter.save("family_tree.ser");

        // Загрузка дерева из файла
        presenter.load("family_tree.ser");
    }
}
