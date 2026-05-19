const http = require(`http`)

const book = []

const users = []

const server = http.createServer((request,response) =>
{
    if(request.url == '/book'){
        if(request.method == 'GET'){
            const jsonString = JSON.stringify(book)
        }
        else if(request.method == 'POST'){
            book.push({ id: 1, name: 'The Alchemist'})

            response.setHeader('Content-Type' , 'application/json')
            response.end('book added')
        }
        else if (request.method == 'PUT'){

        }
        else if (request.method == 'DELETE'){

        }
    }else if(request.url == '/user/register' && request.method == 'POST'){

    }else if(request.url == '/user/login' && request.method == 'POST'){
        
    }else if(request.url == '/user/reset-password' && request.method == 'POST'){

    }
} )

server.listen(3000,'0.0.0.0',() => {
    console.log(`server started on port 3000`)
})