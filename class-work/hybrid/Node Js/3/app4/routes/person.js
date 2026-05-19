const express = require('express')

const db = require('../db')

const utils = require('../utils')

const router = express.Router()

router.get('/',(request,response) => {
    const statement = `select id,first_name, last_name,address , email, age from persons`

    db.query(statement,[],(error,persons) => {
        response.send(utils.createResult(error,persons))
    })
})

router.post('/',(request,response) => {

    const { first_name , last_name, email, address, age } = request.body

    const statement = `insert into persons (first_name, last_name, email, address, age) values ( ?, ?, ?, ?, ?)`

    db.execute(statement, [first_name,last_name,email,address,age] , (error,result) => {
        response.send(utils.createResult(error,result))
    } )
} )

router.put('/:id',(request,response) => {
    console.log(`PUT /person/:id received`)
    response.send()
})

router.delete('/:id',(request,response) => {
    console.log(`DELETE /person/:id received`)
    response.send()
} )

module.exports = router
