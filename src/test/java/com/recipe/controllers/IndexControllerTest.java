package com.recipe.controllers;

import com.recipe.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class IndexControllerTest {

    IndexController indexController;

    @Mock
    RecipeService recipeService;
    @Mock
    Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage() {
        String initVal = "index";

        assertEquals(initVal, indexController.getIndexPage(model));
        verify(recipeService, times(1)).getRecioes();
        verify(model, times(1)).addAttribute("recipes", recipeService.getRecioes());
        verify(recipeService, times(2)).getRecioes();
    }
}