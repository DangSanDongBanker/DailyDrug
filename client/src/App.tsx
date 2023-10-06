import React, { Suspense } from "react";
import { RecoilRoot } from "recoil";
import { Outlet } from "react-router-dom";

import Header from "components/Header/Header";
import Footer from "components/Footer/Footer";
import styles from "./App.module.scss";

function App() {
  return (
    <div className={styles.App}>
      <React.StrictMode>
        <RecoilRoot>
          <Header />
          <Outlet />
          <Footer />
        </RecoilRoot>
      </React.StrictMode>
    </div>
  );
}

export default App;
