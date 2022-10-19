package Hw3.dataAccess;

import Hw3.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) throws Exception {
        System.out.println("\n=> " +category.getName() + " Hibernate ile eklenmiştir.");
    }
}
