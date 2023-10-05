import styles from "./Header.module.scss";
import { ReactElement, useState } from "react";

const Header = () => {
  const [isLogin, setLogin] = useState(false);
  const [userName, setUserName] = useState("정명진");
  const [isClickedProfile, setclickedProfile] = useState(false);

  const clickHandleProfile = () => {
    setclickedProfile(!isClickedProfile);
  };

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
          {isLogin === false && <div className={styles.isLogout}>로그인</div>}
          {isLogin === true && (
            <div onClick={clickHandleProfile} className={styles.isLogin}>
              {userName} 님,
            </div>
          )}
          {isLogin && isClickedProfile && (
            <div className={styles.dropdown}>
              <div className={styles.dropdownMenu}>마이페이지</div>
              <div className={styles.dropdownMenu}>로그아웃</div>
            </div>
          )}
        </div>
      </div>
      <div className={styles.bottomLine}></div>
    </div>
  );
};

export default Header;
