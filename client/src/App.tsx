import React, { Suspense } from "react";
import { RecoilRoot } from "recoil";
import { RouterProvider } from "react-router-dom";

import routes from "./routes";

function App() {
  return (
    <div className="App">
      <React.StrictMode>
        <RecoilRoot>
          <Suspense fallback={<div>Loading...</div>}>
            <RouterProvider router={routes} />
          </Suspense>
        </RecoilRoot>
      </React.StrictMode>
    </div>
  );
}

export default App;
