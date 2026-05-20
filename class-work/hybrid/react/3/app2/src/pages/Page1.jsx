import React, { useEffect, useState } from 'react'

function Page1() {

    const [counter1,setCounter1] = useState(0)
    const [counter2,setCounter2] = useState(0)

    const onCounter1Increament = () => {
        setCounter1(counter1 +1)
    }

    const onCounterDecrement = () => {
        setCounter1(counter1 - 1)
    }

    const onCounter2Increament = () => {
        setCounter2(counter2 +1)
    }

    const onCounter2Decrement = () => {
        setCounter2(counter2-1)
    }

    useEffect(()=>{
        console.log(`Page1 State changed`)
    })

    useEffect(() => {
        console.log(`Page1 state changed because counter1 changed`)
    },[counter1])

    useEffect(()=>{
        console.log(`Page1 State Changed because of counter2 changed`)
    },[counter2])

    useEffect(()=>{
        console.log(`Page1 got mounted`)

        return () => {
            console.log(`Page1 got unmounted`)
        }
    },[])



  return (
    <div>

        <h2>Page1 </h2>
            <div>counter1={counter1}</div>
            <button onClick={onCounter1Increament}>increment</button>
            <button onClick={onCounterDecrement}>decrement</button>
            <hr />
            <div>counter2={counter2}</div>
            <button onClick={onCounter2Increament}>increment</button>
            <button onClick={onCounter2Decrement}>decrement</button>
        


    </div>
  )
}

export default Page1