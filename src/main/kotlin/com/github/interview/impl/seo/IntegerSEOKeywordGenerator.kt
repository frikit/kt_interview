package com.github.interview.impl.seo

import com.github.interview.`interface`.SEOKeywordGenerator
import java.util.concurrent.atomic.AtomicInteger

class IntegerSEOKeywordGenerator : SEOKeywordGenerator {

    val start: AtomicInteger = AtomicInteger(0)

    override fun generate(): String {
        val res = start.incrementAndGet().toString()
        validateSEOKeyword(res)
        return res
    }
}
