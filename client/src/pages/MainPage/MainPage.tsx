import styles from "./MainPage.module.scss";
import React from "react";
import CommonModal from "components/CommonModal/CommonModal";
import MainSlider from "components/MainSlider/MainSlider";
import ThemeProducts from "components/ThemeProducts/ThemeProducts";

const MainPage = () => {
  return (
    <div className={styles.layout}>
      <MainSlider />
      <ThemeProducts
        title="BEST"
        type="highlight"
        description="가장 인기 있는 상품들로 모았어요!"
      />
      <ThemeProducts
        title="TRAND"
        description="일주일동안 인기있는 상품이에요."
      />
      <ThemeProducts title="NEW" description="새로 업데이트 되었어요." />
    </div>
  );
};

export default MainPage;
