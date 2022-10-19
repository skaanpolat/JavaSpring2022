package Hw3.business;

import Hw3.dataAccess.ICategoryDao;
import Hw3.entities.Category;
import Hw3.logger.ILogger;

import java.util.ArrayList;
import java.util.List;


public class CategoryManager {

    private ICategoryDao categoryDao;
    private ILogger[] loggers;
    private List<Category> existingCategories = new ArrayList<>();

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }


    public void add(Category category) throws Exception {

        if (category.getName().isEmpty()) {
            throw new Exception("Kategori ismi boş olamaz!");
        }

        if (existingCategories.isEmpty()) {
            categoryDao.add(category);
            existingCategories.add(category);
            for (ILogger logger : loggers) {
                logger.log(category.getName());
            }

        } else {

            for (int i = 0; i <= existingCategories.size(); i++) {
                Category currCat = existingCategories.get(i);

                if (currCat.getName().equals(category.getName())) {
                    throw new Exception("Kategori zaten mevcut!");

                } else {

                    categoryDao.add(category);
                    existingCategories.add(category);

                    for (ILogger logger : loggers) {
                        logger.log(category.getName());
                    }
                }

            }
//            for (Category eCategory : existingCategories) {
//
//                if (eCategory.getName().equals(category.getName())) {
//                    throw new Exception("Kategori zaten mevcut!");
//
//                }
//
//                categoryDao.add(category);
//                existingCategories.add(category);
//
//                for (ILogger logger : loggers) {
//                    logger.log(category.getName());
//                }
//
//            }
        }
    }
}

