import styles from "./MainPage.module.scss";
import React from "react";
import CommonModal from "components/CommonModal/CommonModal";
import MainSlider from "components/MainSlider/MainSlider";

const MainPage = () => {
  return (
    <div className={styles.layout}>
      <MainSlider />
    </div>
  );
};

export default MainPage;
