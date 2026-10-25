package com.example.ui.navigation

sealed interface Screen {
    data object Home : Screen
    data class Detail(val recipeId: String) : Screen
    data object AddRecipe : Screen
}
