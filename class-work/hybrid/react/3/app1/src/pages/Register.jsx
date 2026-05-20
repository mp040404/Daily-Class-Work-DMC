import React from 'react'
import { useNavigate } from 'react-router-dom'

function Register() {

    const navigate = useNavigate()

    const onBack = () => {
        navigate('/')
    }


  return (
    <div>
        <h1 className="header">Register</h1>
        <div>
            <div className="mb-3">
                <label htmlFor="">
                    Name
                </label>
                <input type="text" className="form-control" />
            </div>
            <div className="mb-3">
                <label htmlFor="">
                    Email
                </label>
                <input type="password" className="form-control" />
            </div>
            <div className="mb-3">
                <label htmlFor="">
                    Password
                </label>
                <input type="password" className="form-control" />
            </div>
            <div className="mb-3">
                <label htmlFor="">
                    Confirm Password
                </label>
                <input type="password" className="form-control" />
            </div>
            <div className="mb-3" 
                style={{display:'flex',justifyContent:'space-between'}}
                >
                    <button className="btn btn-success">
                        Register
                    </button>
                    <button className="btn btn-denger" onClick={onBack}>
                        Back
                    </button>
                </div>
        </div>
    </div>
  )
}

export default Register