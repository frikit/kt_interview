package com.github.interview.`interface`

import java.net.URL

interface URLShortner {

    fun shortURL(fullURL: URL, seoKeywordGenerator: SEOKeywordGenerator): URL
}
