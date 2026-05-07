package unikom.dimasnurfauzi.digiteam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.automirrored.filled.LibraryBooks
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.DataUsage
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.TaskAlt
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import unikom.dimasnurfauzi.digiteam.ui.theme.DigiTeamTheme

private val AppBackground = Color(0xFFF7F7F7)
private val BrandGreen = Color(0xFF05A357)
private val BrandGreenDark = Color(0xFF008A46)
private val BrandGreenLight = Color(0xFFE5F8EE)
private val TextPrimary = Color(0xFF111111)
private val TextSecondary = Color(0xFF606060)
private val TextMuted = Color(0xFFA2A2A2)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DigiTeamTheme {
                DigiTeamApp()
            }
        }
    }
}

@Composable
private fun DigiTeamApp() {
    Surface(color = AppBackground, modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Spacer(modifier = Modifier.height(4.dp))
                BrandBanner()
                UserProfile()
                WorkHoursCard()
                ReportCard()
                Spacer(modifier = Modifier.height(4.dp))
            }
            BottomMenu()
        }
    }
}

@Composable
private fun BrandBanner() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(78.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(BrandGreenLight)
            .padding(horizontal = 26.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        DigiTeamLogo(modifier = Modifier.size(34.dp))
        Spacer(modifier = Modifier.width(14.dp))
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = "DigiTeam",
                color = TextPrimary,
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp,
                letterSpacing = 0.sp
            )
            Text(
                text = "Digital Together Everyone Achieve More",
                color = TextSecondary,
                fontSize = 8.sp,
                letterSpacing = 0.sp
            )
            Text(
                text = "Jabar Digital Service",
                color = TextMuted,
                fontSize = 8.sp,
                letterSpacing = 0.sp
            )
        }
    }
}

@Composable
private fun DigiTeamLogo(modifier: Modifier = Modifier) {
    Icon(
        imageVector = Icons.Filled.DataUsage,
        contentDescription = "DigiTeam",
        modifier = modifier,
        tint = BrandGreen
    )
}

@Composable
private fun UserProfile() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Avatar(modifier = Modifier.size(40.dp))
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(
                text = "Dias Eka Fredianto, S.Kom, B.IT",
                color = TextPrimary,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                letterSpacing = 0.sp
            )
            Text(
                text = "UI Designer",
                color = TextSecondary,
                fontSize = 9.sp,
                letterSpacing = 0.sp
            )
        }
    }
}

@Composable
private fun Avatar(modifier: Modifier = Modifier) {
    Icon(
        imageVector = Icons.Filled.AccountCircle,
        contentDescription = "Profile",
        modifier = modifier.clip(CircleShape)
    )
}

@Composable
private fun WorkHoursCard() {
    DashboardCard {
        Text(
            text = "Jam Kerja Bulan Ini",
            color = TextPrimary,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            letterSpacing = 0.sp
        )
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            text = "Jam kerja kamu bulan ini: 130.53 Jam",
            color = Color(0xFF008ED1),
            fontWeight = FontWeight.Bold,
            fontSize = 9.sp,
            letterSpacing = 0.sp
        )
        Spacer(modifier = Modifier.height(7.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(34.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(BrandGreen)
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "130.53 JAM",
                modifier = Modifier.weight(1f),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                letterSpacing = 0.sp
            )
            MiniClock(modifier = Modifier.size(15.dp))
        }
        Spacer(modifier = Modifier.height(9.dp))
        Text(
            text = "Batas Minimum Jam Kerja 170 Jam/bulan",
            color = TextMuted,
            fontSize = 8.sp,
            letterSpacing = 0.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        GreenButton(text = "Checkin")
    }
}

@Composable
private fun MiniClock(modifier: Modifier = Modifier) {
    Icon(
        imageVector = Icons.Filled.AccessTime,
        contentDescription = "Time",
        modifier = modifier,
        tint = Color.White
    )
}

@Composable
private fun ReportCard() {
    DashboardCard {
        Text(
            text = "Laporan Kamu",
            color = TextPrimary,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            letterSpacing = 0.sp
        )
        Spacer(modifier = Modifier.height(22.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            MonthHeatMap(
                month = "Maret",
                colors = listOf(
                    1, 2, 2, 3, 3,
                    3, 3, 1, 1, 3,
                    3, 3, 1, 3, 0,
                    3, 3, 1, 1, 3,
                    1, 1, 1, 3, 3,
                    3, 3, 3, 3, 1,
                    3, 0, 0, 0, 0
                ),
                modifier = Modifier.weight(1f)
            )
            MonthHeatMap(
                month = "April",
                colors = listOf(
                    3, 3, 2, 2, 2,
                    3, 3, 3, 2, 3,
                    1, 3, 3, 2, 2,
                    3, 2, 2, 2, 3,
                    3, 0, 0, 0, 0,
                    0, 0, 0, 0, 0,
                    0, 0, 0, 0, 0
                ),
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(36.dp))
        GreenButton(text = "Buat Laporan")
    }
}

@Composable
private fun MonthHeatMap(month: String, colors: List<Int>, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = month,
            color = BrandGreenDark,
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp,
            letterSpacing = 0.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
            colors.chunked(5).forEach { row ->
                Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                    row.forEach { level ->
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .aspectRatio(1f)
                                .background(heatColor(level))
                        )
                    }
                }
            }
        }
    }
}

private fun heatColor(level: Int): Color = when (level) {
    1 -> Color(0xFF91DDB6)
    2 -> Color(0xFF5BCB8D)
    3 -> BrandGreen
    else -> Color(0xFFF4F4F4)
}

@Composable
private fun DashboardCard(content: @Composable ColumnScope.() -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(7.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            content = content
        )
    }
}

@Composable
private fun GreenButton(text: String) {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(33.dp),
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(containerColor = BrandGreen),
        contentPadding = ButtonDefaults.ContentPadding
    ) {
        Text(
            text = text,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 9.sp,
            letterSpacing = 0.sp
        )
    }
}

@Composable
private fun BottomMenu() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(122.dp)
            .background(AppBackground)
            .padding(horizontal = 18.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                MenuItem("izin", "Izin", Modifier.weight(1f))
                MenuItem("people", "Kehadiran", Modifier.weight(1f))
                MenuItem("report", "Laporan", Modifier.weight(1f))
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                MenuItem("calendar", "Agenda", Modifier.weight(1f))
                MenuItem("book", "Booking", Modifier.weight(1f))
                MenuItem("wiki", "Wiki", Modifier.weight(1f))
            }
        }
    }
}

@Composable
private fun MenuItem(type: String, label: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MenuIcon(type = type, modifier = Modifier.size(22.dp))
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            color = Color(0xFF454545),
            fontSize = 9.sp,
            textAlign = TextAlign.Center,
            letterSpacing = 0.sp
        )
    }
}

@Composable
private fun MenuIcon(type: String, modifier: Modifier = Modifier) {
    Icon(
        imageVector = menuImageVector(type),
        contentDescription = null,
        modifier = modifier,
        tint = Color(0xFF4E4E4E)
    )
}

private fun menuImageVector(type: String): ImageVector = when (type) {
    "izin" -> Icons.Filled.TaskAlt
    "people" -> Icons.Filled.Groups
    "report" -> Icons.AutoMirrored.Filled.Article
    "calendar" -> Icons.Filled.CalendarMonth
    "book" -> Icons.AutoMirrored.Filled.MenuBook
    else -> Icons.AutoMirrored.Filled.LibraryBooks
}

@Preview(showBackground = true, widthDp = 360, heightDp = 760)
@Composable
private fun DigiTeamPreview() {
    DigiTeamTheme {
        DigiTeamApp()
    }
}
