import React from "react";
import styles from "./Error.module.scss";
const Error = () => {
  const errorCode = 404;
  const errorMessage = "페이지를 찾을 수 없습니다.";
  return (
    <div className={styles.layout}>
      <div className={styles.errorCodeLayout}>
        <span className={styles.Code}>{errorCode}</span>
        <span>ERR0R</span>
      </div>
      <div className={styles.infoLayout}>
        <span className={styles.errorMessage}>{errorMessage}</span>
        <div className={styles.homeButton}>
          <a href="/">홈화면으로 돌아가기</a>
        </div>
      </div>
    </div>
  );
};

export default Error;
