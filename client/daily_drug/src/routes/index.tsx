import React, { lazy } from "react";
import { createBrowserRouter } from "react-router-dom";

const MainPage = lazy(() => import("pages/MainPage"));

const baseRoute = process.env.REACT_APP_BASE_ROUTE
  ? process.env.REACT_APP_BASE_ROUTE
  : "";

const routes = createBrowserRouter([
  {
    path: `${baseRoute}/`,
    element: <MainPage />,
  },
]);

export default routes;
