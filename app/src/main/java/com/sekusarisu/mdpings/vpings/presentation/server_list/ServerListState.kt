package com.sekusarisu.mdpings.vpings.presentation.server_list

import androidx.compose.runtime.Immutable
import com.sekusarisu.mdpings.vpings.presentation.models.IpAPIUi
import com.sekusarisu.mdpings.vpings.presentation.models.MonitorUi
import com.sekusarisu.mdpings.vpings.presentation.models.ServerUi

@Immutable
data class ServerListState(
    val isLoading: Boolean = false,
    val selectedServer: ServerUi? = null,
    val servers: List<ServerUi> = emptyList(),
    val ipAPIUi: IpAPIUi? = null,
    val monitors: List<MonitorUi> = emptyList()
)