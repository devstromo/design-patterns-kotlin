package com.devstromo.structural.decorator.composition

import com.devstromo.structural.decorator.ChristmasTree

class BubbleLights(
    tree: ChristmasTree
) : TreeDecorator(tree) {

    override fun decorate(): String {
        return super.decorate() + decorateWithBubbleLights()
    }

    private fun decorateWithBubbleLights(): String {
        return " with Bubble Lights"
    }
}