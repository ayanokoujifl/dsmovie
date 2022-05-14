import {ReactComponent as GithubIcon} from '../assets/git.svg';
import './NavBar.css';
export function Navbar(){
    return (
        <header>
        <nav className='container'>
          <div className='dsmovie-nav-content'>
            <h1>DSMovie</h1>
            <a href="http://github.com/ayanokoujifl" className='dsmovie-link'>
            <div className='dsmovie-nav-icon'>
            <GithubIcon/>
            <p className='dsmovie-align'>Luis Gustavo</p>
          </div></a>
          </div>
       
        </nav>
      </header>
    )
}