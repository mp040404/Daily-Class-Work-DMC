import Register from './pages/Register'
import Home from './pages/Home'
import Login from './pages/login'

import { Routes, Route} from 'react-router-dom'

function App() {
  return (
    <div className='container'>
      <Routes>
        <Route
        path='/'
        element={<Login/>}
        />
        <Route
        path = '/register'
        element={<Register/>}
        />
        <Route
        path='/home'
        element={<Home/>}
        />

      </Routes>

    </div>

  )
}

export default App