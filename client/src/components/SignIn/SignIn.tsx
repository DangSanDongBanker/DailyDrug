import styles from "./SignIn.module.scss";
import kakaoImg from "assets/images/kakao_login_large_wide.png";
import { useNavigate } from "react-router";

const SignIn = () => {
  const navigate = useNavigate();

  const clickHandleLogin = () => {
    navigate("/signUp");
  };
  return (
    <>
      <div className={styles.backdrop}>
        <div className={styles.layout}>
          <div className={styles.contents}>
            <div className={styles.logo}>
              <span className={styles.slogan}>꼼꼼하게 비교하자!</span>
              <span className={styles.title}>
                <span className={styles.point}>D</span>
                aily
                <span className={styles.point}>D</span>
                rug
              </span>
            </div>
            <div onClick={clickHandleLogin} className={styles.login}>
              <img src={kakaoImg} alt="카카오로 로그인 버튼" />
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default SignIn;
