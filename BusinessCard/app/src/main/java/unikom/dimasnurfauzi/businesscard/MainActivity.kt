package unikom.dimasnurfauzi.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import unikom.dimasnurfauzi.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(CardBackground),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        ProfileSection()
        Spacer(modifier = Modifier.weight(1f))
        ContactSection()
        Spacer(modifier = Modifier.height(64.dp))
    }
}

@Composable
private fun ProfileSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier = Modifier.size(112.dp)
        )
        Text(
            text = "Dimas Nurfauzi",
            color = Color(0xFF111D18),
            fontSize = 56.sp,
            fontWeight = FontWeight.Light
        )
        Text(
            text = "Android Developer Extraordinaire",
            color = AndroidGreen,
            fontSize = 19.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun ContactSection() {
    Column(
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        ContactRow(
            icon = PhoneIcon,
            iconDescription = "Phone number",
            text = "+62 817 1888 9900"
        )
        ContactRow(
            icon = ShareIcon,
            iconDescription = "Social media handle",
            text = "@clopst"
        )
        ContactRow(
            icon = EmailIcon,
            iconDescription = "Email address",
            text = "clopst@android.com"
        )
    }
}

@Composable
private fun ContactRow(
    icon: ImageVector,
    iconDescription: String,
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.width(360.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = iconDescription,
            tint = AndroidGreen,
            modifier = Modifier.size(28.dp)
        )
        Spacer(modifier = Modifier.width(36.dp))
        Text(
            text = text,
            color = Color(0xFF111D18),
            fontSize = 21.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}

private val CardBackground = Color(0xFFD2E8D4)
private val AndroidGreen = Color(0xFF087A42)

private val PhoneIcon = ImageVector.Builder(
    name = "Phone",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f
).apply {
    path(fill = SolidColor(AndroidGreen)) {
        moveTo(6.62f, 10.79f)
        curveTo(8.06f, 13.62f, 10.38f, 15.93f, 13.21f, 17.38f)
        lineTo(15.41f, 15.18f)
        curveTo(15.68f, 14.91f, 16.08f, 14.82f, 16.43f, 14.94f)
        curveTo(17.55f, 15.31f, 18.75f, 15.5f, 20f, 15.5f)
        curveTo(20.55f, 15.5f, 21f, 15.95f, 21f, 16.5f)
        verticalLineTo(20f)
        curveTo(21f, 20.55f, 20.55f, 21f, 20f, 21f)
        curveTo(10.61f, 21f, 3f, 13.39f, 3f, 4f)
        curveTo(3f, 3.45f, 3.45f, 3f, 4f, 3f)
        horizontalLineTo(7.5f)
        curveTo(8.05f, 3f, 8.5f, 3.45f, 8.5f, 4f)
        curveTo(8.5f, 5.25f, 8.69f, 6.45f, 9.06f, 7.57f)
        curveTo(9.17f, 7.92f, 9.09f, 8.31f, 8.81f, 8.59f)
        lineTo(6.62f, 10.79f)
        close()
    }
}.build()

private val ShareIcon = ImageVector.Builder(
    name = "Share",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f
).apply {
    path(fill = SolidColor(AndroidGreen)) {
        moveTo(18f, 16.08f)
        curveTo(17.24f, 16.08f, 16.56f, 16.38f, 16.04f, 16.86f)
        lineTo(8.91f, 12.71f)
        curveTo(8.96f, 12.48f, 9f, 12.24f, 9f, 12f)
        curveTo(9f, 11.76f, 8.96f, 11.52f, 8.91f, 11.29f)
        lineTo(15.96f, 7.18f)
        curveTo(16.5f, 7.68f, 17.21f, 8f, 18f, 8f)
        curveTo(19.66f, 8f, 21f, 6.66f, 21f, 5f)
        curveTo(21f, 3.34f, 19.66f, 2f, 18f, 2f)
        curveTo(16.34f, 2f, 15f, 3.34f, 15f, 5f)
        curveTo(15f, 5.24f, 15.04f, 5.48f, 15.09f, 5.71f)
        lineTo(8.04f, 9.82f)
        curveTo(7.5f, 9.32f, 6.79f, 9f, 6f, 9f)
        curveTo(4.34f, 9f, 3f, 10.34f, 3f, 12f)
        curveTo(3f, 13.66f, 4.34f, 15f, 6f, 15f)
        curveTo(6.79f, 15f, 7.5f, 14.68f, 8.04f, 14.18f)
        lineTo(15.16f, 18.34f)
        curveTo(15.11f, 18.55f, 15.08f, 18.77f, 15.08f, 19f)
        curveTo(15.08f, 20.61f, 16.39f, 21.92f, 18f, 21.92f)
        curveTo(19.61f, 21.92f, 20.92f, 20.61f, 20.92f, 19f)
        curveTo(20.92f, 17.39f, 19.61f, 16.08f, 18f, 16.08f)
        close()
    }
}.build()

private val EmailIcon = ImageVector.Builder(
    name = "Email",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f
).apply {
    path(fill = SolidColor(AndroidGreen)) {
        moveTo(20f, 4f)
        horizontalLineTo(4f)
        curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
        lineTo(2f, 18f)
        curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
        horizontalLineTo(20f)
        curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
        verticalLineTo(6f)
        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
        close()
        moveTo(20f, 8f)
        lineTo(12f, 13f)
        lineTo(4f, 8f)
        verticalLineTo(6f)
        lineTo(12f, 11f)
        lineTo(20f, 6f)
        verticalLineTo(8f)
        close()
    }
}.build()
