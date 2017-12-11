package com.training.shoppingbackend.dao;

import java.util.List;

import com.training.shoppingbackend.dto.Category;

public interface CategoryDao {

	List<Category> list();
	Category get(int id);
}
