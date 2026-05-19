const express = require('express')
const fs = require('fs')
const { request } = require('http')

const app = express()

function middleware1(request,response,next){
    console.log(`inside middleware 1`)
    next()
}

const middleware2 = function(request,response,next){
    console.log(`inside middleware 2`)
    next()
}

const middleware3 = (request,response,next) =>{
    console.log(`inside middleware 3`)
    next()
}

const middleware4Wrapper = () => {
    console.log(`inside middleware4Wrapper`)

    return (request,response,next) => {
        console.log(`inside middleware 4`)
        next()
    }
}

app.use(express.json())

app.use(middleware1)
app.use(middleware2)
app.use(middleware3)

app.use(middleware4Wrapper())

app.use((request,response,next) => {
    console.log(`inside middleware 5`)
    next()
})

app.get('/', (request, response) => {
  console.log(`inside get /`)
  response.send('GET /')
})

app.post('/', (request, response) => {
  console.log(`inside post /`)
  response.send('POST /')
})

app.put('/', (request, response) => {
  console.log(`inside put /`)
  response.send('PUT /')
})


app.listen(3000, '0.0.0.0', () => {
  console.log(`server started on port 3000`)
})
