package com.kinisoftware.audioSkill

import com.amazonaws.services.dynamodbv2.model.InternalServerErrorException

object Translations {

    enum class TranslationKey {
        WELCOME, HELP, THANKS, FALLBACK
    }

    fun getMessage(language: String, messageKey: TranslationKey) =
        messages.getValue(language)[messageKey]
            ?: throw InternalServerErrorException("There is not messages for $language - $messageKey")

    private val messages = mapOf(
        "es" to mapOf(
            TranslationKey.WELCOME to "¡Gracias por usar esta skill!",
            TranslationKey.HELP to "Para usar esta skill simplemente tienes que invocarla y reproducirá el audio. ¿Quieres que lo reproduzca?",
            TranslationKey.THANKS to "¡Gracias por usar esta skill!",
            TranslationKey.FALLBACK to "Vaya, algo ha ido mal. Inténtalo más tarde"
        )
    )
}