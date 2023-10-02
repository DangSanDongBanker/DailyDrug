import styles from "./Header.module.scss";
import { Link } from "react-router-dom";
// import expandIcon from "assets/icons/expand_more.svg";

const Header = () => {
  return (
    <div className={styles.layout}>
      <div className={styles.header}>
        <a href={"/"} className={styles.logo}>
          <span className={styles.point}>D</span>aily
          <span className={styles.point}>D</span>rug
        </a>
        <div className={styles.nav}>
          <a href={"/products"} className={styles.category}>
            카테고리
            {/* TODO : 마우스 오버시 카테고리가 띄워짐
						<img src={expandIcon} alt="expand_more" /> */}
          </a>
          <a href={"/compare"} className={styles.category}>
            비교하기
          </a>
        </div>
        <div className={styles.userInfo}>
          <div className={styles.auth}>로그인</div>
        </div>
      </div>
      <div className={styles.bottomLine}></div>
    </div>
  );
};

export default Header;
