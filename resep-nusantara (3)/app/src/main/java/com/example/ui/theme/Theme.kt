package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme =
    darkColorScheme(
        primary = TerracottaPrimaryDark,
        onPrimary = TerracottaOnContainer,
        primaryContainer = TerracottaContainerDark,
        onPrimaryContainer = TerracottaContainer,
        secondary = AmberSecondaryContainer,
        onSecondary = AmberOnSecondaryContainer,
        tertiary = PandanTertiaryContainer,
        background = FoodDarkBackground,
        surface = FoodDarkSurface,
        surfaceVariant = FoodDarkSurfaceVariant,
        onBackground = FoodDarkOnSurface,
        onSurface = FoodDarkOnSurface,
        onSurfaceVariant = FoodDarkOnSurfaceVariant,
        outline = FoodOutline,
        outlineVariant = FoodOutlineVariant
    )

private val LightColorScheme =
    lightColorScheme(
        primary = TerracottaPrimary,
        onPrimary = TerracottaOnPrimary,
        primaryContainer = TerracottaContainer,
        onPrimaryContainer = TerracottaOnContainer,
        secondary = AmberSecondary,
        onSecondary = AmberOnSecondary,
        secondaryContainer = AmberSecondaryContainer,
        onSecondaryContainer = AmberOnSecondaryContainer,
        tertiary = PandanTertiary,
        onTertiary = PandanOnTertiary,
        tertiaryContainer = PandanTertiaryContainer,
        onTertiaryContainer = PandanOnTertiaryContainer,
        background = FoodWarmBackground,
        surface = FoodWarmSurface,
        surfaceVariant = FoodSurfaceVariant,
        onBackground = FoodOnSurface,
        onSurface = FoodOnSurface,
        onSurfaceVariant = FoodOnSurfaceVariant,
        outline = FoodOutline,
        outlineVariant = FoodOutlineVariant
    )

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Use custom culinary palette by default for rich appetizing visual identity
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
  val colorScheme =
      when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
          val context = LocalContext.current
          if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
      }

  MaterialTheme(
      colorScheme = colorScheme,
      typography = Typography,
      content = content
  )
}
