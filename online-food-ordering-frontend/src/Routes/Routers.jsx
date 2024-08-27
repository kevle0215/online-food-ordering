import React from "react";
import { Route, Routes } from "react-router-dom";
import { AdminRoute } from "./AdminRouter";
import { CustomerRouter } from "./CustomerRouter";

export const Routers = () => {
  return (
    <Routes>
      <Route path="/admin/restaurants/*" element={<AdminRoute />} />
      <Route path="/*" element={<CustomerRouter />} />
    </Routes>
  );
};
