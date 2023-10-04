import styles from "./SignIn.module.scss";

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
            <button className={styles.login}>카카오로 로그인하기</button>
          </div>
        </div>
      </div>
    </>
  );
};

export default SignIn;
