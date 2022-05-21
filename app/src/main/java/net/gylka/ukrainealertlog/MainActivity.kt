package net.gylka.ukrainealertlog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.gylka.ukrainealertlog.ui.theme.UkraineAlertLogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UkraineAlertLogTheme {
                Column {
                    Image(generateUkraineImageVector(), "Ukraine", Modifier.padding(10.dp))
                }
            }
        }
    }
}

@Preview
@Composable
private fun App() {
    Column {
        Greeting("Android hello !")
        Greeting("Android hello !")
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UkraineAlertLogTheme {
        Greeting("Android")
    }
}

@Composable
fun generateUkraineImageVector(): ImageVector {
    val builder = ImageVector.Builder("Ukraine", 613.dp, 408.dp, 612.47f, 408.02f)
    for (region in regions) {
        builder.group(name = region.name) {
            for (path in region.paths) {
                addPath(
                    PathParser().parsePathString(path).toNodes(),
                    fill = SolidColor(Color(0xCC00CC00)),
                    stroke = SolidColor(Color(0xAA00AA00)),
                    strokeLineWidth = 1.5f
                )
            }
        }
    }
    return builder.build()
}