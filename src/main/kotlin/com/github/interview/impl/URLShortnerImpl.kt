package com.github.interview.impl

import com.github.interview.`interface`.SEOKeywordGenerator
import com.github.interview.`interface`.URLShortner
import java.net.URL

/*
Given as input a URL and a SEO keyword with a max length of 20 characters,chosen by the user,
generate a SEO URL.
 */
class URLShortnerImpl : URLShortner {

    override fun shortURL(fullURL: URL, seoKeywordGenerator: SEOKeywordGenerator): URL {
        val seoKeyword = seoKeywordGenerator.generate()

        val shortURL = "http://short.com/$seoKeyword"

        return URL(shortURL)
    }
}
