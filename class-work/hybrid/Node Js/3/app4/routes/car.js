const express = require('express')
const { route } = require('./person')
const router = express.Router()

router.get('/',(request,response) => {
    console.log(`GET /car`)
    response.send()
})

router.post('/',(request,response) => {
    console.log(`POST /car`)
    response.send()
})

module.exports = router