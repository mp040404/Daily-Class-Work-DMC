const express = require('express')

const books = [ {id: 1, name: 'The Alchemist'},
                {id: 2, name: 'Rich Dad , Poor Dad'},
                {id: 3, name: 'Nirlon'}
                ]

const app = express()

app.use(express.json())

app.get('/books' , (request,response) => {
    response.send(books)
} )

app.post('/books/add-book',(request,resposne) => {
    console.log(`body : `,request.body)

    const book ={
        name: request.body['name'],
        id: books.length + 1 ,
    }

    books.push(book)

    resposne.send('book added')
})

app.delete('/books/:id',(request,response) => {
    
    const id = request.param['id']

    for(const index in books){
        const book = books[index]
        if(book.id == id){
            books.splice(index ,1)
            break
        }
    }

    response.send('book deleted')
})

app.listen(3000,'0.0.0.0',() => {
    console.log(`server started on port 3000`)
})
