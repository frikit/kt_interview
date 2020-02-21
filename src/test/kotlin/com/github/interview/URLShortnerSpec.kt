package com.github.interview

import com.github.interview.impl.URLShortnerImpl
import com.github.interview.impl.seo.AlphanumericSEOKeywordGenerator
import com.github.interview.impl.seo.IntegerSEOKeywordGenerator
import org.junit.jupiter.api.Test
import java.net.URL

internal class URLShortnerSpec {

    val urlShortner = URLShortnerImpl()

    @Test
    fun `alphanumeric seo keyword and valid url`() {
        val alpahnumeric = AlphanumericSEOKeywordGenerator()
        val fullURL = URL("http://looooong.com/somepath")
        val actual = urlShortner.shortURL(fullURL, alpahnumeric)
        val expected = URL("http://short.com/")
        assert(actual.host == expected.host)
        assert(actual.path.length == 4)
    }

    @Test
    fun `integer seo keyword and valid url`() {
        val alpahnumeric = IntegerSEOKeywordGenerator()
        val fullURL = URL("http://looooong.com/somepath")
        var actual = urlShortner.shortURL(fullURL, alpahnumeric)
        val expected = URL("http://short.com/")
        assert(actual.host == expected.host)
        assert(actual.path.toInt() == 1)

        actual = urlShortner.shortURL(fullURL, alpahnumeric)
        assert(actual.host == expected.host)
        assert(actual.path.toInt() == 2)
    }
}
