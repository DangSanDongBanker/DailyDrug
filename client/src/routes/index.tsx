import { lazy } from "react";
import { createBrowserRouter } from "react-router-dom";
import App from "App";

const MainPage = lazy(() => import("pages/MainPage/MainPage")); // lazy=동적 import
const ErrorPage = lazy(() => import("pages/ErrorPage"));
const Spinner = lazy(() => import("../components/Spinner/Spinner"));
const SignIn = lazy(() => import("../components/SignIn/SignIn"));
const SignUp = lazy(() => import("../components/SignUp/SignUp"));

const baseRoute = process.env.REACT_APP_BASE_ROUTE
  ? process.env.REACT_APP_BASE_ROUTE
  : "";

const routes = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    errorElement: <ErrorPage />,
    children: [
      { index: true, path: "/", element: <MainPage /> },
      //// 테스트용 Router
      {
        path: `${baseRoute}/signIn`,
        element: <SignIn />,
      },
      {
        path: `${baseRoute}/signUp`,
        element: <SignUp />,
      },
      {
        path: `${baseRoute}/spinner`,
        element: <Spinner />,
      },
    ],
  },
]);

export default routes;
