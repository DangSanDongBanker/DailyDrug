import React, { Suspense } from "react";
import { RecoilRoot } from "recoil";
import { RouterProvider } from "react-router-dom";
import Header from "components/Header/Header";
import Footer from "components/Footer/Footer";
import routes from "./routes";
import styles from "./App.module.scss";

function App() {
  return (
    <div className={styles.App}>
      <React.StrictMode>
        <RecoilRoot>
          <Header />
          <div className={styles.main}>
            <Suspense fallback={<div>Loading...</div>}>
              <RouterProvider router={routes} />
            </Suspense>
          </div>
          <Footer />
        </RecoilRoot>
      </React.StrictMode>
    </div>
  );
}

export default App;
