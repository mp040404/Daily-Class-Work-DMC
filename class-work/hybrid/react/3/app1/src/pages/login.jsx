import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import { toast } from 'react-toastify'

function Login() {

    const [email,setEmail] = useState('')
    const [password, setPassword] = useState('')

    const navigate = useNavigate()

    const onLogin = () => {
        
        if(email.length == 0){
            toast.error('please enter email')
        }else if(password.length == 0){
            toast.error('Please Enter Password')
        }else if (email == 'test@test.com' && password == 'test'){
            navigate('/home')
        }else{
            toast.error('invalid user name and password')
        }
    }

  return (
    <div>
        <h1 className='header'>Login</h1>
        <div>
        <div className='mb-3'>
            <label htmlFor="">Email</label>
            <input 
                onChange={(e)=> setEmail(e.target.value)}
                type='text'
                className='form-control'/>
        </div>

        <div className='mb-3'>
            <label htmlFor="">Password</label>
            <input 
                onChange={(e) => setPassword(e.target.value)} 
                type='password'
                className='form-control'/>
        </div>

        <div className='mb-3'
        style={{ display: 'flex' , justifyContent : 'space-between'}}>

        <button
            onClick={onLogin}
            className='btn btn-success'>
              Login  </button>   
        <Link className='btn btn-warning' to='/register'>
          Register  </Link>
            </div>
        </div>
    </div>
    
  )
}

export default Login