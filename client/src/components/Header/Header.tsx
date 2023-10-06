import styles from "./Header.module.scss";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";

const Header = () => {
  const navigate = useNavigate();
  const [isLogin, setLogin] = useState(false);
  const [userName, setUserName] = useState("정명진");
  const [isClickedProfile, setClickedProfile] = useState(false);

  const clickHandleProfile = () => {
    setClickedProfile(!isClickedProfile);
  };
  const clickHandleLogout = () => {
    console.log("로그아웃");
    setLogin(false);
  };
  const clickHandleLogin = () => {
    navigate("/signIn");
  };

  return (
    <div className={styles.layout}>
      <div className={styles.header}>
        <Link to={"/"} className={styles.logo}>
          <span className={styles.point}>D</span>aily
          <span className={styles.point}>D</span>rug
        </Link>
        <div className={styles.nav}>
          <Link to={"/products"} className={styles.category}>
            카테고리
            {/* TODO : 마우스 오버시 카테고리가 띄워짐
						<img src={expandIcon} alt="expand_more" /> */}
          </Link>
          <Link to={"/compare"} className={styles.category}>
            비교하기
          </Link>
        </div>
        <div className={styles.userInfo}>
          {isLogin === false && (
            <div onClick={clickHandleLogin} className={styles.isLogout}>
              로그인
            </div>
          )}
          {isLogin === true && (
            <div onClick={clickHandleProfile} className={styles.isLogin}>
              {userName} 님,
            </div>
          )}
          {isLogin && isClickedProfile && (
            <div className={styles.dropdown}>
              <Link to="/mypage" className={styles.dropdownMenu}>
                마이페이지
              </Link>
              <div onClick={clickHandleLogout} className={styles.dropdownMenu}>
                로그아웃
              </div>
            </div>
          )}
        </div>
      </div>
      <div className={styles.bottomLine}></div>
    </div>
  );
};

export default Header;
