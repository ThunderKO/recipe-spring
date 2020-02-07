package com.andykoting.recipe.repositories;

import com.andykoting.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
