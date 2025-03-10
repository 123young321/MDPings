package com.sekusarisu.mdpings.vpings.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Send
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.BugReport
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.MonitorHeart
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekusarisu.mdpings.BuildConfig

@Preview(showBackground = true)
@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {

    val uriHandler = LocalUriHandler.current
    val versionName = BuildConfig.VERSION_NAME

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .alpha(0.8f)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.Info,
                contentDescription = "Info",
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "About",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(8.dp),
                color = MaterialTheme.colorScheme.primary
            )
        }
        Text(
            text = body,
            textAlign = TextAlign.Start,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 26.dp, vertical = 8.dp),
            color = MaterialTheme.colorScheme.secondary
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Rounded.MonitorHeart,
                contentDescription = "MonitorHeart",
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "MDPings",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(8.dp),
                color = MaterialTheme.colorScheme.primary
            )
        }

        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://github.com/icylian/MDPings")
                    }
                ),
            headlineContent = { Text(text = "MDPings", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = { Text(text = "查看 MDPings GitHub 项目地址和应用说明", color = MaterialTheme.colorScheme.tertiary) },
            leadingContent = {
                Icon(
                    imageVector = Icons.Rounded.MonitorHeart,
                    contentDescription = "MonitorHeart",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
            colors = ListItemDefaults.colors(
                containerColor = MaterialTheme.colorScheme.background
            )
        )
        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://github.com/icylian/MDPings/issues")
                    }
                ),
            headlineContent = { Text("GitHub 议题", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = { Text("提交错误报告或改进建议", color = MaterialTheme.colorScheme.tertiary) },
            leadingContent = {
                Icon(
                    imageVector = Icons.Rounded.BugReport,
                    contentDescription = "ReportProblem",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
        )
        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://github.com/icylian/MDPings")
                    }
                ),
            headlineContent = { Text("赞助", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = {
                Text(
                    text = "谢谢！来 GitHub 点个 ⭐ 吧~",
                    color = MaterialTheme.colorScheme.tertiary
                )
            },
            leadingContent = {
                Icon(
                    imageVector = Icons.Rounded.AttachMoney,
                    contentDescription = "AttachMoney",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
        )
        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://t.me/mdpings_app")
                    }
                ),
            headlineContent = { Text("Telegram 频道", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = { Text("https://t.me/mdpings_app", color = MaterialTheme.colorScheme.tertiary) },
            leadingContent = {
                Icon(
                    imageVector = Icons.AutoMirrored.Rounded.Send,
                    contentDescription = "Send",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
        )
        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://github.com/icylian/MDPings/releases")
                    }
                ),
            headlineContent = { Text("当前版本", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = { Text(versionName, color = MaterialTheme.colorScheme.tertiary) },
            leadingContent = {
                Icon(
                    imageVector = Icons.Rounded.Info,
                    contentDescription = "Info",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .alpha(0.9f)
        ) {
            Icon(
                imageVector = Icons.Rounded.Favorite,
                contentDescription = "Favorite",
                tint = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "鸣谢项目",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(8.dp),
                color = MaterialTheme.colorScheme.primary
            )
        }
        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://nezha.wiki/")
                    }
                ),
            headlineContent = { Text("哪吒监控", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = { Text("查看哪吒监控的官方网站", color = MaterialTheme.colorScheme.tertiary) },
//            supportingContent = { Text("查看哪吒监控 GitHub 项目地址和应用说明") },
            leadingContent = {
                Icon(
                    imageVector = Icons.Rounded.StarBorder,
                    contentDescription = "Star",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
//            trailingContent = { Text("meta") }
        )
        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://apps.apple.com/us/app/vpings/id6479573031")
                    }
                ),
            headlineContent = { Text("VPings", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = { Text("哪吒监控 IOS 客户端，部分界面参考其构建", color = MaterialTheme.colorScheme.tertiary) },
            leadingContent = {
                Icon(
                    imageVector = Icons.Rounded.Star,
                    contentDescription = "Star",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
        )
        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://nezha-cf.buycoffee.top/")
                    }
                ),
            headlineContent = { Text("Nezha-dash", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = { Text("一个基于 Next.js 和 哪吒监控 的仪表盘，部分界面参考其构建", color = MaterialTheme.colorScheme.tertiary) },
            leadingContent = {
                Icon(
                    imageVector = Icons.Rounded.StarBorder,
                    contentDescription = "Star",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
        )
        ListItem(
            modifier = Modifier
                .clickable(
                    onClick = {
                        uriHandler.openUri("https://github.com/patrykandpatrick/vico")
                    }
                ),
            headlineContent = { Text("Vico", color = MaterialTheme.colorScheme.secondary) },
            supportingContent = { Text("开源的图表绘制库", color = MaterialTheme.colorScheme.tertiary) },
            leadingContent = {
                Icon(
                    imageVector = Icons.Rounded.Star,
                    contentDescription = "Star",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
        )
//        ListItem(
//            modifier = Modifier
//                .clickable(
//                    onClick = {
//                        uriHandler.openUri("https://ktor.io/")
//                    }
//                ),
//            headlineContent = { Text("Ktor", color = MaterialTheme.colorScheme.secondary) },
//            supportingContent = { Text("开源的 Http 客户端", color = MaterialTheme.colorScheme.tertiary) },
//            leadingContent = {
//                Icon(
//                    imageVector = Icons.Rounded.Star,
//                    contentDescription = "Star",
//                    tint = MaterialTheme.colorScheme.secondary
//                )
//            },
//        )
//        ListItem(
//            modifier = Modifier
//                .clickable(
//                    onClick = {
//                        uriHandler.openUri("https://insert-koin.io/")
//                    }
//                ),
//            headlineContent = { Text("Koin", color = MaterialTheme.colorScheme.secondary) },
//            supportingContent = { Text("开源的 DI 框架", color = MaterialTheme.colorScheme.tertiary) },
//            leadingContent = {
//                Icon(
//                    imageVector = Icons.Rounded.StarBorder,
//                    contentDescription = "Star",
//                    tint = MaterialTheme.colorScheme.secondary
//                )
//            },
//        )
    }
}

private const val body: String =
    "MDPings 是一个基于哪吒监控 API 接口开发的 MD3 风格 Android 客户端，支持同时监控多个服务器的状态，提供历史网络状态和延迟图表。"
