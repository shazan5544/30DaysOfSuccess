package com.shazan.a30daysofsuccess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import com.shazan.a30daysofsuccess.model.DataSource.quotes
import com.shazan.a30daysofsuccess.ui.theme.A30DaysOfSuccessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            A30DaysOfSuccessTheme {
                QuoteApp()
            }
        }
    }
}

@Composable
fun QuoteApp() {
    Scaffold(
        modifier = Modifier.windowInsetsPadding(WindowInsets.safeDrawing),
        topBar = {
            QuoteTopAppBar()
        }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            items(quotes) { quote ->
                QuoteItem(
                    quote = quote,
                    modifier = Modifier.padding(
                        horizontal = dimensionResource(R.dimen.padding_medium),
                        vertical = dimensionResource(R.dimen.padding_small)
                    )
                )
            }
        }
    }
}

//@Preview(showSystemUi = true, device = "spec:width=673dp,height=841dp")
@PreviewScreenSizes
@Composable
private fun QuoteAppPreview() {
    A30DaysOfSuccessTheme {
        QuoteApp()
    }
}

@Preview(showSystemUi = true, device = "spec:width=673dp,height=841dp")
@Composable
private fun QuoteAppDarkPreview() {
    A30DaysOfSuccessTheme(darkTheme = true) {
        QuoteApp()
    }
}