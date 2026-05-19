const express = require('express')

const mysql = require('mysql2')

const pool = mysql.createPool({
    host: 'localhost',
    user: 'root' ,
    password: 'root' ,
    port: 3306 ,
    database: 'dmc',
})

const app = express()

app.use(express.json())

app.get('/book',(request,response) => {
    const statement = `select * from books`

    pool.query(statement,[],(error,books) => {
        if(error){
            response.send(error)
        }else{
            response.send(books)
        }
    })
} )

app.put('/book/:id',(request,response) => {
    const{id} = request.params

    const { price } = request.body

    const statement = 'update books set price = ? where id = ?'

    pool.execute(statement,[price,id],(error,result) =>{
        if(error){
            response.send(error)
        }else{
            response.send(result)
        }
    })
})

app.post('/book',(request,response) => {
    const {id,name ,author, subject , price} = request.body

    const statement = ' insert into books (id,name,author, subject,price) values (?,?,?,?,?)'

    pool.execute(statement,[id,name ,author, subject , price],(error,result) => {
        if(error){
            response.send(error)
        }else{
            response.send(result)
        }
    })
})

app.delete('/book/:id',(request,response) => {
    const {id} = request.params

    const statement = 'delete from books where id = ?'

    pool.execute(statement,[id],(error,result)=>{
        if(error){
            response.send(error)
        }else{
            response.send(result)
        }
    })
})
app.listen(3000,'0.0.0.0',() => {
    console.log(`server started on port 3000`)
})