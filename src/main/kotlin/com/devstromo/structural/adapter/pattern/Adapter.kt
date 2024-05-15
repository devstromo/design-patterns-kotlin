package com.devstromo.structural.adapter.pattern

// Digital Media Player Interface (Target Interface)
interface DigitalMediaPlayer {
    fun play(fileType: String, fileName: String)
}

// Concrete class representing old player (Adaptee)
class Mp3Player {
    fun playMp3(fileName: String) {
        println("Playing mp3 file: $fileName")
    }
}

// Adapter
class MediaAdapter(private val mp3Player: Mp3Player) : DigitalMediaPlayer {
    override fun play(fileType: String, fileName: String) {
        if (fileType.equals("mp3", ignoreCase = true)) {
            mp3Player.playMp3(fileName)
        } else {
            println("Unsupported media format for Mp3Player: $fileType")
        }
    }
}

// Client Code
class AudioPlayer(private val mediaAdapter: MediaAdapter) : DigitalMediaPlayer {
    override fun play(fileType: String, fileName: String) {
        if (fileType.equals("mp3", ignoreCase = true)) {
            mediaAdapter.play(fileType, fileName)
        } else {
            println("Playing $fileType file: $fileName through adapter")
            mediaAdapter.play("mp3", fileName)
        }
    }
}
