import styles from "./CommonModal.module.scss";
import React, { ReactNode, FC } from "react";

interface CommonModalProps {
  contents: ReactNode;
  barTitle?: string;
}

const CommonModal: FC<CommonModalProps> = (props) => {
  return (
    <div className={styles.backdrop}>
      <div className={styles.layout}>
        <div className={styles.bar}>{props.barTitle}</div>
        <div className={styles.contents}>{props.contents}</div>
        <div className={styles.buttons}>
          <button>확인</button>
          <button>취소</button>
        </div>
      </div>
    </div>
  );
};

export default CommonModal;
