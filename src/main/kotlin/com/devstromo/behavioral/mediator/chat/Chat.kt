package com.devstromo.behavioral.mediator.chat

// helper alias
typealias ParticipantName = String

// Mediator interface
interface Chatroom {
    fun registerParticipant(participant: Participant)

    // message recipient is optional, when left empty the message is public
    fun send(message: String, from: ParticipantName, to: ParticipantName? = null)
}

// Participant class has very simple API, limited to sending and receiving the message
// no logic controlling where the message actually goes
class Participant(val name: String, private val chatroom: Chatroom) {

    init {
        // the participant is registering itself in the chatroom
        chatroom.registerParticipant(this)
    }

    // is able to send the message
    fun send(message: String, to: ParticipantName? = null) {
        chatroom.send(message, this.name, to)
    }

    // and receive it
    fun receive(message: String) {
        println("[$name] gets: $message")
    }
}

// `object` is here just to make it easier to use in `main()`
object SuperChat : Chatroom {
    // chatroom modes
    enum class Mode {
        PUBLIC, // every message is delivered to every participant
        PRIVATE, // only messages with recipient will be delivered
        MIXED // both direct messages and public ones will be delivered
    }

    var mode: Mode = Mode.PRIVATE

    private val participants = mutableListOf<Participant>()

    override fun registerParticipant(participant: Participant) {
        participants.add(participant)
    }

    // handling messages
    override fun send(message: String, from: ParticipantName, to: ParticipantName?) {
        when (mode) {
            // depending on the mode they will be handled differently
            Mode.PUBLIC -> participants.forEach { it.receive("$from says: $message") }
            Mode.PRIVATE -> participants.find { it.name == to }?.receive("$from says: $message")
            Mode.MIXED -> {
                if (to == null) participants.forEach { it.receive("$from says: $message") }
                else participants.find { it.name == to }?.receive("$from says: $message")
            }
        }
    }
}

fun main() {
    val alice = Participant("Alice", SuperChat)
    val bob = Participant("Bob", SuperChat)
    val charlie = Participant("Charlie", SuperChat)

    alice.send("hi all!")
    bob.send("hi Alice", "Alice") // only this message will be delivered in PRIVATE mode
    charlie.send("hi Alice")

    SuperChat.mode = SuperChat.Mode.PUBLIC
}
