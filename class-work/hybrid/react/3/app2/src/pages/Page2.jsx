import React, { useEffect } from 'react'

function Page2() {

    useEffect(()=> {
        console.log(`Page2 got Mounted`)
        return () => {
            console.log(`Page2 got unMounted`)
        }

        
    },[])
  return (
    <div>Page2</div>
  )
}

export default Page2