package co.edu.co.login.model.repository;

import co.edu.co.login.model.beans.Category;

import java.sql.SQLException;

public class TestCategoryRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<Category> repository = new CategoryRepositoryImpl();
        System.out.println("========== saveObj Insert =========="); // insert
        Category categoryInsert = new Category();
        categoryInsert.setCategory_name("Jabones");
        repository.saveObj(categoryInsert);
        categoryInsert.setCategory_name("Carnes");
        repository.saveObj(categoryInsert);


        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ==========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj =========="); //update
        Category categoryUpdate = new Category();
        categoryUpdate.setCategory_id(2);
        categoryUpdate.setCategory_name("Pan");
        repository.saveObj(categoryUpdate);
        repository.listAllObj().forEach(System.out::println);

        System.out.println("========== saveObj =========="); //delete
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    } // TestCategoryRepositoryImpl
}

