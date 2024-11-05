package com.dmsti.snoolezoo.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dmsti.snoolezoo.R
import com.dmsti.snoolezoo.ui.theme.SnoolezooTheme
import com.dmsti.snoolezoo.ui.theme.primary

@Composable
fun SnoolezooSplashScreen(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(primary),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_alarm),
            contentDescription = stringResource(id = R.string.snoolezoo_ic_splash_screen),
            tint = Color.White,
            modifier = Modifier.size(82.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SnoolezooSplashScreenPreview(){
    SnoolezooTheme {
        SnoolezooSplashScreen()
    }
}