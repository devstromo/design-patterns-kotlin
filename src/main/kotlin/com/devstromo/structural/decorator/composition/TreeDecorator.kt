package com.devstromo.structural.decorator.composition

import com.devstromo.structural.decorator.ChristmasTree

abstract class TreeDecorator(
    private val tree: ChristmasTree
) : ChristmasTree {

    override fun decorate(): String {
        return tree.decorate()
    }
}