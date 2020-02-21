package com.github.interview.impl.seo

import com.github.interview.`interface`.SEOKeywordGenerator
import java.util.*

class AlphanumericSEOKeywordGenerator : SEOKeywordGenerator {
    override fun generate(): String {
        val random = Random()
        val result = StringBuilder()
        (0..3).forEach { _ ->
            val number = random.nextInt(56)
            val char = number.toChar()
            result.append(char.toString())
        }

        validateSEOKeyword(result.toString())
        return result.toString()
    }
}
