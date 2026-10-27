package kg.kkc.android_lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import kg.kkc.android_lab1.ui.theme.Androidlab1Theme

data class User(
    val name: String,
    val role: String,
    val projects: Int,
    val tasks: Int,
    val experience: Int,
)

val users = listOf(
    User("Artur Kim", "JavaScript-developer", 1, 4, 1),
    User("Alim Abdulalim", "Golang-developer", 14, 48, 67),
    User("Tilya Tilek", "Python-developer", 6, 7, 3),
    User("Chika Chingyz", "Jobless", 1, 1, 18),
)

val shape = RoundedCornerShape(16.dp)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFEFF3F5))
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 16.dp)
                )
                    {users.forEach { user ->
                        Column(
                            modifier = Modifier
                                .fillMaxWidth().padding(top = 10.dp)
                                .padding(start = 12.dp, end = 12.dp, top = 4.dp, bottom = 4.dp)
                                .clip(shape)
                                .background(Color.White)
                                .border(
                                    width = 0.6.dp,
                                    color = Color(0xFF827DA2),
                                    shape,
                                )
                                .padding(12.dp),
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(16.dp),
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(64.dp)
                                        .clip(CircleShape)
                                        .background(Color(0xFF2F6BFF)),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Text(
                                        text = user.name.take(1),
                                        color = Color.White,
                                        fontSize = 28.sp,
                                        fontWeight = FontWeight.Bold,
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .weight(1f)
                                ) {
                                    Text(
                                        text = user.name,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color(0xFF0A2F61),
                                    )
                                    Text(
                                        text = user.role,
                                        color = Color(0xFF0A2F61),
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .padding(top = 8.dp, bottom = 8.dp)
                                    .clip(shape)
                                    .background(Color(0xFFD1E0E8))
                                    .height(60.dp),


                            ){
                                Column(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                ) {
                                    Text(
                                        text = "Проектов:",
                                        fontSize = 12.sp,
                                        color = Color(0xFF0A2F61)
                                    )
                                    Text(
                                        text = user.projects.toString(),
                                        fontSize = 14.sp,
                                        color = Color(0xFF0A2F61)
                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,

                                    ) {
                                    Text(
                                        text = "Задач:",
                                        fontSize = 12.sp,
                                        color = Color(0xFF0A2F61)
                                    )
                                    Text(
                                        text = user.tasks.toString(),
                                        fontSize = 14.sp,
                                        color = Color(0xFF0A2F61)
                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .weight(1f)
                                        .fillMaxHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,

                                    ) {
                                    Text(
                                        text = "Лет опыта:",
                                        fontSize = 12.sp,
                                        color = Color(0xFF0A2F61)
                                    )
                                    Text(
                                        text = user.experience.toString(),
                                        fontSize = 14.sp,
                                        color = Color(0xFF0A2F61)
                                    )
                                }
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(40.dp),
                                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
                            ){
                                Box(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .clip(shape)
                                        .background(Color(0xFF0A2F61))
                                        .weight(1f),
                                    contentAlignment = Alignment.Center
                                    ) {
                                    Text(
                                        text = "Написать",
                                        color = Color.White
                                    )
                                }

                                Box(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .border(
                                            width = 1.dp,
                                            Color(0xFF0A2F61),
                                            shape,
                                        )
                                        .weight(1f),
                                    contentAlignment = Alignment.Center
                                ){
                                    Text(
                                        text = "Подписаться",
                                        color = Color(0xFF0A2F61)
                                    )
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
