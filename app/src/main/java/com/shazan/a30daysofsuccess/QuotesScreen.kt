package com.shazan.a30daysofsuccess

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.shazan.a30daysofsuccess.model.Quote
import com.shazan.a30daysofsuccess.ui.theme.A30DaysOfSuccessTheme


@Composable
fun QuoteItem(quote: Quote, modifier: Modifier = Modifier) {
    ElevatedCard(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(dimensionResource(R.dimen.card_elevation)),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            DayNumber(
                quote.dayNumber,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

            )
            QuoteImage(
                quote.imageRes,
                modifier = modifier
                    .padding(horizontal = dimensionResource(R.dimen.padding_medium))
                    .clip(MaterialTheme.shapes.small)
                    .height(dimensionResource(R.dimen.image_height)),
            )
            QuoteString(
                quote.quoteRes,
                modifier = modifier.padding(dimensionResource(R.dimen.padding_medium))
            )
        }
    }
}

@Composable
fun DayNumber(dayNumber: Int, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(R.string.day, dayNumber),
        style = MaterialTheme.typography.displaySmall,
    )
}

@Composable
fun QuoteImage(@DrawableRes image: Int, modifier: Modifier = Modifier) {
    Image(
        modifier = modifier,
        painter = painterResource(image),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
fun QuoteString(@StringRes quote: Int, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = stringResource(quote),
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,
    )
}

@Preview
@Composable
private fun QuoteItemPreview() {
    A30DaysOfSuccessTheme {
        QuoteItem(
            Quote(
                dayNumber = 1,
                imageRes = R.drawable.a4russian_ridge_sunset_4652283258_o__large_,
                quoteRes = R.string.day_4_quote
            )
        )
    }
}