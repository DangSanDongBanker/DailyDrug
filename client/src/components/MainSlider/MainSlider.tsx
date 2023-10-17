import styles from "./MainSlider.module.scss";
import { useState, useEffect } from "react";

const MainSlider = () => {
  const [slideNumber, setSliceNumber] = useState(1);
  const banner_length = 3;
  useEffect(() => {
    const timer = setInterval(() => {
      setSliceNumber(() => (slideNumber + 1) % banner_length);
    }, 5000); // 3초마다 상태값 변경

    return () => {
      clearInterval(timer); // 컴포넌트 언마운트 시 타이머 정리
    };
  }, []);

  return (
    <div className={styles.layout}>
      <div className={styles.slider}>
        {slideNumber === 0 && <div className={styles.banner_0} />}
        {slideNumber === 1 && <div className={styles.banner_1} />}
        {slideNumber === 2 && <div className={styles.banner_2} />}
      </div>
      <div className={styles.buttons}>
        <button
          className={slideNumber === 0 ? styles.clickedBannerBtn : ""}
          onClick={() => setSliceNumber(0)}
        ></button>
        <button
          className={slideNumber === 1 ? styles.clickedBannerBtn : ""}
          onClick={() => setSliceNumber(1)}
        ></button>
        <button
          className={slideNumber === 2 ? styles.clickedBannerBtn : ""}
          onClick={() => setSliceNumber(2)}
        ></button>
      </div>
    </div>
  );
};
export default MainSlider;
