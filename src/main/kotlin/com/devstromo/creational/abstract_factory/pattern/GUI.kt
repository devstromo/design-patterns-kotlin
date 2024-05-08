package com.devstromo.creational.abstract_factory.pattern

// GUI Components Interfaces
interface Button {
    fun paint()
}

interface Checkbox {
    fun paint()
}

// Material Style Components
class MaterialButton : Button {
    override fun paint() {
        println("Rendering Material Button")
    }
}

class MaterialCheckbox : Checkbox {
    override fun paint() {
        println("Rendering Material Checkbox")
    }
}

// Fluent Style Components
class FluentButton : Button {
    override fun paint() {
        println("Rendering Fluent Button")
    }
}

class FluentCheckbox : Checkbox {
    override fun paint() {
        println("Rendering Fluent Checkbox")
    }
}

// Abstract Factory Interface
interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}

// Concrete Factories
class MaterialFactory : GUIFactory {
    override fun createButton(): Button = MaterialButton()
    override fun createCheckbox(): Checkbox = MaterialCheckbox()
}

class FluentFactory : GUIFactory {
    override fun createButton(): Button = FluentButton()
    override fun createCheckbox(): Checkbox = FluentCheckbox()
}
