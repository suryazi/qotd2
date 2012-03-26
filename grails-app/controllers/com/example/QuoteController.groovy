package com.example

class QuoteController {

    def index() {
        redirect(action: home)
    }
    def home= {
        render "<h1>Real Programmers do not each Quiche</h1>"
    }
}
