package com.example

class QuoteController {
    
    def scaffold = true

    def index() {
        redirect(action: home)
    }
    def home= {
        render "<h1>Real Programmers do not each Quiche</h1>"
    }
    
    def random(){
        def allQuotes=Quote.list()
        def randomQuote
        new Quote(author: 'Chuck Norris Facts', content: 'Chuck Norris is always uses his own design patterns, and his favorite is the Roundhouse Kick').save()
        new Quote(author:'Eric Raymond', content: 'Being a social outcast helps you stay concentrated on the really important things, like thinking and hacking.').save()
        if (allQuotes.size()>0){
            def randomIdx=new Random().nextInt(allQuotes.size())
            randomQuote=allQuotes[randomIdx]
        } else {
            randomQuote = new Quote(author: "Anonymous", content: "Real Programmers Don't eat quiche")
        }
        [quote:randomQuote]
    }
}
