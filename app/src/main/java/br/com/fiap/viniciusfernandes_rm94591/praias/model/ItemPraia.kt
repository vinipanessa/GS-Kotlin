package br.com.fiap.viniciusfernandes_rm94591.praias.model

data class ItemPraia (
    val nomePraia : String,
    val cidade : String,
    val estado : String,
    val onRemove : (ItemPraia) -> Unit
)