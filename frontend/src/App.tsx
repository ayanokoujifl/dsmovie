import { BrowserRouter, Routes, Route } from 'react-router-dom'
import { Listing } from './pages/Listing'
import { Form } from './pages/Form'
import { Navbar } from './Components/NavBar'
import React from 'react'

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Listing />} />
        <Route path="/form">
          <Route path=":movieId" element={<Form />} />
        </Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App
