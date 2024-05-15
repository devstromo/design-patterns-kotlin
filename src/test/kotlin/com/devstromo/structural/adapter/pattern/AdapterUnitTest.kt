package com.devstromo.structural.adapter.pattern

import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class AdapterUnitTest {
    @Test
    fun `Test Mp3 file is played by Mp3Player`() {
        val mp3Player = mock<Mp3Player>()
        val adapter = MediaAdapter(mp3Player)

        adapter.play("mp3", "song.mp3")
        verify(mp3Player, times(1)).playMp3("song.mp3")
    }

    @Test
    fun `Test non-Mp3 file is adapted and played as Mp3`() {
        val mp3Player = mock<Mp3Player>()
        val audioPlayer = AudioPlayer(MediaAdapter(mp3Player))

        audioPlayer.play("mp4", "video.mp4")
        verify(mp3Player, times(1)).playMp3("video.mp4")
    }

    @Test
    fun `Test Mp3 file is directly played by AudioPlayer`() {
        val mp3Player = mock<Mp3Player>()
        val audioPlayer = AudioPlayer(MediaAdapter(mp3Player))

        audioPlayer.play("mp3", "song.mp3")
        verify(mp3Player, times(1)).playMp3("song.mp3")
    }
}