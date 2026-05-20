import React from 'react'
import { Route,Routes,Link } from 'react-router-dom'
import Page1 from './pages/Page1'
import Page2 from './pages/Page2'
import Page3 from './pages/Page3'


function App() {
  return (
    <div>
      <h2>App Components</h2>
      <ul>
        <li>
          <Link to="/page1">Page1</Link>
        </li>
        <li>
          <Link to="/page2">Page2</Link>
        </li>
        <li>
          <Link to="/page3">Page3</Link>
        </li>
      </ul>
    
    <Routes>
      <Route
        path='/page1'
        element={<Page1/>}
      />
      <Route
        path='/page2'
        element={<Page2/>}
        />
      <Route
        path='/page3'
        element={<Page3/>}
        />
    </Routes>
    </div>
  )
}

export default App