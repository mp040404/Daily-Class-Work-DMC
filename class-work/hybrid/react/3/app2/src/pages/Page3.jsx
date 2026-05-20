import React, { useEffect } from 'react'

function Page3() {

    useEffect(() => {
        console.log(`Page3 got mounted`)

        return () => {
            console.log(`Page3 got unmounted`)
        }
    },[])




  return (
    <div>Page3</div>
  )
}

export default Page3