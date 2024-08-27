import { Badge, IconButton } from "@mui/material";
import SearchIcon from '@mui/icons-material/Search';
import Avatar from '@mui/material/Avatar';
import ShoppingCartIcon from '@mui/icons-material/ShoppingCart';
import React from "react";
import { pink } from "@mui/material/colors";
import './Navbar.css';
import { Person } from "@mui/icons-material";
import { useNavigate } from "react-router-dom";
import { useSelector } from "react-redux";

export const Navbar = () => {
    const {auth, cart} = useSelector(store => store)
    const navigate = useNavigate();

    const handleAvatarClick = () => {
        console.log(auth.user)
        if(auth.user?.role === "ROLE_CUSTOMER") {
            navigate("/my-profile")
        } else {
            navigate("/admin/restaurant")
        }
    };

    return (
        <div className='px-5 sticky z-50 py-[0.8rem] bg-[#e91e63] lg:px-20 flex justify-between'>
            <div className='lg:mr-10 cursor-pointer flex items-center space-x-4'>
                <li onClick={() => navigate("/")}className='logo font-semibold text-gray-300 text-2xl'>
                    Kevin Food
                </li>
            </div>
            <div className='flex items-center space-x-2 lg:space-x-10'>

                <div>
                    <IconButton>
                        <SearchIcon sx={{fontSize: "1.5rem"}}/>
                    </IconButton>
                </div>
                <div>
                    {auth.user ? 
                        <Avatar 
                        onClick={handleAvatarClick}
                        sx={{bgcolor:"white", color:pink.A400}}>
                            {auth.user?.fullName[0].toUpperCase()}
                        </Avatar> :
                        <IconButton onClick={() => navigate("/account/login")}>
                            <Person/>
                        </IconButton>
                    }
                </div>
                <div>
                    <IconButton onClick={() => navigate("/cart")}>
                        <Badge badgeContent={cart.cart?.item.length} color="primary">
                            <ShoppingCartIcon sx={{fontSize:"1.5rem"}}/>
                        </Badge>
                    </IconButton>
                    
                </div>

            </div>
        </div>
    )
}