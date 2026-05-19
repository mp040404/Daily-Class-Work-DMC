const http = require('http')


const server = http.createServer((request,response) => {
    console.log(`incoming request`)

    response.end(`welcome to REST APIs`)
} )

server.listen(3000,'0.0.0.0',() => {
    console.log(`server started successfully on port 3000`)
})