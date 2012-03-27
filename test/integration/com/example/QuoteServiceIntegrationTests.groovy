package com.example

import static org.junit.Assert.*
import org.junit.*

class QuoteServiceIntegrationTests {
    
    def quoteService
    
    void testStaticQuote(){
        def staticQuote = quoteService.getStaticQuote()
        assertEquals("Anonymous", staticQuote.Author)
        assertEquals("Real Programmers Don't eat Quiche", staticQuote.content )
    }

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testSomething() {
        fail "Implement me"
    }
}
