const express = require('express')

const app = express()



app.get('/',(request,response) => {
    response.send('welcome to express server , GET /')
} )


app.post('/',(request,response) => {
    response.send('POST /')
})

app.put('/' ,(request,response) => {
    response.send('PUT /')
} )

app.delete('/',(request,response) =>
{
    response.send('DELETE /')
} )
 
app.patch('/' ,(request,response)=>
{
    response.send('PATCH /')
})

app.get('/books',(request,response) =>
{
response.send('GET /books')
})


app.listen(3000, '0.0.0.0', () => {
  console.log(`server started on port 3000`)
})

