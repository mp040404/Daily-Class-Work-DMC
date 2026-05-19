const express = require('express')

const app = express()

app.use(express.json())

const personRouter = require('./routes/person')
const carRouter = require('./routes/car')

app.use('/person',personRouter)
app.use('/car',carRouter)

app.listen(3000, '0.0.0.0' ,() => {
    console.log(`Server Started on port 3000`)
})