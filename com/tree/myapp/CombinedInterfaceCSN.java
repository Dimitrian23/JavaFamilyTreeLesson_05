package com.tree.myapp;

import java.io.Serializable;


public interface CombinedInterfaceCSN<T> extends Comparable<T>,
        Serializable,
        Nameable {

}


//Реализовать паттерн MVP в вашем проекте с семейным деревом