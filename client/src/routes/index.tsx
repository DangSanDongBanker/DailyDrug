import React, { lazy } from "react";
import { createBrowserRouter } from "react-router-dom";
import Spinner from "../components/Spinner/Spinner";
import SignIn from "../components/SignIn/SignIn";

const MainPage = lazy(() => import("pages/MainPage")); // lazy=동적 import
const ErrorPage = lazy(() => import("pages/ErrorPage"));

const baseRoute = process.env.REACT_APP_BASE_ROUTE
  ? process.env.REACT_APP_BASE_ROUTE
  : "";

const routes = createBrowserRouter([
  {
    path: `${baseRoute}/`,
    element: <MainPage />,
    errorElement: <ErrorPage />,
  },

  //// 테스트용 Router
  {
    path: `${baseRoute}/error`,
    element: <ErrorPage />,
  },
  {
    path: `${baseRoute}/spinner`,
    element: <Spinner />,
  },
  {
    path: `${baseRoute}/login`,
    element: <SignIn />,
  },
]);

export default routes;
