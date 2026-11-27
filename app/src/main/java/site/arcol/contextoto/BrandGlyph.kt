package site.arcol.contextoto

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
internal fun BrandGlyph(
    @DrawableRes drawable: Int,
    tint: Color,
    modifier: Modifier = Modifier,
    size: Dp = 24.dp,
    description: String? = null,
) {
    Icon(painterResource(drawable), description, modifier.size(size), tint)
}
