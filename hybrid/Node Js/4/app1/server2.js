const express = require('express')
const fs = require('fs')
const { request } = require('http')

const app = express()

const log = (request,response,next) => {
    console.log(`inside the log function`)

    // response.send('auth header is missing')
    next()
}

app.use(log)

app.get('/',(request,response) => {
    response.send('GET /')
})

app.post('/',(request,response) => {
    response.send('POST /')
})

app.put('/',(request,response) => {
    response.send('PUT /')
})

app.listen(3000,'0.0.0.0' ,() => {
    console.log(`server started on port 3000`)
})
