import React, { Suspense } from "react";
import ReactDOM from "react-dom/client";
import { RouterProvider } from "react-router-dom";
import Spinner from "components/Spinner/Spinner";

import "./styles/main.scss";
import routes from "./routes";

const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <React.StrictMode>
    <Suspense fallback={<Spinner />}>
      <RouterProvider router={routes} />
    </Suspense>
  </React.StrictMode>
);
