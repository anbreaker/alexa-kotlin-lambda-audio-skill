package com.kinisoftware.audioSkill.handler

import com.amazon.ask.dispatcher.request.handler.HandlerInput
import com.amazon.ask.dispatcher.request.handler.RequestHandler
import com.amazon.ask.model.SessionEndedRequest
import com.amazon.ask.request.Predicates

class NextAndPreviousIntentHandler : RequestHandler {

    override fun canHandle(input: HandlerInput) = input.matches(
        Predicates.intentName("AMAZON.NextIntent")
            .or(Predicates.intentName("AMAZON.PreviousIntent"))
    )

    override fun handle(input: HandlerInput) = input.responseBuilder.build()
}