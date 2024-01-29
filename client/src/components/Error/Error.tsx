import React from "react";
import styles from "./Error.module.scss";
import { Link } from "react-router-dom";

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
        <Link to="/" className={styles.homeButton}>
          <span>홈화면으로 돌아가기</span>
        </Link>
      </div>
    </div>
  );
};

export default Error;
