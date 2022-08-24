import { ReactComponent as StarFull } from '../assets/starfull.svg'
import { ReactComponent as StarHalf } from '../assets/starHalf.svg'
import { ReactComponent as StarEmpty } from '../assets/starEmpty.svg'
import './Stars.css'
import React from 'react'

export function Stars() {
  return (
    <div className="dsmovie-stars-container">
      <StarFull />
      <StarFull />
      <StarFull />
      <StarHalf />
      <StarEmpty />
    </div>
  )
}
