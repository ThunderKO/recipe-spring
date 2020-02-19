package com.andykoting.recipe.services;

import com.andykoting.recipe.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipe();

    Recipe findById(Long l);

}
