package org.codetome.zircon.internal.font.impl

import org.codetome.zircon.api.TextCharacter
import org.codetome.zircon.api.font.CharacterMetadata
import org.codetome.zircon.api.font.Font
import java.awt.image.BufferedImage

object FontSettings {
    val NO_FONT = object : Font<BufferedImage> {
        override fun getWidth(): Int {
            TODO()
        }

        override fun getHeight(): Int {
            TODO()
        }

        override fun hasDataForChar(char: Char): Boolean {
            TODO()
        }

        override fun fetchRegionForChar(textCharacter: TextCharacter, vararg tags: String): BufferedImage {
            TODO()
        }

        override fun fetchMetadataForChar(char: Char): List<CharacterMetadata> {
            TODO()
        }
    }
}