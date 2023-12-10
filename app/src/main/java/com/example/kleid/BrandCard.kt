package com.example.kleid

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BrandsCard(@DrawableRes img: Int) {
    ElevatedCard(
        elevation = cardElevation(
            defaultElevation = 50.dp,
        ),
        shape = RoundedCornerShape(15.dp),
    ) {
        Image(
            painter = painterResource(img),
            contentDescription = null,
            modifier = Modifier.size(80.dp),

        )
    }
}

@Preview
@Composable
fun CardPreview() {
    Column {
        BrandsCard(img = R.drawable.zalando)
        BrandsCard(img = R.drawable.c_a)
        BrandsCard(img = R.drawable.h_m_logo_svg)
        BrandsCard(img = R.drawable.zara_new)
    }
}
