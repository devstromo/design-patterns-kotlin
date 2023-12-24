package com.devstromo.structural.decorator.delegation

import com.devstromo.structural.decorator.ChristmasTree

class Garlands(
    private val tree: ChristmasTree
) : ChristmasTree by tree {


    override fun decorate(): String {
        return tree.decorate() + decorateWithGarlands()
    }

    private fun decorateWithGarlands(): String {
        return " with Garlands"
    }
}