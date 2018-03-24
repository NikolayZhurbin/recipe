package com.recipe.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;
    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long initVal = 4L;

        category.setId(initVal);
        assertEquals(initVal, category.getId());

    }

    @Test
    public void getRecipes() {
    }

    @Test
    public void getDescription() {
    }
}