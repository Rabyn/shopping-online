package com.training.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.shoppingbackend.dao.CategoryDao;
import com.training.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();
		
		// Adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some Description for Television");
		category.setImageUrl("cat_1.png");

		categories.add(category);

		// Adding Second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some Description for Mobile");
		category.setImageUrl("cat_2.png");

		categories.add(category);

		// Adding Third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some Description for Laptop");
		category.setImageUrl("cat_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {	
		// Enhanced for loop
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
