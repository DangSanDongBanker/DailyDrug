import styles from "./SignIn.module.scss";
import kakaoImg from "assets/images/kakao_login_large_wide.png";

const SignIn = () => {
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
            <button className={styles.login}>
              <img src={kakaoImg} alt="카카오로 로그인 버튼" />
            </button>
          </div>
        </div>
      </div>
    </>
  );
};

export default SignIn;
