package com.example.data

import androidx.annotation.DrawableRes
import com.example.R

data class Recipe(
    val id: String,
    val title: String,
    val category: String,
    val timeMinutes: Int,
    val servings: Int,
    val difficulty: String,
    val rating: Float,
    val reviewsCount: Int,
    val description: String,
    @DrawableRes val imageRes: Int,
    val calories: String,
    val origin: String,
    val ingredients: List<String>,
    val steps: List<String>,
    val tips: String
)

object SampleRecipes {
    val list = listOf(
        Recipe(
            id = "rendang-sapi",
            title = "Rendang Daging Sapi Padang",
            category = "Daging",
            timeMinutes = 180,
            servings = 6,
            difficulty = "Mahir",
            rating = 4.9f,
            reviewsCount = 384,
            description = "Masakan daging sapi asli Minangkabau yang dimasak perlahan dengan santan dan rempah-rempah beraroma pekat hingga berwarna cokelat gelap karamel.",
            imageRes = R.drawable.res_rendang,
            calories = "460 kkal",
            origin = "Sumatera Barat",
            ingredients = listOf(
                "1 kg Daging Sapi gandik/paha, potong kotak tebal",
                "1.000 ml Santan kental dari 3 butir kelapa tua",
                "1.000 ml Santan encer",
                "4 batang Serai, memarkan",
                "6 lembar Daun jeruk purut segar",
                "2 lembar Daun kunyit, simpulkan",
                "3 buah Asam kandis",
                "15 butir Bawang merah & 8 siung Bawang putih",
                "150 gram Cabai merah keriting",
                "3 cm Jahe, 4 cm Lengkuas & 3 cm Kunyit bakar",
                "1 sdm Ketumbar bubuk & 1/2 sdt Pala bubuk",
                "Garam dan penyedap rasa secukupnya"
            ),
            steps = listOf(
                "Haluskan bumbu halus: bawang merah, bawang putih, cabai merah, jahe, lengkuas, kunyit, dan ketumbar.",
                "Tuang santan encer ke dalam wajan besar, masukkan bumbu halus, serai, daun jeruk, dan daun kunyit. Masak sambil diaduk hingga mendidih.",
                "Masukkan potongan daging sapi, aduk perlahan dengan api sedang hingga daging berubah warna dan kuah mulai menyusut.",
                "Tuangkan santan kental dan asam kandis. Masak dengan api kecil sambil sesekali diaduk rata agar santan tidak pecah.",
                "Teruskan proses memasak (kalio) hingga santan mengering, mengeluarkan minyak alami, dan bumbu meresap kecokelatan kehitaman.",
                "Angkat dan sajikan Rendang Padang bersama nasi hangat."
            ),
            tips = "Gunakan daging bagian paha (gandik) agar serat daging tidak mudah hancur saat diaduk lama. Masak dengan api lilin kecil pada tahap akhir."
        ),
        Recipe(
            id = "nasi-goreng-spesial",
            title = "Nasi Goreng Spesial Kampung",
            category = "Nasi",
            timeMinutes = 25,
            servings = 2,
            difficulty = "Mudah",
            rating = 4.8f,
            reviewsCount = 512,
            description = "Nasi goreng aroma smokey khas wajan besi dengan topping telur mata sapi, sate ayam bumbu kacang, acar segar, dan kerupuk renyah.",
            imageRes = R.drawable.res_nasi_goreng,
            calories = "380 kkal",
            origin = "Jawa",
            ingredients = listOf(
                "2 piring Nasi putih pera dingin (sebaiknya nasi kemarin)",
                "2 butir Telur ayam (1 diorak-arik, 1 diceplok)",
                "100 gram Daging ayam suwir atau udang kupas",
                "3 siung Bawang putih & 5 butir Bawang merah",
                "3 buah Cabai merah keriting & 2 buah Cabai rawit",
                "1 sdm Terasi bakar",
                "2 sdm Kecap manis berkualitas",
                "1 sdm Saus tiram & 1 sdt Minyak wijen",
                "1 batang Daun bawang, iris tipis",
                "Minyak goreng, garam, dan lada secukupnya",
                "Pelengkap: Timun, tomat, kerupuk udang, bawang goreng"
            ),
            steps = listOf(
                "Ulek kasar bawang merah, bawang putih, cabai keriting, dan terasi bakar.",
                "Panaskan minyak dalam wajan, tumis bumbu halus hingga harum dan matang.",
                "Sisihkan bumbu di tepi wajan, ceplok 1 butir telur lalu orak-arik hingga setengah matang.",
                "Masukkan ayam suwir/udang, aduk merata bersama bumbu.",
                "Masukkan nasi putih dingin, besarkan api wajan. Aduk cepat agar nasi tidak menggumpal.",
                "Tambahkan kecap manis, saus tiram, minyak wijen, garam, dan lada. Aduk merata hingga nasi terbalut bumbu dan agak berasap (smokey).",
                "Taburkan irisan daun bawang, aduk sebentar, lalu angkat.",
                "Sajikan di piring beralas daun pisang bersama telur ceplok dan sate ayam."
            ),
            tips = "Gunakan nasi yang sudah diinapkan di kulkas semalaman agar bulir nasi tidak lembek dan hasil gorengan terasa kesat gurih."
        ),
        Recipe(
            id = "soto-ayam-lamongan",
            title = "Soto Ayam Lamongan Koya Gurih",
            category = "Sup",
            timeMinutes = 50,
            servings = 4,
            difficulty = "Sedang",
            rating = 4.9f,
            reviewsCount = 276,
            description = "Kuah kuning kunyit gurih kaya kaldu ayam kampung berpadu serbuk koya kerupuk udang yang melegenda dan perasan jeruk nipis segar.",
            imageRes = R.drawable.res_soto_ayam,
            calories = "310 kkal",
            origin = "Jawa Timur",
            ingredients = listOf(
                "1/2 ekor Ayam kampung segar",
                "1.500 ml Air kaldu ayam",
                "3 batang Serai memarkan & 4 lembar Daun jeruk",
                "2 lembar Daun salam & 1 batang Daun bawang utuh",
                "8 butir Bawang merah & 5 siung Bawang putih",
                "4 butir Kemiri sangrai & 3 cm Kunyit bakar",
                "2 cm Jahe & 1 sdt Ketumbar sangrai",
                "Bahan Koya: 5 keping kerupuk udang goreng + 3 siung bawang putih goreng dihaluskan",
                "Pelengkap: Soun, tauge, kol iris, telur rebus, sambal cabai rawit, jeruk nipis"
            ),
            steps = listOf(
                "Rebus ayam kampung dalam air mendidih bersama daun salam dan serai hingga keluar kaldu gurih.",
                "Haluskan bumbu kuning: bawang merah, bawang putih, kemiri, kunyit, jahe, ketumbar, garam, dan lada.",
                "Tumis bumbu halus bersama daun jeruk hingga harum matang, lalu masukkan ke dalam panci rebusan kaldu ayam.",
                "Masak dengan api sedang hingga bumbu meresap ke dalam daging ayam. Angkat ayam, tiriskan lalu goreng sebentar dan suwir-suwir.",
                "Tata di mangkuk saji: soun, irisan kol, tauge, dan ayam suwir.",
                "Siram dengan kuah soto panas yang harum.",
                "Beri taburan seledri, bawang goreng, dan 1-2 sendok serbuk koya gurih.",
                "Sajikan selagi hangat bersama sambal dan perasan jeruk nipis."
            ),
            tips = "Rahasianya ada pada bubuk koya dari kerupuk udang asli dan bawang putih goreng renyah yang membuat kuah menjadi kental sedap."
        ),
        Recipe(
            id = "sate-ayam-madura",
            title = "Sate Ayam Madura Saus Kacang",
            category = "Sate",
            timeMinutes = 40,
            servings = 4,
            difficulty = "Sedang",
            rating = 4.9f,
            reviewsCount = 420,
            description = "Daging ayam empuk gurih yang dibakar diatas bara arang, dibalur bumbu kacang tanah gurih kental dan kecap manis serta bawang merah renyah.",
            imageRes = R.drawable.res_sate_ayam,
            calories = "420 kkal",
            origin = "Madura",
            ingredients = listOf(
                "500 gram Daging dada/paha fillet ayam, potong dadu",
                "20-25 tusuk Sate bambu (rendam air agar tidak gosong)",
                "200 gram Kacang tanah kulit, goreng dan haluskan",
                "4 siung Bawang putih & 5 butir Bawang merah",
                "3 butir Kemiri sangrai & 2 buah Cabai merah",
                "50 gram Gula merah sisir",
                "4 sdm Kecap manis istimewa",
                "1 sdm Air asam jawa",
                "300 ml Air matang",
                "Pelengkap: Lontong/nasi putih, irisan bawang merah, cabai rawit, jeruk limau"
            ),
            steps = listOf(
                "Tusuk 3-4 potongan daging ayam pada setiap tusuk sate secara rapi.",
                "Haluskan bumbu kacang: bawang putih, kemiri, cabai merah, dan gula merah.",
                "Tumis bumbu kacang, masukkan kacang tanah halus, air asam jawa, kecap manis, dan air. Masak dengan api kecil hingga berminyak dan kental.",
                "Ambil 3 sdm bumbu kacang, campur dengan 2 sdm kecap manis dan 1 sdm minyak untuk bumbu olesan bakar.",
                "Celupkan sate ayam ke dalam bumbu olesan.",
                "Bakar sate di atas panggangan/bara arang sambil dibolak-balik hingga matang kecokelatan beraroma harum.",
                "Tata sate ayam di piring saji, siram dengan saus kacang hangat dan kecap manis.",
                "Taburi bawang goreng, irisan bawang merah mentah, dan kucuran jeruk limau."
            ),
            tips = "Rendam tusuk sate dalam air selama 15 menit sebelum digunakan agar tidak cepat terbakar dan arang memberi aroma asap khas."
        )
    )
}
