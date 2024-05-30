package com.devstromo.behavioral.template.pattern

import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class TemplateMethodPatternUnitTest {
    @Test
    fun `Test CSVDataProcessor steps`() {
        val csvProcessor = spy(CSVDataProcessor())

        csvProcessor.process()

        val inOrder = inOrder(csvProcessor)
        inOrder.verify(csvProcessor).readData()
        inOrder.verify(csvProcessor).processData()
        inOrder.verify(csvProcessor).writeData()
    }

    @Test
    fun `Test JSONDataProcessor steps`() {
        val jsonProcessor = spy(JSONDataProcessor())

        jsonProcessor.process()

        val inOrder = inOrder(jsonProcessor)
        inOrder.verify(jsonProcessor).readData()
        inOrder.verify(jsonProcessor).processData()
        inOrder.verify(jsonProcessor).writeData()
    }
}