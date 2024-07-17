package com.devstromo.behavioral.iterator.pattern

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}

// Aggregate Interface
interface Aggregate<T> {
    fun createIterator(): Iterator<T>
}

class BookCollection : Aggregate<Book> {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    override fun createIterator(): Iterator<Book> = BookIterator(books)
}

class BookIterator(private val books: List<Book>) : Iterator<Book> {
    private var index = 0

    override fun hasNext(): Boolean = index < books.size

    override fun next(): Book = books[index++]
}

class StringCollection : Aggregate<String> {
    private val strings = mutableListOf<String>()

    fun addString(string: String) {
        strings.add(string)
    }

    override fun createIterator(): Iterator<String> = StringIterator(strings)
}

class StringIterator(private val strings: List<String>) : Iterator<String> {
    private var index = 0

    override fun hasNext(): Boolean = index < strings.size

    override fun next(): String = strings[index++]
}

data class Book(val title: String, val author: String)
