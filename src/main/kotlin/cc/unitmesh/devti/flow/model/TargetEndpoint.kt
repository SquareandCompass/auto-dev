package cc.unitmesh.devti.flow.model

import cc.unitmesh.devti.context.DtClass

data class TargetEndpoint(
    val endpoint: String,
    var controller: DtClass,
    val isNeedToCreated: Boolean = true,
)