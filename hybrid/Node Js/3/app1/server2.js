const http = require(`http`)
//create server
const server = http.createServer((request,response) => {
    console.log(`incoming request`)

    // process request
    console.log(`request method : `,request.method)
    console.log(`request url/path : `,request.url)

    // send the response
    response.end()
})

server.listen(3000,'0.0.0.0',() => {
    console.log(`server started on port 3000`)
})