package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.RestaurantMenu
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddRecipeScreen(
    onBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    BackHandler(onBack = onBack)

    val scrollState = rememberScrollState()

    var title by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("") }
    var cookingTime by remember { mutableStateOf("") }
    var servings by remember { mutableStateOf("") }
    var ingredients by remember { mutableStateOf("") }
    var steps by remember { mutableStateOf("") }

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Tambah Resep",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.SemiBold
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.testTag("add_recipe_back_btn")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Kembali"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { innerPadding ->
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            val isTablet = maxWidth >= 600.dp

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .widthIn(max = if (isTablet) 860.dp else 600.dp)
                        .padding(horizontal = if (isTablet) 32.dp else 16.dp, vertical = 16.dp)
                        .testTag("add_recipe_form_column")
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("add_recipe_card"),
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.surface
                        ),
                        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(if (isTablet) 24.dp else 16.dp)
                        ) {
                            Text(
                                text = "Formulir Resep Baru",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(14.dp))

                            if (isTablet) {
                                // Form Layout 2 Kolom untuk Tablet
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                                ) {
                                    // Kolom Kiri
                                    Column(modifier = Modifier.weight(1f)) {
                                        OutlinedTextField(
                                            value = title,
                                            onValueChange = { title = it },
                                            label = { Text("Judul Resep") },
                                            placeholder = { Text("Contoh: Soto Ayam") },
                                            leadingIcon = {
                                                Icon(Icons.Default.Restaurant, contentDescription = null)
                                            },
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .testTag("input_recipe_title"),
                                            shape = RoundedCornerShape(8.dp),
                                            singleLine = true
                                        )

                                        Spacer(modifier = Modifier.height(10.dp))

                                        OutlinedTextField(
                                            value = category,
                                            onValueChange = { category = it },
                                            label = { Text("Kategori") },
                                            placeholder = { Text("Contoh: Sup, Daging, Nasi") },
                                            leadingIcon = {
                                                Icon(Icons.Default.RestaurantMenu, contentDescription = null)
                                            },
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .testTag("input_recipe_category"),
                                            shape = RoundedCornerShape(8.dp),
                                            singleLine = true
                                        )

                                        Spacer(modifier = Modifier.height(10.dp))

                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                                        ) {
                                            OutlinedTextField(
                                                value = cookingTime,
                                                onValueChange = { cookingTime = it },
                                                label = { Text("Waktu (menit)") },
                                                placeholder = { Text("30") },
                                                leadingIcon = {
                                                    Icon(Icons.Default.Schedule, contentDescription = null)
                                                },
                                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                                modifier = Modifier
                                                    .weight(1f)
                                                    .testTag("input_cooking_time"),
                                                shape = RoundedCornerShape(8.dp),
                                                singleLine = true
                                            )

                                            OutlinedTextField(
                                                value = servings,
                                                onValueChange = { servings = it },
                                                label = { Text("Porsi (orang)") },
                                                placeholder = { Text("4") },
                                                leadingIcon = {
                                                    Icon(Icons.Default.People, contentDescription = null)
                                                },
                                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                                modifier = Modifier
                                                    .weight(1f)
                                                    .testTag("input_servings"),
                                                shape = RoundedCornerShape(8.dp),
                                                singleLine = true
                                            )
                                        }
                                    }

                                    // Kolom Kanan
                                    Column(modifier = Modifier.weight(1f)) {
                                        OutlinedTextField(
                                            value = ingredients,
                                            onValueChange = { ingredients = it },
                                            label = { Text("Bahan-Bahan") },
                                            placeholder = { Text("Tuliskan bahan-bahan yang dibutuhkan...") },
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .testTag("input_ingredients"),
                                            shape = RoundedCornerShape(8.dp),
                                            minLines = 3,
                                            maxLines = 5
                                        )

                                        Spacer(modifier = Modifier.height(10.dp))

                                        OutlinedTextField(
                                            value = steps,
                                            onValueChange = { steps = it },
                                            label = { Text("Langkah Pembuatan") },
                                            placeholder = { Text("Tuliskan cara memasak langkah demi langkah...") },
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .testTag("input_steps"),
                                            shape = RoundedCornerShape(8.dp),
                                            minLines = 3,
                                            maxLines = 5
                                        )
                                    }
                                }
                            } else {
                                // Form Layout 1 Kolom untuk Ponsel
                                OutlinedTextField(
                                    value = title,
                                    onValueChange = { title = it },
                                    label = { Text("Judul Resep") },
                                    placeholder = { Text("Contoh: Soto Ayam") },
                                    leadingIcon = {
                                        Icon(Icons.Default.Restaurant, contentDescription = null)
                                    },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("input_recipe_title"),
                                    shape = RoundedCornerShape(8.dp),
                                    singleLine = true
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                OutlinedTextField(
                                    value = category,
                                    onValueChange = { category = it },
                                    label = { Text("Kategori") },
                                    placeholder = { Text("Contoh: Sup, Daging, Nasi") },
                                    leadingIcon = {
                                        Icon(Icons.Default.RestaurantMenu, contentDescription = null)
                                    },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("input_recipe_category"),
                                    shape = RoundedCornerShape(8.dp),
                                    singleLine = true
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    OutlinedTextField(
                                        value = cookingTime,
                                        onValueChange = { cookingTime = it },
                                        label = { Text("Waktu (menit)") },
                                        placeholder = { Text("30") },
                                        leadingIcon = {
                                            Icon(Icons.Default.Schedule, contentDescription = null)
                                        },
                                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                        modifier = Modifier
                                            .weight(1f)
                                            .testTag("input_cooking_time"),
                                        shape = RoundedCornerShape(8.dp),
                                        singleLine = true
                                    )

                                    OutlinedTextField(
                                        value = servings,
                                        onValueChange = { servings = it },
                                        label = { Text("Porsi (orang)") },
                                        placeholder = { Text("4") },
                                        leadingIcon = {
                                            Icon(Icons.Default.People, contentDescription = null)
                                        },
                                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                        modifier = Modifier
                                            .weight(1f)
                                            .testTag("input_servings"),
                                        shape = RoundedCornerShape(8.dp),
                                        singleLine = true
                                    )
                                }

                                Spacer(modifier = Modifier.height(10.dp))

                                OutlinedTextField(
                                    value = ingredients,
                                    onValueChange = { ingredients = it },
                                    label = { Text("Bahan-Bahan") },
                                    placeholder = { Text("Tuliskan bahan-bahan yang dibutuhkan...") },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("input_ingredients"),
                                    shape = RoundedCornerShape(8.dp),
                                    minLines = 3,
                                    maxLines = 6
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                OutlinedTextField(
                                    value = steps,
                                    onValueChange = { steps = it },
                                    label = { Text("Langkah Pembuatan") },
                                    placeholder = { Text("Tuliskan cara memasak langkah demi langkah...") },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .testTag("input_steps"),
                                    shape = RoundedCornerShape(8.dp),
                                    minLines = 3,
                                    maxLines = 6
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // 2 Jenis Tombol: Button (Filled) dan OutlinedButton
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = onBack,
                            modifier = Modifier
                                .weight(1f)
                                .testTag("btn_cancel_add_recipe"),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Batal")
                        }

                        Button(
                            onClick = {
                                // Tampilan saja tanpa fungsi CRUD
                                onBack()
                            },
                            modifier = Modifier
                                .weight(1f)
                                .testTag("btn_save_recipe"),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Simpan")
                        }
                    }
                }
            }
        }
    }
}
