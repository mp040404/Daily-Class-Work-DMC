const express = require('express')

const fs = require('fs')
const { request } = require('http')

const app = express()

const log = (message) => {
    fs.appendFileSync('logs.txt',`new request: ${new Date()} \n`)
    fs.appendFileSync('logs.txt',message)
    fs.appendFileSync('log.txt','\n')
}

app.get('/' , (request , response) => {
    log('GET /')
    response.send('GET /')
} )

app.post('/' , (request,response) => {
    log(`POST /`)
    response.send('POST /')
})

app.put('/' ,(request,response) => {
    response.send('PUT /')
})

app.listen(3000,'0.0.0.0',() => {
    console.log(`server started on port 3000`)
})