package com.github.interview.`interface`

interface SEOKeywordGenerator {

    fun validateSEOKeyword(seoKeyword: String) {
        require(seoKeyword.length <= 4) { "SEO keyword can't be more than 4 chars! but input is [$seoKeyword]" }
    }

    fun generate(): String
}
